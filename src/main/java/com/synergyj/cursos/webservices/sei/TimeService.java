package com.synergyj.cursos.webservices.sei;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService   //es un webservices
@SOAPBinding(style=Style.RPC) //tipo de soap
public interface TimeService {
	
	/**
	 * obtiene la fecha como formato long
	 * 
	 */
	@WebMethod //para decir que esta disponible
	long getDateAsLong();
	
	/**
	 * obtiene las fecha en formato  String(dd/mm/yyyy)
	 */
	@WebMethod //para decir qeu esta dispnible
	String getDateAsString();

}
