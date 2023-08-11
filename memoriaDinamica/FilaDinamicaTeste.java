package javaLG2.estruturaDeDados.memoriaDinamica;

public class FilaDinamicaTeste {

	public static void main(String[] args) {
		FilaDinamica<Integer> filaDinamica = new FilaDinamica<>();
		
		filaDinamica.adicionar(1);
		System.out.println(filaDinamica);
		
		filaDinamica.adicionar(2);
		System.out.println(filaDinamica);
		
		filaDinamica.adicionar(3);
		System.out.println(filaDinamica);
		
		filaDinamica.adicionar(4);
		System.out.println(filaDinamica);
		
		System.out.println(filaDinamica.remover());
		
		System.out.println(filaDinamica);
	}

}
