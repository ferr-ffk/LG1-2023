package javaLG2.carrinho;

public class Produto {
	private String nome;
	private double preco;
	private int qtde;

	public Produto(String nome, double preco, int qtde) {
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco * qtde;
	}

	public int getqtde() {
		return qtde;
	}

	public void setqtde(int qtde) {
		this.qtde = qtde;
	}
}