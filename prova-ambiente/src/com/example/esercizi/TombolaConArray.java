package com.example.esercizi;

import java.util.Random;

public class TombolaConArray {

	// 1) array di 90 elementi (sacchetto dei numeri) che contiene 
	//	  valori da 1 a 90
	// 2) effettuare 90 estrazioni casuali in modo da estrarre tutti i
	//    numeri della tombola
	// vincolo) 1 numero non può essere estratto 2 volte
	
	private static final int DIMENSIONE_TOMBOLA = 90; // costante
	
	public static void main(String[] args) {
		Random random = new Random();
		int[] numeriEstratti = new int[DIMENSIONE_TOMBOLA];
		int indiceNumeriEstratti = 0;
	
		// SISTEMA 1
		// condizioni iniziale => array numeriEstratti tutti uguali a zero.
		for(int i=0; i<DIMENSIONE_TOMBOLA; i++) { // generare DIMENSIONE_TOMBOLA numeri diversi
			int estratto = random.nextInt(DIMENSIONE_TOMBOLA);
			// il numero è già stato estratto? ==> numeriEstratti[estratto] diverso da zero
			// no => il numero è valido, 
			//		memorizza il numero in numeriEstratti ==> numeriEstratti[estratto] = estratto
			//		saltare al ciclo successivo
			// si => genero un nuovo numero sino a che non è un numero valido
			//		memorizza il numero in numeriEstratti
			//		saltare al ciclo successivo
		}
		
		// SISTEMA 2
		for(int i=0; i<DIMENSIONE_TOMBOLA; i++) {
			numeriEstratti[i] = i + 1;
		}
		
		for(int i=0; i<DIMENSIONE_TOMBOLA; i++) { // generare DIMENSIONE_TOMBOLA numeri diversi
			int estratto = random.nextInt(DIMENSIONE_TOMBOLA);
			// il numero è già stato estratto? == while(numeriEstratti[estratto] == 0)
			// no => il numero è valido, 
			//		numeroValido = numeriEstratti[estratto]
			//		numeriEstratti[estratto] = 0;
			//		saltare al ciclo successivo
			// si => genero un nuovo numero sino a che non è un numero valido
			//		numeroValido = numeriEstratti[estratto]
			//		numeriEstratti[estratto] = 0;
			//		saltare al ciclo successivo
		}
		
		// SISTEMA 3
		for(int i=0; i<DIMENSIONE_TOMBOLA; i++) { // generare DIMENSIONE_TOMBOLA numeri diversi
			int estratto = random.nextInt(DIMENSIONE_TOMBOLA);
			// for(int j=0; j<i; j++) 
			//	while(i<90 && numeriEstratti[i++] == estratto) 
			//		genero un nuovo numero
			// 		ripeto il for di controllo
			//  else
			//		numeriEstratti[i] = estratto
			//		salto al ciclo successivo
		}
	}
	
	private static boolean numeroGiaPresente(int [] array, int numero) {
		for(int elemento: array) {
			if(numero == elemento) {
				return true;
			}
		}
		return false;
	}
}




