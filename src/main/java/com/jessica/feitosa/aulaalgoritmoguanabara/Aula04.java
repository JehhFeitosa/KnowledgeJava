package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

public class Aula04 {
	
	public static void main(String[] args) {
		
//		int a, b, c;
//		
//		a=2;
//		b=3;
//		c=5;
//		System.out.println(a=b);
		
		triangulo();
		
				
	}
	
	
	public static void triangulo() {
	double l1,l2,l3;
	boolean eq, es, tri;
	
	Scanner s = new Scanner(System.in);

	System.out.println("Digite o primeiro lado:  ");
	l1 = s.nextInt();
	System.out.println("Digite o segundo lado:  ");
	l2 = s.nextInt();
	System.out.println("Digite o terceiro lado:  ");
	l3 = s.nextInt();
	
	tri= ((l1<l2+l3) && (l2 < l1 + l3) &&(l3< l1+ l2));
	eq = ((l1==l2) && (l2==l3));
	es = ((l1 !=l2) && (l2!=l3) && (l1!=l3));
	
	System.out.println("O triangulo é  equilatero? " + eq);
	System.out.println("O triangulo e escaleno? " + es);
	System.out.println("Pode formar um triangulo ? " + tri);
	}
	

}
