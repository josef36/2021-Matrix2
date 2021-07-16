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
		for(double valore : array) {
			somma += valore;
		}
		System.out.println("La somma è: "+somma);
		
		somma = 0;
		for(int i=1; i<array.length; i+=2) {
			somma += array[i];
		}
		System.out.println("La somma degli elementi dispari è: "+somma);
	}
}
