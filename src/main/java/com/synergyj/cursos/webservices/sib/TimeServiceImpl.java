package com.synergyj.cursos.webservices.sib;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.webservices.sei.TimeService;

@WebService(endpointInterface="com.synergyj.cursos.webservices.sei.TimeService")
public class TimeServiceImpl implements TimeService {

	private static final Logger logger = LoggerFactory.getLogger(TimeServiceImpl.class);	
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
	
	public long getDateAsLong() {
		// TODO Auto-generated method stub
		
		Date fecha = new Date();
		logger.debug("Obteniendo fecha como long"+ fecha.getTime());
		
		
		
		return fecha.getTime();
	}

	public String getDateAsString() {
		// TODO Auto-generated method stub
		
		Date fecha = new Date();
		String fechaString = dateFormat.format(fecha);
		logger.debug("obteniendo la fecha: "+ fechaString);
		
		return fechaString;
	}

}
