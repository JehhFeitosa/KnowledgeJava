package com.jessica.feitosa.calendar;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Calendar {


	public static void main(String[] args) {

	
}

	public String mesEAno() {
		SimpleDateFormat df = new SimpleDateFormat("YYYY-MM");
	Date dt = new Date();
//	Calendar cl = Calendar.getInstance();
	//cl.setTime(dt);
	//dt = cl.getTime();
	String mesEAno = df.format(dt);

	return mesEAno;
}
	
}
