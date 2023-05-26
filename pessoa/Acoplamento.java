package heranca.pessoa;

import java.util.LinkedList;
import java.util.List;

public class Acoplamento {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new LinkedList<Pessoa>();
		Pessoa p1 = new Pessoa("Fernando", 'M', new Endereco("Rua da Chibata", "45", "PQ Bristol", "1298752"), new Telefone("11",  "973044370"));
		Pessoa p2 = new Pessoa("Sarah", 'F', new Endereco("Rua das calçadas", "23", "JD Flora", "4234566"), new Telefone("11",  "9730434634"));
		Pessoa p3 = new Pessoa("Arthur", 'M', new Endereco("Avenida Nova", "6756", "JD Flora", "235246"), new Telefone("11",  "973643670"));
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		System.out.println(p1.getNome());
		System.out.println(p1.getEndereco());
		System.out.println(p1.getTelefones());
	}

}
