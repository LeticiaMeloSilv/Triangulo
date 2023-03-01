package br.senai.sp.model;

public class Triangulo {
	
	public double base;
	public double ladoB;
	public double ladoC;
	public double altura;
	public String nome;
	
	public void mostrarDimencoes() {
		System.out.println("------------------------");
		System.out.println(nome);
		System.out.println("------------------------");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Lado B " + ladoB);
		System.out.println("Lado C: " + ladoC);
		calcularArea();
	}
	public void calcularArea() {
		double area= (base * altura) / 2;
		System.out.println("Área = " + area);
		calcularPerimetro();
	}
	public void calcularPerimetro() {
		double perimetro=(base + ladoB + ladoC);
		System.out.println("Perimetro = " + perimetro);
	}

}
