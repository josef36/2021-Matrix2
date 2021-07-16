package com.example.geometria;

public class Cerchio extends Ellisse {
	
	private double raggio; // = 0.0f
	
	public Cerchio(double raggio) {
		super(raggio, raggio);
		this.raggio = raggio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cerchio [raggio=");
		builder.append(raggio);
		builder.append("]");
		return builder.toString();
	}

}
