package org.fatec;

import org.etec.Produto;

public class Bebida extends Produto {
	public double litros;
	public double teorAlcool;
	
	public Bebida(String nome, double preco, double litros, double teorAlcool) {
		super(nome, preco);
		this.litros = litros;
		this.teorAlcool = teorAlcool;
	}
	
	public void getMyValue() {
		System.out.println("My value is " + preco);
	}
	
	public void getMyName() {
		System.out.println("My name is " + nome);
	}
	
	@Override
	public void resume() {
		System.out.println("-------------");
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Litros: " + litros);
		System.out.println("Teor Alcoólico: " + teorAlcool);		
	}
}
