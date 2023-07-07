package estruturaDeDados;

import java.util.HashSet;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
		Set<Integer> conjunto = new HashSet<>();
		conjunto.add(1);
		conjunto.add(2);
		conjunto.add(3);
		conjunto.add(4);
		conjunto.add(5);
		conjunto.add(6);
		conjunto.add(7);
		conjunto.add(8);
		conjunto.add(9);

		conjunto.contains(4);

		int[] vetor = { 1, 7, 7320, 4356, 8, 13 };
		int indice = BuscaSequencial.buscaSequencial(7320, vetor);
		System.out.println(indice);
	}

}
