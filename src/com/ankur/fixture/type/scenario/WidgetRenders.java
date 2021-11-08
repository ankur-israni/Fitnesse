package com.ankur.fixture.type.scenario;

import org.apache.log4j.Logger;


public class WidgetRenders {
	
	private String wikiText;
	private String htmlText;
	
	
	
	public String getWikiText() {
		log.debug("getWikiText()");
		return wikiText;
	}

	public String getHtmlText() {
		log.debug("getHtmlText()");
		return htmlText;
	}

	private static final Logger log = Logger
			.getLogger(WidgetRenders.class.getName());

	
	public WidgetRenders(){
		log.debug("WidgetRenders()");
	}

	public void setWikiText(String wikiText) {
		log.debug("setWikiText()");
		this.wikiText = wikiText;
	}

	public void setHtmlText(String htmlText) {
		log.debug("setHtmlText()");
		this.htmlText = htmlText;
	}

	public String italicWidget(){
		log.debug("italicWidget()");
		return "it";
	}

	public String boldWidget(){
		log.debug("boldWidget()");
		return "bo";
	}
	
	public int responseCode(){
		if(wikiText.contains("italic")) return 200;
		else if(wikiText.contains("bold")) return 300;
		return 404;
	}
	
}
