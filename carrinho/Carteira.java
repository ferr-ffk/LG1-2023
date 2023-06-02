package javaLG2.carrinho;

public class Carteira {
	float qtdDinheiro;
	float credito;

	public Carteira(float qtdDinheiro, float credito) {
		this.qtdDinheiro = qtdDinheiro;
		this.credito = credito;
	}

	public float getQtdDinheiro() {
		return qtdDinheiro;
	}

	public void setQtdDinheiro(float qtdDinheiro) {
		this.qtdDinheiro = qtdDinheiro;
	}

	public float getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		this.credito = credito;
	}

}
