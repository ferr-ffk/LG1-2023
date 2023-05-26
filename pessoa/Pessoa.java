package heranca.pessoa;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private char sexo;
	private Endereco endereco;
	private List<Telefone> telefones = new ArrayList();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public String getEndereco() {
		return endereco.toString();
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	private Pessoa() {
	}

	public Pessoa(String nome, char sexo, Endereco endereco, Telefone telefone) {
		this.nome = nome;
		this.sexo = sexo;
		if (endereco != null) {
			this.endereco = endereco;
		}
		try {
			throw new Exception("Endereço não pode ser nulo");
		} catch (Exception ex) {
			this.endereco = new Endereco("N/A", "", "", "");
		}
		this.telefones.add(telefone);
	}
}
