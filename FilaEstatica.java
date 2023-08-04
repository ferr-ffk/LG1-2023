package javaLG2.estruturaDeDados;

/**
 * Uma fila é um estrutura em que o primeiro a ser incluido será o último a ser removido
 * Nela o sentinela é o primeiro da fila
 * 
 * @author fefe
 *
 *	@param T O tipo dos elementos
 */
@SuppressWarnings("unchecked")
public class FilaEstatica<T> {

	/**
	 * Os elementos da pilha
	 */
	private Object[] elementos;

	/**
	 * O primeiro da fila
	 */
	private int primeiro;
	
	/**
	 * O ultimo da fila
	 */
	private int ultimo;


	public FilaEstatica(int capacidade) {
		elementos = new Object[++capacidade];
		primeiro = 0;
		ultimo = -1;
	}
	
	public T get(int indice) {
		return (T) elementos[indice];
	}
	
	/**
	 * Adiciona o elemento nna última posição
	 * 
	 * @param e O elemento a ser adicionado
	 */
	public void inserir(T e) {
		if(taCheio()) {
			throw new RuntimeException("A fila está cheia!");
		}
		elementos[++ultimo] = e;
	}
	
	/**
	 * Retorna e remove o ultimo elemento
	 * 
	 * @return O ultimo elemento
	 */
	public T remover() {
		if(primeiro > ultimo) {
			throw new RuntimeException("A fila está vazia");
		}
		T elemento = (T) elementos[primeiro];
		primeiro++;
		return elemento; 
	}
	
	public boolean taCheio() {
		return ultimo == elementos.length - 1;
	}
}




		
		
		
		
		
		
		
		
		
		