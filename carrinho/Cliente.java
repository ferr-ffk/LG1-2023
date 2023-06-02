package javaLG2.carrinho;

public class Cliente {
	private String nome;
	private static long idBase = 1;
	private long idCliente;
	private Carteira carteira;
	private CarrinhoDeCompras carrinho;

	public Cliente(String nome, Carteira carteira, CarrinhoDeCompras carrinho) {
		this.nome = nome;
		this.idCliente = idBase++;
		this.carteira = carteira;
		this.carrinho = carrinho;
	}

	public CarrinhoDeCompras getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(CarrinhoDeCompras carrinho) {
		this.carrinho = carrinho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public Carteira getCarteira() {
		return carteira;
	}

	public void setCarteira(Carteira carteira) {
		this.carteira = carteira;
	}

	public void comprar(Produto produto) {
		if (this.carteira.qtdDinheiro > produto.getPreco()) {
			this.carteira.qtdDinheiro -= produto.getPreco();
		} else {
			this.carteira.credito -= produto.getPreco();
		}
		if (this.carteira.credito <= -2000000) {
			this.carteira = null;
			System.out.println("Vocẽ foi banido do Brasil");
		}
	}

	public void comprar(CarrinhoDeCompras carrinho) {
		double total = carrinho.calcularTotal();
		if (this.carteira.qtdDinheiro >= total) {
			System.out.printf("Dinheiro em conta: %f, valor total: %f", this.carteira.qtdDinheiro, total);
			this.carteira.qtdDinheiro -= total;
			System.out.printf("Dinheiro após a compra: %f", this.carteira.qtdDinheiro);
		} else {
			this.carteira.credito -= total;
			System.out.println("Vocẽ está sem dinheiro na conta!");
			System.out.println("");
		}
		this.carrinho = null;
	}

	public void imprimirCliente() {
		System.out.printf("[Nome: %s, id: %s, Dinheiro na conta: %s, Crédito em conta: %s]", this.nome, this.idCliente,
				this.carteira.qtdDinheiro, this.carteira.credito);
		System.out.println();
		if(this.carrinho == null) {
			System.out.println("Carrinho vazio");
			return;
		}
		this.carrinho.imprimirItens();
	}
}
