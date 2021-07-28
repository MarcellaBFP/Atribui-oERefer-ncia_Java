package com.projeto.atribuicaoreferencia;

public class Main{
	public static void main(String[] args) {
		int intA = 1;
		int intB = intA;
		System.out.println("intA=" +intA+  " intB=" +intB);
		intA = 2;
		System.out.println("intA=" +intA+ " intB=" +intB);
		
		MeuObj objA = new MeuObj(intA= 1);
		MeuObj objB = objA;
		
		System.out.println("objA=" +intA+ " objB=" +intB);
		objA.setNum(2);
		System.out.println("objA=" +objA+ " objB=" + objB);		
		
	}

}
