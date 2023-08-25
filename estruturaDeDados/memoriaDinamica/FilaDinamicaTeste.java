package javaLG2.estruturaDeDados.memoriaDinamica;

public class FilaDinamicaTeste {

	public static void main(String[] args) {
		FilaDinamica<Integer> filaDinamica = new FilaDinamica<>();
		
		filaDinamica.adicionar(1);
		filaDinamica.adicionar(2);
		filaDinamica.adicionar(3);
		filaDinamica.adicionar(4);
		System.out.println(filaDinamica);
		
		System.out.println(filaDinamica.remover());
		
		filaDinamica.adicionar(5);
		filaDinamica.adicionar(6);
		filaDinamica.adicionar(7);
		
		System.out.println(filaDinamica); 
		filaDinamica.adicionar(10, 4);
		
		System.out.println(filaDinamica);
		
		filaDinamica.remover();
		filaDinamica.remover();
		filaDinamica.remover();
		
		System.out.println(filaDinamica);
	}

}
