package estruturasDeDados;

public class TesteVetorEstatico {
	
	public static void main(String[] args) {
		VetorEstatico<Integer> vetor = new VetorEstatico<>(6);
		System.out.println(vetor);
		System.out.println(vetor.taVazio());
		
		vetor.adicionar(3, 0);
		vetor.adicionar(10, 1);
		vetor.adicionar(-1, 1);
		vetor.adicionar(10, 2);
		vetor.adicionar(0, 4);
		
		System.out.println(vetor);
		
		System.out.println(vetor.tamanho());
		System.out.println(vetor.taCheio());
		System.out.println(vetor.taVazio());
		
		vetor.remover(1);
		vetor.removerElemento(4);
		
		System.out.println(vetor);
	}
}
