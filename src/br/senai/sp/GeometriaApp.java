package br.senai.sp;

import br.senai.sp.model.Triangulo;

public class GeometriaApp {

	public static void main(String[] args) {
		// Criando um triangulo
		System.out.println("Criando T1...");
		Triangulo t1 = new Triangulo();
		System.out.println("Criando T2...");
		Triangulo t2 = new Triangulo();
		System.out.println("Criando T3...");
		Triangulo t3 = new Triangulo();
		
		// Definindo as dimençoes dos triangulos
		t1.base = 20;
		t1.altura = 12;
		t1.ladoB = 15;
		t1.ladoC = 15;
		t1.nome = "T1";
		
		t2.base = 10; 
		t2.altura = 8;
		t2.ladoB = 6;
		t2.ladoC = 8;
		t2.nome = "T2";
		
		t3.base = 18;
		t3.altura = 14;
		t3.ladoB = 20;
		t3.ladoC = 21;
		t3.nome = "T3";
		
		//mostrar ad dimencoes dos triangulos
		t1.mostrarDimencoes();
		t2.mostrarDimencoes();
		t3.mostrarDimencoes();
	}

}
