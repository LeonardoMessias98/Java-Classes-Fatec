package poo;
public class Inicio {
	public static void main(String[] args) {		
		Carro carrinho = new Carro("Porsche", "Branco", 2);
		Carro carrinho2 = carrinho;
		Carro carrinho3 = new Carro("Uno", 5);
		
		carrinho2.quantidadeLugares = 7;
		carrinho2.cor = "Verde";
		carrinho.modelo = "Cobalt";
		
		System.out.println(carrinho3.modelo);
	}
}
