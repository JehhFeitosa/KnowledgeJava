package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

public class Aula12Fibonacci {
	static int c;
	static int t1;
	static int t2;
	static int t3;
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		t1=0;
		t2=1;
				for (int c = 3; c < 10; c++) {
					proxFibonacci(t1, t2);
					
				}
		
	}
	
	public static void proxFibonacci(int a, int b) {
		c= a+b;
		System.out.println(c);
		a = b;
		b = c;
		
	}

}
