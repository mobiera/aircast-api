package com.mobiera.ms.mno.aircast.api.util;

import org.jboss.logging.Logger;

import com.mobiera.aircast.commons.enums.AppletImpl;

public class BrowserUtil {

	private static final Logger logger = Logger.getLogger(BrowserUtil.class);

	
	
	public static boolean isBlacklistedBrowser(String disabled, AppletImpl impl, Short browserVersion, boolean debug) {
		if (disabled != null) {
			String[] blacklisted = disabled.split(",");
			for (String current: blacklisted) {
				if ((current != null) && (current.strip().length() > 0)) {
					String[] details = current.split(":");
					if (details != null) {
						if (details.length>0) {
							try {

								AppletImpl currentImpl = AppletImpl.getEnum(Integer.parseInt(details[0]));
								if (currentImpl != null) {
									if (currentImpl.equals(impl)) {
										if (details.length>1) {
											try {
												Short ver = Short.parseShort(details[1]);
												
													if ((browserVersion == null) || ver.equals(browserVersion)) {
														if (debug) {
															logger.info("isBlacklistedBrowser: yes " + currentImpl + " " + ver);
														}
														return true;
													}
												
											}
											 catch (Exception e) {
												// blacklist full impl
												if (debug) {
													logger.info("isBlacklistedBrowser: yes " + currentImpl );
												}
												return true;
											}
										} else {
											if (debug) {
												logger.info("isBlacklistedBrowser: yes " + currentImpl );
											}
											// blacklist full impl
											return true;
										}
										
										
									}
								}
							} catch (Exception e) {
								logger.warn("isBlacklistedBrowser: unparsable string: " + details);
							}
							
						}
					}
				}
			}
		}
		return false;
	}
	
	public static String buildSimQueryExclusion(String disabled, boolean debug, String simName) {
		//"AND NOT ( (sim.stk_impl='1' and sim.browser_version='0') OR  (sim.stk_impl='1' and sim.browser_version='0') ) "
		StringBuffer query = new StringBuffer();
		
		
		int count = 0;
		if (disabled != null) {
			String[] blacklisted = disabled.split(",");
			for (String current: blacklisted) {
				if (current != null) {
					String[] details = current.split(":");
					if (details != null) {
						if (details.length>0) {
							AppletImpl currentImpl = AppletImpl.getEnum(Integer.parseInt(details[0]));
							if (currentImpl != null) {
								
									if (details.length>1) {
										Short ver = Short.parseShort(details[1]);
										if (ver != null) {
											if (count >0) {
												query.append(" OR ");
											} else {
												query.append(" NOT (");
											}
											query.append("((");
											query.append(simName);
											query.append(".stk_impl='");
											
											
											query.append(details[0]);
											query.append("') and ((");
											query.append(simName);
											query.append(".browser_version='");
											query.append(details[1]);
											query.append("') OR (");
											query.append(simName);
											query.append(".browser_version IS NULL ))) ");
											
											count++;
										} else {
											if (count >0) {
												query.append(" OR ");
											}
											query.append("(");
											query.append(simName);
											query.append(".stk_impl='");
											query.append(details[0]);
											query.append("')");
											count++;
										}
									} else {
										if (count >0) {
											query.append(" OR ");
										}
										query.append("(");
										query.append(simName);
										query.append(".stk_impl='");
										query.append(details[0]);
										query.append("')");
										count++;
									}
									
									
								
							}
						}
					}
				}
			}
		}
		if (count > 0) {
			query.append(") ");
		}
		
		
		return query.toString();
		
		
	}
	
}
