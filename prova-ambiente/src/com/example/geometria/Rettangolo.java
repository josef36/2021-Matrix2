package com.example.geometria;

public class Rettangolo extends FormaGeometrica {

	private double base = 0;
	private double altezza;
	
	/**
	 * Costruttore per la classe rettangolo
	 * @param base rappresenta la base del rettangolo
	 * @param altezza rappresenta l'altezza del rettangolo
	 */
	public Rettangolo(double base, double altezza) { // costruttore
		this.base = base;
		this.altezza = altezza;
	}
	
	/**
	 * Calcolo dell'area
	 * @return l'area del rettangolo
	 */
	@Override
	public double area() {
		double area = base * altezza;
		System.out.println("Area="+area);
		return area;
	}
	
	/**
	 * Calcolo del perimetro
	 * @return del perimetro del rettangolo
	 */
	@Override
	public double perimetro() {
		double perimetro = base * 2 + altezza *2;
		System.out.println( "Perimetro="+perimetro );
		return perimetro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rettangolo [base=");
		builder.append(base);
		builder.append(", altezza=");
		builder.append(altezza);
		builder.append("]");
		return builder.toString();
	}

}
