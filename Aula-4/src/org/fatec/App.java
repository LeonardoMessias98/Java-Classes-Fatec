package org.fatec;

public class App {
	public static void main(String[] args) {
		// tudo em java é herança de uma classe chamada Objeto
		// Object é fornecido por padrão pela maquina virtual
		Cliente  c = new Cliente ("Leonardo", "12 9999999");
		// toda vez que se imprime uma referência de um objeto
		// implicitamente é chamado um método de nome toString()
		System.out.println(c);
	}
}
