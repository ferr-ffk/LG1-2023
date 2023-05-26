package heranca.pessoa;

public class Endereco {
	private String nome;
	private String bairro;
	private String numero;
	private String cep;
	
	public Endereco(String nome, String numero, String bairro, String cep) {
		this.nome = nome;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
	}

	private Endereco() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s, Número: %s, Bairro: %s, CEP: %s", this.nome, this.numero, this.bairro, this.cep);
	}
}
