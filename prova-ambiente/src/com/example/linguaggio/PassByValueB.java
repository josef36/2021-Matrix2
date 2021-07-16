package com.example.linguaggio;

public class PassByValueB {

	public static void main(String[] args) {
		PassByValueB pbvb = new PassByValueB();
		
		Container container = new Container();
		container.setValore(100);
		
		System.out.println("container.getValore()="+container.getValore());
		pbvb.cambiaValore(container);
		System.out.println("container.getValore()="+container.getValore());
	}
	
	public void cambiaValore(Container container) {
		System.out.println("container.cambiaValore()="+container.getValore());
		container.setValore(-8000);
		System.out.println("container.cambiaValore()="+container.getValore());
	}
}
