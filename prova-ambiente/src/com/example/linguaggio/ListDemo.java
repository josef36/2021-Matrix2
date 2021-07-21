package com.example.linguaggio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ListDemo {

	private static final Logger log = LogManager.getLogger(ListDemo.class);

	public static void main(String[] args) {
		Random rnd = new Random();
		List<Integer> lista = new ArrayList<>();

		log.debug("numero elementi in lista è {}", lista.size());
		for (Integer i = 0; i < 1000; i++) {
			int generato = rnd.nextInt();
			lista.add(generato);
			log.debug("numero generato {} numero elementi in lista è {}", generato, lista.size());
		}
		log.info("numero elementi in lista alla fine è {}", lista.size());
		if (lista.size() <= 0) {
			log.fatal("Problemi con l'implementazione di List abort...");
			throw new RuntimeException("List implementation not working");
		}
	}
}
