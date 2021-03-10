package com.jessica.feitosa.aulasjava.aula89.simpledateformat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleDateFormat {

	
	public static void main(String[] args) {
		
	//	SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");
		
		Calendar data = new GregorianCalendar(2010,2,20,14, 32, 25);
		
	//	System.out.println(sdf.format(data.getTime()));
		
		Date hoje = new Date();
		
		//System.out.println(sdf.format(hoje));
		
		//SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
		
		String minhaData = "20/02/2000";
		
		//Date minhaDateEmDate = sdf1.parse(minhaData);
		
	}

	
	
	
	
	
	
	

}
