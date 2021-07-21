package com.example.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.tombola.Cartella;

class CartellaTests {

	@Test
	void createCartellaTest() {
		for(int i=0; i< 5; i++) {
			Cartella c = new Cartella();
			System.out.println(c.toString());
		}
	}

}
