package com.mobiera.ms.mno.aircast.api.util;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Paths;
import java.time.Instant;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.jboss.logging.Logger;

public class LuceneUtil {
	
	private static LuceneUtil instance = null;
	private static Logger logger = Logger.getLogger(LuceneUtil.class);
	
	
	public static LuceneUtil getInstance() {
		if (instance == null) instance = new LuceneUtil();
		return instance;
	}

	
	public void removeFileIndex(String path) {
		String indexLocation = path + ".index";
		File indexFile = new File(indexLocation);
		if ((indexFile.exists()) && (indexFile.isDirectory())) {
			FileUtil.getInstance().deleteDirectory(indexFile);
		}
		
	}

	
	
	public void createFileIndex(String path) throws IOException, ParseException {

		File file = new File(path);
		String indexLocation = path + ".index";
		File indexFile = new File(indexLocation);
		Analyzer analyzer = new StandardAnalyzer();
		Directory index = null;

		if (!indexFile.isDirectory()) {

			index = FSDirectory.open(Paths.get(indexLocation));
			IndexWriterConfig config = new IndexWriterConfig(analyzer);
			config.setOpenMode(OpenMode.CREATE);

			IndexWriter w = new IndexWriter(index, config);
			RandomAccessFile raf = new RandomAccessFile(file, "r");

			String currentMsisdn = raf.readLine();
			int i = 0;
			while (currentMsisdn != null) {
				Document doc = new Document();
				doc.add(new TextField("msisdn", currentMsisdn, Field.Store.YES));
				w.addDocument(doc);
				currentMsisdn = raf.readLine();
				i++;
				if (i%1000 == 0) {
					logger.info("createFileIndex: processed: " + i);
				}
			}
			w.forceMerge(1);
			w.close();
			raf.close();
		}
	}

	public boolean isMsisdnPresentInFile(String path, String msisdn) throws IOException, ParseException  {
		
		boolean retval = false;
		Analyzer analyzer = new StandardAnalyzer();
		String indexLocation = path + ".index";
		Directory index = FSDirectory.open(Paths.get(indexLocation));
		IndexReader reader = DirectoryReader.open(index);
		int hitsPerPage = 1;
		IndexSearcher searcher = new IndexSearcher(reader);

		Query q = new QueryParser("msisdn", analyzer).parse(msisdn);

		TopScoreDocCollector collector = TopScoreDocCollector.create(hitsPerPage, 1);
		searcher.search(q, collector);
		ScoreDoc[] hits = collector.topDocs().scoreDocs;
		if (hits.length>0) retval = true;

		reader.close();
		return retval;
	}

	public static void main(String[] args) throws IOException, ParseException {
		// 0. Specify the analyzer for tokenizing text.
		//    The same analyzer should be used for indexing and searching

		File file = new File("/tmp/mytel.campaign.list");

		String indexLocation = "/tmp/mytel.campaign.list.index";

		File indexFile = new File("/tmp/mytel.campaign.list.index");
		// 1. create the index



		Analyzer analyzer = new StandardAnalyzer();
		Directory index = null;



		if (!indexFile.isDirectory()) {

			index = FSDirectory.open(Paths.get(indexLocation));
			IndexWriterConfig config = new IndexWriterConfig(analyzer);
			config.setOpenMode(OpenMode.CREATE);

			IndexWriter w = new IndexWriter(index, config);
			RandomAccessFile raf = new RandomAccessFile(file, "r");

			String currentMsisdn = raf.readLine();
			while (currentMsisdn != null) {
				Document doc = new Document();
				doc.add(new TextField("msisdn", currentMsisdn, Field.Store.YES));
				w.addDocument(doc);
				currentMsisdn = raf.readLine();
			}
			w.forceMerge(1);
			w.close();
			raf.close();

		} else {
			index = FSDirectory.open(Paths.get(indexLocation));
		}



		IndexReader reader = DirectoryReader.open(index);
		int hitsPerPage = 1;
		IndexSearcher searcher = new IndexSearcher(reader);

		String[] msisdns = {"959680307270", "959683410050", "959681190647", "95968119064", "15968119064"};
		for (String msisdn: msisdns) {
			// 2. query

			// the "title" arg specifies the default field to use
			// when no field is explicitly specified in the query.
			Query q = new QueryParser("msisdn", analyzer).parse(msisdn);

			// 3. search
			TopScoreDocCollector collector = TopScoreDocCollector.create(1, 1);
			searcher.search(q, collector);
			ScoreDoc[] hits = collector.topDocs().scoreDocs;

			// 4. display results
			System.out.println("Found " + hits.length + " hits.");
			System.out.println(Instant.now());
			for(int i=0;i<hits.length;++i) {
				int docId = hits[i].doc;
				Document d = searcher.doc(docId);
				System.out.println((i + 1) + ". " + d.get("msisdn"));
			}
		}


		// reader can only be closed when there
		// is no need to access the documents any more.
		reader.close();

	}

}