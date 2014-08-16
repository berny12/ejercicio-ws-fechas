package com.synergyj.cursos.webservices.lab1;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.webservices.sib.TimeServiceImpl;

public class TimeServicePublisher {
	
	
	private static final Logger logger = LoggerFactory.getLogger(TimeServicePublisher.class);
	
	public static void main (String[] args){
		
		String url = "http://127.0.0.1:9897/timeServices?wsdl";
		logger.debug("Publicando el web services en :" + url);
		Endpoint.publish(url, new TimeServiceImpl());
		
	}

}
