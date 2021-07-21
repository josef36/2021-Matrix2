package com.example.linguaggio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListDemo {

	public static void main(String[] args) {
		Random rnd = new Random();
		List<Integer> lista = new ArrayList<>();

		System.out.println("numero elementi in lista è "+lista.size());
		for(Integer i=0; i<1000; i++) {
			lista.add(rnd.nextInt());
			System.out.println("numero elementi in lista è "+lista.size());
		}
		System.out.println("numero elementi in lista alla fine è "+lista.size());
		
	}

}
