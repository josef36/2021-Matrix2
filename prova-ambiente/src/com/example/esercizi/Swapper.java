package com.example.esercizi;

public class Swapper {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		System.out.println("x="+x+" y="+y);
		
		// swap delle variabile
		// x = 200;
		// y = 100
		
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("x="+x+" y="+y);
		
		// swap senza terza variabile
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x="+x+" y="+y);
	}
}
