package modelo;

import util.FilaDinamica;

public class Investidor {

	private String nome;
	
	private double saldo;
	
	private FilaDinamica<AbstratoPapel> papeisNaCarteira;
	
	public Investidor(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
		this.papeisNaCarteira = new FilaDinamica<>();
	}
	
	public void adicionarPapel(AbstratoPapel ap) {
		if(ap.calcularValor() > saldo) {
			throw new RuntimeException("A carteira não possui saldo suficiente!");
		}
		
		this.papeisNaCarteira.adicionar(ap);
		this.saldo -= ap.calcularValor();
	}

	@Override
	public String toString() {
		return "[" + nome + ", saldo: " + saldo + ", papeisNaCarteira: " + papeisNaCarteira + "]";
	}
	
}
