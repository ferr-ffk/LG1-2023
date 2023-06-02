package javaLG2.carrinho;

public class Main {
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
		CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();

		Cliente cliente1 = new Cliente("Arthur Augusto", new Carteira(90.5f, -0f), carrinho1);
		Cliente cliente2 = new Cliente("Davi Goumes", new Carteira(-1000f, -1000000f), carrinho2);

		carrinho1.adicionarItem(new Produto("Camiseta do Flamengo 22/23", 300.5f, 2));
		carrinho1.adicionarItem(new Produto("Camiseta do Flamengo 21/22", 200.01f, 5));
		carrinho1.adicionarItem(new Produto("Jaqueta Flamengo 23/24", 899.0f, 1));
		carrinho1.adicionarItem(new Produto("Shorts Flamengo", 70.9f, 1));

		carrinho2.adicionarItem(new Produto("nada", 0f , 0));
		carrinho2.adicionarItem(new Produto("Blaze Apostas", 1000f, 2));
		
		cliente1.imprimirCliente();
		cliente1.comprar(carrinho1);
		cliente1.imprimirCliente();
		System.out.println("");
		System.out.println("");
		cliente2.imprimirCliente();
		cliente2.comprar(carrinho2);
		cliente2.imprimirCliente();
	}
}
