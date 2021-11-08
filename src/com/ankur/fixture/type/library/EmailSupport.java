package com.ankur.fixture.type.library;

import org.apache.log4j.Logger;


public class EmailSupport {
	

	private static final Logger log = Logger
			.getLogger(EmailSupport.class.getName());
	
	public EmailSupport() {
		log.debug("EmailSupport()");
	}

	public void checkEmail(String email){
		log.debug("EmailSupport.checkEmail: "+email);
	}
	
	public void deleteEmail(String email){
		log.debug("EmailSupport.deleteEmail: "+email);
	}
	
	public void print(String msg){
		log.debug("EmailSupport.print(): "+msg);
	}
	
}
