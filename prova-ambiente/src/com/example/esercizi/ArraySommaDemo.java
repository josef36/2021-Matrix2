package com.example.esercizi;

import java.util.Random;

public class ArraySommaDemo {

	// 1) generare un array di 5 posizioni double
	// 2) inizializzare l'array a valori random double moltiplicati per 1000
	// 3) stampare la somma dei valori contenuti negli elementi
	
	public static void main(String[] args) {
		Random random = new Random();
		double [] array = new double[5];
		
		for(int i=0; i<array.length; i++) {
			array[i] = random.nextDouble() * 1000;
		}
		
		double somma = 0;
		for(double valore : array) { // forEach
			somma += valore;
		}
		System.out.println("La somma è: "+somma);
		
		somma = 0;
		for(int i=1; i<array.length; i+=2) {
			somma += array[i];
		}
		System.out.println("La somma degli elementi a indice dispari è: "+somma);
		
		somma = 0;
		double sommaPari = 0;
		for(int i=0; i<array.length; i++) {
			// trovare condizioni di scarto => buttare tutti gli indici pari
			if( i % 2 != 0 ) /* then */ {
				somma += array[i]; // true
			} else {
				sommaPari += array[i]; // false
			}
		}
		System.out.println("La somma degli elementi a indice dispari è: "+somma);
		System.out.println("La somma degli elementi a indice pari è: "+sommaPari);
		
		int i=0;
		while( i<array.length ) {
			System.out.println(i+") "+array[i]);
			i++; // incremento di fine ciclo
		}
		
		
		
	}
}
