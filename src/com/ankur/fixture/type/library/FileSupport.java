package com.ankur.fixture.type.library;

import org.apache.log4j.Logger;

public class FileSupport {
	
	private static final Logger log = Logger
			.getLogger(FileSupport.class.getName());
	
	public FileSupport() {
		log.debug("FileSupport()");
	}
	
	public void createFile(String file){
		log.debug("FileSupport.createFile: "+file);
	}
	
	public void deleteFile(String file){
		log.debug("FileSupport.deleteFile: "+file);
	}
	
	public void print(String msg){
		log.debug("FileSupport.print(): "+msg);
	}
}
