package com.example.tombola;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TombolaMain {
	private static final Logger log = LogManager.getLogger(TombolaMain.class);

	public static void main(String[] args) {
		Tombola tombola = new Tombola();
		for(int i=0; i<90; i++) {
			if(i%20 == 0 && i > 0) { // ogni 20 numeri estratti
				log.debug(tombola.tabellone());
			}
			log.trace("Estratto "+tombola.estrai());
		}
		log.info(tombola.tabellone());
	}
}
