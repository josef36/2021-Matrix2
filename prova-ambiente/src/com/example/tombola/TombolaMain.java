package com.example.tombola;

public class TombolaMain {

	public static void main(String[] args) {
		Tombola tombola = new Tombola();
		for(int i=0; i<90; i++) {
			if(i%20 == 0 && i > 0) { // ogni 20 numeri estratti
				System.out.println(tombola.tabellone());
			}
			System.out.println("Estratto "+tombola.estrai());
		}
		System.out.println(tombola.tabellone());
	}

}
