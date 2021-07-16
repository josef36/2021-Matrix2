package com.example.linguaggio;

public class Variabili {
	
	// int, long, char, byte, float, double, boolean 
	// String => classe
	private int valore = 0; // di stato, di istanza
	
	private void do01() {
		valore = valore + 1;
	}
	
	private void do02() {
		valore = valore - 10;
	}
	
	private void stampa() {
		System.out.println("Valore="+valore);
	}
	
	public static void main(String[] args) {
		Variabili v = new Variabili();
		
		v.do01();
		v.stampa();
		
		v.do02();
		v.stampa();
		
		var yy = (float) 800.98;
	}

}
