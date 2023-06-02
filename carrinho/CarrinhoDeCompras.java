package javaLG2.carrinho;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Produto> itens;

	public CarrinhoDeCompras() {
		this.itens = new ArrayList<>();
	}

	public void adicionarItem(Produto produto) {
		itens.add(produto);
	}

	public void removerItem(Produto produto) {
		itens.remove(produto);
	}

	public double calcularTotal() {
		double total = 0;
		for (Produto produto : itens) {
			total += produto.getPreco();
		}
		return total;
	}

	public double calcularTotal(boolean b) {
		double total = 0;
		for (int i = 0; i < itens.size(); i++) {
			Produto produto = itens.get(i);
			total += produto.getPreco();
		}
		return total;
	}

	public double calcularTotal(int b) {
		double total = 0;
		for (Iterator<Produto> iterator = itens.iterator(); iterator.hasNext();) {
			Produto produto = iterator.next();
			total += produto.getPreco();
		}
		return total;
	}

	public void imprimirItens() {
		if(itens == null) {
			System.out.println("Carrinho vazio");
			return;
		}
		System.out.println("Itens no carrinho:");
		for (Produto produto : itens) {
			System.out.println(produto.getNome() + " - R$" + produto.getPreco());
		}
	}
}
