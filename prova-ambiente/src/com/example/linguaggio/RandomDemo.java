package com.example.linguaggio;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		for(int i=0; i<3; i++) {
			System.out.println("Valore generato = "+random.nextInt());
		}
		
		for(int i=0; i<10; i++) {
			System.out.println("Valore generato (max=4) = "+random.nextInt(5));
		}
		
		
	}
}
