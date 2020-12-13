package com.jessica.feitosa.testes.ordernar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Teste {
	
	
	public static void ordenaHoras() {

        ArrayList<String> horasList = new ArrayList<String>();
        horasList.add("23:45");
        horasList.add("11:13");
        horasList.add("15:33");
        horasList.add("12:27");
        horasList.add("15:24");

        Collections.sort(horasList, new Comparator<String>() {

           // private SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");

            @Override
            public int compare(String o1, String o2) {
                int result = -1;

//                try {
//                    result = sdf.parse(o1).compareTo(sdf.parse(o2));
//                } catch (ParseException ex) {
//                    ex.printStackTrace();
//                }
                
              //  try {
                    result = o1.compareTo(o2);
               // } catch (ParseException ex) {
             //       ex.printStackTrace();
              //  }

                return result;
            }
        });

        for (String hora: horasList) {
            System.out.println(hora);
        }
    }

}
