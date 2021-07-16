package com.example.geometria.main;

import com.example.geometria.Cerchio;
import com.example.geometria.FormaGeometrica;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;

public class Main {

	public static void main(String[] args) {
		double areaTotale = 0;
		double perimetroTotale = 0;
		
		System.out.println("Rettangolo");
		FormaGeometrica r = new Rettangolo(20, 50);
		double area = r.area();
		System.out.println("Area Rettangolo 'r' = "+area);
		areaTotale = areaTotale + r.area();
		perimetroTotale = perimetroTotale + r.perimetro();
		
		System.out.println("\nRettangolo1");
		FormaGeometrica r1 = new Rettangolo(10, 20);
		areaTotale = areaTotale + r1.area();
		perimetroTotale = perimetroTotale + r1.perimetro();
		
		System.out.println("\nCerchio");
		FormaGeometrica c = new Cerchio(5.8f);
		areaTotale = areaTotale + c.area();
		perimetroTotale = perimetroTotale + c.perimetro();
		
		System.out.println("\nQuadrato");
		FormaGeometrica q = new Quadrato(10);
		areaTotale = areaTotale + q.area();
		perimetroTotale = perimetroTotale + q.perimetro();
		
		System.out.println();
		
		System.out.println("AreaTotale="+areaTotale);
		System.out.println("PerimetroTotale="+perimetroTotale);
		
		System.out.println("\nQuadrato="+q);
		System.out.println("Cerchio="+c);
		System.out.println("Rettangolo="+r);
		System.out.println("Rettangolo1="+r1);
		
		// illegale FormaGeometrica fg = new FormaGeometrica();
	}

}
