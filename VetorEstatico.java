package estruturasDeDados;

public class VetorEstatico<T> {
	private int tamanho;
	private int capacidade;
	private T[] elementos;

	@SuppressWarnings("unchecked")
	public VetorEstatico(int capacidade) {
		this.elementos = (T[]) new Object[++capacidade];
		this.tamanho = 0;
		this.capacidade = capacidade;
	}

	public boolean taVazio() {
		return tamanho == 0;
	}

	public boolean taCheio() {
		return tamanho == capacidade;
	}

	public boolean temCelulaVazia(int indice) {
		return elementos[indice] == null ? true : false;
	}

	public void adicionar(T elemento) throws RuntimeException {
		if (this.taVazio()) {
			for (int i = 0; i < tamanho - 1; i++) {
				if (this.temCelulaVazia(i)) {
					elementos[i] = elemento;
					return;
				}
			}
		} else {
			throw new RuntimeException("O vetor está cheio!");
		}
	}

	public void adicionar(T elemento, int indice) {
		if (elementos[indice] == null) {
			this.tamanho++;
		}
		this.elementos[indice] = elemento;
	}

	public void remover(int indice) {
		if (indice >= capacidade || indice < 0) {
			throw new RuntimeException("O indíce está fora do alcance!");
		}
		elementos[indice] = null;
		this.tamanho--;
	}

	public void removerElemento(T elemento) {
		for (int i = 0; i < this.tamanho - 1; i++) {
			if (elementos[i].equals(elemento)) {
				elementos[i] = null;
				return;
			}
		}
		throw new RuntimeException("O item não foi encontrado!");
	}

	@Override
	public String toString() {
		String str = "[ ";
		for (int i = 0; i < this.capacidade - 1; i++) {
			str += "(";
			str += elementos[i];
			str += ")";
			str += " ";
		}
		return str + "]";
	}

	public int tamanho() {
		return this.tamanho;
	}
}