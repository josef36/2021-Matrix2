package com.example.geometria;

public class Ellisse extends FormaGeometrica{

	private double asseMaggiore;
	private double asseMinore;
	
	public Ellisse(double asseMaggiore, double asseMinore) {
		this.asseMaggiore = asseMaggiore;
		this.asseMinore = asseMinore;
	}

	@Override
	public double area() {
		double area;
		area = asseMaggiore/2 * asseMinore/2 * Math.PI;
		return area;
	}

	
	@Override
	public double perimetro() {
		double perimetro = 2 * Math.PI * Math.sqrt( (asseMaggiore * asseMaggiore + asseMinore*asseMinore)/2 );
		return perimetro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ellisse [asseMaggiore=");
		builder.append(asseMaggiore);
		builder.append(", asseMinore=");
		builder.append(asseMinore);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
