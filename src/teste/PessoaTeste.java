package teste;

import java.util.List;

import dao.bdo.PessoaDao;
import entidade.Municipio;
import entidade.Pessoa;

public class PessoaTeste {
	public static void main(String [] args) {
		Pessoa pessoa = new Pessoa();
		PessoaDao pessoaDao = new PessoaDao();
		Municipio municipio = new Municipio();
		municipio.setId(1);
		
		pessoa.setId(1);
		pessoa.setNome("Paula");
		pessoa.setMunicipio(municipio);
		
		List<Pessoa> pessoas = pessoaDao.lerTodos();
		
		if (pessoas.size() == 0) {
			System.out.println("Tabela municipio não tem registro");
		} else {
			for (Pessoa pessoa2 : pessoas) {
				System.out.println("ID: " + pessoa2.getId());
				System.out.println("Nome: " + pessoa2.getNome());
				System.out.println("Uf: " + pessoa2.getMunicipio());
			}
		}

		System.out.println("\nTeste concluído");

	}
		
		
		
}
