package org.fatec;

import org.etec.Produto;

public class App {
	public static void main(String[] args) {
		Produto p1 = new Bebida("Cerveja", 7.0, 0.5, 6);
		Produto p2 = new Bebida("Vinho", 80, 1, 10);
		Produto p3 = new Laticinios("Queijo Minas", 20, 50, 10);
		
		Produto [] lista = { p1, p2, p3 };
		
		for (Produto i : lista) {
			i.resume();
		}
	}
}
