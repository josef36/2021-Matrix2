package com.example.tombola;

import java.util.Random;

import com.example.tombola.matrici.OrganizzazioneMatrice;
import com.example.tombola.matrici.OrganizzazioneMatriceUtility;

/**
 * Crea un tabellone della tombola
 * Metodi:
 * Costruttore => inizializzare
 * Integer estrai()
 * void reset()
 * String tabellone()
 * @author corso
 *
 */
public class Tombola {
	
	
	private static final int COLONNE_TABELLONE = 10; 
	private static final int RIGHE_TABELLONE = 9; 
	private static final int DIMENSIONE_TOMBOLA = RIGHE_TABELLONE*COLONNE_TABELLONE; 
	private Integer [][] estrazioni = null;
	
	private Integer indiceOrdineDiEstrazione = 0;
	private Integer [] estrazioniInOrdineDiEstrazione = null;
	
	private OrganizzazioneMatriceUtility utility = OrganizzazioneMatriceUtility.createUtility(OrganizzazioneMatrice.ROW_MAJOR);
	
	public Tombola()  {
		this.init();
	}
	
	private void init() {
		this.estrazioni = new Integer[RIGHE_TABELLONE][COLONNE_TABELLONE];
		for(int i=0; i<RIGHE_TABELLONE; i++) {
			for(int j=0; j<COLONNE_TABELLONE; j++) {
				estrazioni[i][j] = 0;
			}
		}
		this.indiceOrdineDiEstrazione = 0;
		this.estrazioniInOrdineDiEstrazione = new Integer[DIMENSIONE_TOMBOLA];
	}
	
	public void reset() {
		this.init();
	}
	
	private Random random = new Random();
	public Integer estrai() {
		int estratto = random.nextInt(DIMENSIONE_TOMBOLA) + 1;
		int index = estratto - 1;
		int [] rowColumn = this.utility.getRowColumnFromIndexV1(index, RIGHE_TABELLONE, COLONNE_TABELLONE);
		int row = rowColumn[0];
		int column = rowColumn[1];
		while(this.estrazioni[row][column] != 0) {
			estratto = random.nextInt(DIMENSIONE_TOMBOLA) + 1;
			index = estratto - 1;
			rowColumn = this.utility.getRowColumnFromIndexV1(index, RIGHE_TABELLONE, COLONNE_TABELLONE);
			row = rowColumn[0];
			column = rowColumn[1];
		}
		estrazioni[row][column] = estratto;
		estrazioniInOrdineDiEstrazione[indiceOrdineDiEstrazione++] = estratto;
		return estratto;
	}

	private static final String separatore = "+--+--+--+--+--+--+--+--+--+--+\n";
	public String tabellone() {
		// newline ==> '\n'
		StringBuilder sb = new StringBuilder('\n'); // StringBuffer()
		sb.append(separatore);
		for(Integer[] row : estrazioni) {
			for(Integer elemento : row) {
				sb.append('|');
				if(elemento < 10) {
					sb.append(' ');
					sb.append( elemento > 0 ? elemento : " " );
				} else {
					sb.append(elemento);
				}
			}
			sb.append('|').append('\n');
			sb.append(separatore);
		}
		return sb.toString();
	}
	
	
}
