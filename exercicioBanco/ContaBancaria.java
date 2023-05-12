package javaLG2.oo.exercicioBanco;

public abstract class ContaBancaria {
	private String dono;
	private float saldo;

	public ContaBancaria(String dono, float saldo) {
		this.dono = dono;
		this.saldo = saldo;
	}
	
	public ContaBancaria() {
		
	}
	
	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float sacar(float qtd) {
		if (qtd > saldo) {
			qtd = saldo;
			return qtd;
		} else {
			return saldo - qtd;
		}
	}

	public void depositar(float qtd) {
		while (qtd == 0) {
			System.out.println("Valor depositado nulo! Deposite um valor maior que 0");
		}
		saldo += qtd;
	}

	public void transferir(ContaCorrente conta, float qtd) {
		this.saldo -= qtd;
		float contaSaldo = conta.getSaldo();
		conta.setSaldo(contaSaldo += qtd);
	}

	public void transferir(ContaBancaria conta, float qtd) {
		// TODO Auto-generated method stub
		
	}
}
