package org.fatec;

import org.etec.Produto;

public class Laticinios extends Produto {
	public double indiceGordura;
	public double indiceLactose;
	
	public Laticinios(String nome, double preco, double indiceGordura, double indiceLactose) {
		super(nome, preco);
		this.indiceGordura = indiceGordura;
		this.indiceLactose = indiceLactose;
	}

	@Override
	public void resume() {
		System.out.println("-------------");
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Gordura: " + indiceGordura);
		System.out.println("Lactose: " + indiceLactose);
		
	}
	
}
