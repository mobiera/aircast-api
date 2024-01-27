package com.mobiera.ms.mno.aircast.api.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.jboss.logging.Logger;

import com.mobiera.commons.tuple.Triple;


public class FileUtil {
	private static FileUtil instance = null;
	private static Logger logger = Logger.getLogger(FileUtil.class);
	private static final int BUFFER_SIZE = 1048576;

	public static FileUtil getInstance() {
		if (instance == null) instance = new FileUtil();
		return instance;
	}

	
    private long copy(InputStream input, OutputStream output)
            throws IOException {
        byte[] buffer = new byte[BUFFER_SIZE];
        long count = 0;
        int n = 0;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
            count += n;
        }
        return count;
    }

    public void closeQuietly(Closeable output) {
        try {
            if (output != null) {
                output.close();
            }
        } catch (IOException ioe) {
            logger.error("closeQuietly: unable to close file " + ioe);
        }
    }
	
    public void joinFiles(File destination, File[] sources)
            throws IOException {
        OutputStream output = null;
        try {
            output = createAppendableStream(destination);
            for (File source : sources) {
                appendFile(output, source);
            }
        } finally {
            closeQuietly(output);
        }
    }

    
    
    public BufferedOutputStream createAppendableStream(File destination)
            throws FileNotFoundException {
        return new BufferedOutputStream(new FileOutputStream(destination, true));
    }

    public void appendFile(OutputStream output, File source)
            throws IOException {
        InputStream input = null;
        try {
            input = new BufferedInputStream(new FileInputStream(source));
            copy(input, output);
            
        } finally {
            closeQuietly(input);
        }
    }
    
    
    public String[] splitLine(String line, String separator) {
		
		char sep = separator.charAt(0);
		
		List<String> tokensList = new ArrayList<String>();
		boolean inQuotes = false;
		StringBuilder b = new StringBuilder();
		for (char c : line.toCharArray()) {
			
			if (c == sep) {
				if (inQuotes) {
		            b.append(c);
		        } else {
		            tokensList.add(b.toString());
		            b = new StringBuilder();
		        }
			} else if (c == '\"') {
				inQuotes = !inQuotes;
			} else {
				 b.append(c);
			}
			
		    
		}
		tokensList.add(b.toString());
		return tokensList.toArray(new String[0]);
	}
    
    
    /*
     * CR LF
     */
    
    
    
    
    public boolean isAdvertisingCampaigns(File file, String separator) throws IOException {
    	BufferedReader reader = new BufferedReader(new FileReader(
				file, StandardCharsets.UTF_8));
		String line = reader.readLine();
		logger.info("isAdvertisingCampaigns: line: " + line);
		boolean retval = false;
		//int i=1;
		if (line != null) {
			String[] splitted = splitLine(line, separator);
			if (splitted.length>1) {
				String s2 = splitted[1];
				if (s2 != null) {
					logger.info("isAdvertisingCampaigns: " + s2);
					if (s2.toUpperCase().equals("TEXTAD")) retval = true;
					else if (s2.toUpperCase().equals("CALLAD")) retval = true;
					else if (s2.toUpperCase().equals("MENUAD")) retval = true;
					else if (s2.toUpperCase().equals("USSDAD")) retval = true;
					else if (s2.toUpperCase().equals("URLAD")) retval = true;
					else if (s2.toUpperCase().equals("MOAD")) retval = true;
					else if (s2.toUpperCase().equals("SCHEDULE")) retval = true;
					else if (s2.toUpperCase().equals("CREATEORUPDATE")) retval = true;
					else if (s2.toUpperCase().equals("CREATEORUPDATESMS")) retval = true;
					logger.info("isAdvertisingCampaigns: " + s2 + " retval " + retval) ;
				}
			}
			
		}
		reader.close();
		return retval;
    }
    
    
    public String getIfHasHeader(File file) throws IOException {
    	BufferedReader reader = new BufferedReader(new FileReader(
				file, StandardCharsets.UTF_8));
		String header = null;
		String line = reader.readLine();
		//int i=1;
		if (line != null) {
			if (line.toUpperCase().startsWith("MSISDN")) {
				// header
				header = line;
				
			}
		}
		reader.close();
		return header;
    }
    
    public Triple<Integer, Integer, String> createCleanMsisdnFile(File fromFile, File toFile, int minMsisdnLength, int maxMsisnLength, String separator) throws IOException {
    	BufferedWriter output;
    	BufferedReader reader;
    	int unparsableMsisdns = 0;
    	String header = null;
    	int lines = 0;
		
			reader = new BufferedReader(new FileReader(
					fromFile, StandardCharsets.UTF_8));
			output = new BufferedWriter(new FileWriter(
					toFile, StandardCharsets.UTF_8));
			String line = reader.readLine();
			//int i=1;
			if (line != null) {
				if (line.toUpperCase().startsWith("MSISDN")) {
					// header
					header = line;
					line = reader.readLine();
				}
			}
			while (line != null) {
				lines++;
				if (header != null) {
					
					String[] data = line.split(separator, 2);
					if (data.length>0) {
						String msisdn = data[0];
						if (this.validateMsisdn(msisdn, minMsisdnLength, maxMsisnLength)) {
							output.write(line);
							output.newLine();
						} else {
							unparsableMsisdns++;
						}
					} else {
						unparsableMsisdns++;
					}
					
				} else {
					if (this.validateMsisdn(line, minMsisdnLength, maxMsisnLength)) {
						output.write(line);
						output.newLine();
					} else {
						unparsableMsisdns++;
					}
				}
				
				
				/*System.out.println(line);
				System.out.println(ISOUtil.hexString(line.getBytes()));*/
				line = reader.readLine();
				/*if ( (i % 100) == 0) {
					logger.info(i);
				}*/
			}
			output.flush();
			output.close();
			reader.close();
		
			return new Triple<Integer, Integer, String>(lines, unparsableMsisdns, header);
		
	}
    
    public boolean validateMsisdn(String msisdn, int minLength, int maxLength) {
		if (!msisdn.matches("\\d{2,15}")) {
			return false;
		}
		if (msisdn.length() < minLength) {
			return false;
		}
		if (msisdn.length() > maxLength) {
			return false;
		}
		return true;
	}
    
    public static void main(String args[]) throws ExecuteException, IOException, InterruptedException {
    	
    	// TEST REMOVING Windoze CR
    	// 1. clean files
    	System.out.println(Instant.now());
    	File from = new File("/tmp/mytel.whitelist");
    	File to = new File("/tmp/mytel.whitelist.clean");
    	/*getInstance().createCleanMsisdnFile(from, to);
    	
    	from = new File("/tmp/mytel.blacklist");
    	to = new File("/tmp/mytel.blacklist.clean");
    	getInstance().createCleanMsisdnFile(from, to);*/
    	
    	//String sortPath = "/usr/bin/sort";
		//FileUtil.getInstance().runScript(sortPath + " -u -o " + to.getAbsolutePath() + ".sorted " + to.getAbsolutePath());
	
    	String commPath = "/usr/bin/comm";
    	
		int retval = FileUtil.getInstance().runScript(commPath + " -23 " + " /tmp/mytel.whitelist.clean.sorted " + " " + " /tmp/mytel.blacklist.sorted " + " > " + " /tmp/mytel.clist");
		System.out.println(retval);
		//String commPath = "/bin/bash -c \"ls \" " + " > /tmp/uche";
		//FileUtil.getInstance().runScript(commPath );
		
    	System.out.println(Instant.now());
    	/*
    	getInstance().runScript("bash /tmp/prepare_lists.sh /tmp/mytel.whitelist /tmp/mytel.blacklist /tmp/mytel.campaign.list");
    	System.out.println(Instant.now());*/
    }
	
    
    public int runCommand(String command) throws ExecuteException, IOException{
        CommandLine oCmdLine = CommandLine.parse(command);
        DefaultExecutor oDefaultExecutor = new DefaultExecutor();
        oDefaultExecutor.setExitValue(0);
        return oDefaultExecutor.execute(oCmdLine);
        
        
       
        
    }
    
    
    public int runScript(String command) throws ExecuteException, IOException, InterruptedException{
    	
    	List<String> commands = new ArrayList<String>();
        commands.add("/bin/bash");
        commands.add("-c");
        commands.add(command);

        ProcessBuilder pb = new ProcessBuilder(commands);
		Process process = pb.start();
		process.waitFor();
		
		return process.exitValue();
    }
    
    public boolean deleteDirectory(File directoryToBeDeleted) {
	    File[] allContents = directoryToBeDeleted.listFiles();
	    if (allContents != null) {
	        for (File file : allContents) {
	            deleteDirectory(file);
	        }
	    }
	    return directoryToBeDeleted.delete();
	}
    
    public long countFileLines(String fileName) {

	      long lines = 0;
	      try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	          while (reader.readLine() != null) lines++;
	      } catch (IOException e) {
	          logger.error("", e);
	      }
	      return lines;

	  }
	
    
}
