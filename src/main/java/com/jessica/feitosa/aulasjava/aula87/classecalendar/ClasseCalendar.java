package com.jessica.feitosa.aulasjava.aula87.classecalendar;

import java.util.Calendar;

public class ClasseCalendar {

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance(); //singleton;
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d" , dia, (mes+1), ano, hora, minutos, segundos);
		System.out.printf("%d-%d ", ano, (mes+1));
	}

}
