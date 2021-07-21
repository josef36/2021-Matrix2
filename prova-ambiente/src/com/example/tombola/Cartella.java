package com.example.tombola;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Le cartelle sono formate da 3 file orizzontali contenenti 9 caselle; in ogni
 * riga solo 5 caselle sono occupate dai numeri e 4 restano vuote; devono essere
 * presenti 5 numeri per riga per un totale di 15 numeri.
 *
 * I numeri della cartella devono essere tutti diversi, senza ripetizioni, e
 * disposti a colonne per decine: nella prima colonna i numeri dall'1 al 9,
 * nella seconda colonna i numeri dal 10 al 19, nella terza colonna i numeri dal
 * 20 al 29, nella quarta colonna i numeri dal 30 al 39, nella quinta colonna i
 * numeri dal 40 al 49, nella sesta colonna i numeri dal 50 al 59, nella settima
 * colonna i numeri dal 60 al 69, nell'ottava colonna i numeri dal 70 al 79,
 * nella nona colonna i numeri dall'80 al 90.
 *
 * Quando tutte le caselline con i numeri (sempre diversi per ogni cartella)
 * vengono oscurate il giocatore ha fatto "tombola" e acquista il premio finale.
 * Oltre alla tombola è possibile anche decidere dei premi minori che si
 * acquisiscono facendo ambo (due numeri sulla stessa riga) terno (tre numeri
 * sulla stessa riga) quaterna (quattro numeri sulla stessa riga) e cinquina
 * (cinque numeri sulla stessa riga).
 * 
 * @author paolo
 *
 */
public class Cartella {
	private static final int RIGHE_CARTELLA = 3;

	private static final int COLONNE_CARTELLA = 9;

	private static final int MAX_NUM_PER_RIGA = 5;

	private Integer[][] numeri = new Integer[RIGHE_CARTELLA][COLONNE_CARTELLA];

	private Random random = new Random();

	public Cartella() {
		init();
	}

	private void init() {
		for (int i = 0; i < RIGHE_CARTELLA; i++) {
			riempiRiga(i);
		}
	}

	private void riempiRiga(int row) {
		for (int i = 0; i < MAX_NUM_PER_RIGA; i++) {
			Integer estratto = random.nextInt(90);
			Integer columnIndex = generateColumnIndex(estratto);
			estratto++;
			while (numeri[row][columnIndex] != null || !numeroGiaEstratto(estratto)) {
				estratto = random.nextInt(90);
				columnIndex = generateColumnIndex(estratto);
			}
			numeri[row][columnIndex] = estratto;
		}
	}

	private Set<Integer> estratti = new HashSet<>();

	private boolean numeroGiaEstratto(Integer estratto) {
		return estratti.add(estratto);
	}

	private Integer generateColumnIndex(Integer estratto) {
		if (estratto < 10) {
			return 0;
		}
		int index = estratto / 10;
		if (index > 8) {
			index = 8;
		}
		return index;
	}

	private static final String delimiter = "----------------------------\n";

	public String toString() {
		StringBuilder sb = new StringBuilder(delimiter);
		for (Integer[] row : numeri) {
			sb.append('|');
			for (Integer numero : row) {
				if (numero == null) {
					sb.append("  |");
					continue;
				}
				if (numero < 10) {
					sb.append(' ').append(numero).append('|');
					continue;
				}
				sb.append(numero).append('|');
			}
			sb.append('\n');
		}
		sb.append(delimiter);
		return sb.toString();
	}

}
