package com.example.linguaggio;

public class ContenitorePersonalizzabile<TY> {

	private TY object;

	public ContenitorePersonalizzabile(TY object) {
		super();
		this.object = object;
	}

	public TY getPayload() { // bruttissimo - solo per esempio
		return object;
	}
	
}
