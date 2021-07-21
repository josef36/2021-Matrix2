package com.example.esercizi;

import java.util.Random;
// EManuele
public class EsercizioTombola {
	public static void main(String[] args) {
		int[] array = new int[90];
		Random rand = new Random();

		int i = 0;
		while (i < array.length) {
			int interoCasuale = rand.nextInt(90);
			interoCasuale += 1;
			boolean contenuto = false;

			for (int j = 0; j < i && contenuto == false; j++) {

				if (interoCasuale == array[j])
					contenuto = true;

			}
			if (contenuto == false)
				
				array[i++] = interoCasuale;
						}

						for (int j = 0; j < array.length; j++)
							System.out.println("Estrazione numero: " + " I numeri estratti sono: " + array[j]);
					}
				}