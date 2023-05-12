package javaLG2.oo.exercicioBanco;

public class ContaPoupanca extends ContaBancaria {
	int diasDesdeUltimaTransferencia;
	
	@Override
	public void transferir(ContaBancaria conta, float qtd) {
		if(diasDesdeUltimaTransferencia >= 7) {
			this.transferir(conta, qtd);
		} else {
			System.out.println("Não é possível transferir pois foram feitas muitas transferências na última semana");
		}
	}
}
