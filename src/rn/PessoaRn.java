package rn;

import java.util.List;

import dao.bdo.PessoaDao;
import entidade.Pessoa;
import dao.bdr.MunicipioDao;

public class PessoaRn implements InterfaceRn<Pessoa>{
	
	@Override
	public void criar(Pessoa object) {
		// TODO Auto-generated method stub
		PessoaDao pessoaDao = new PessoaDao();
		if(pessoaDao.ler(object) != null) {
			System.out.println("Esta pessoa já existe!");
		}else {
			if(MunicipioDao.ler(object.getMunicipio()) != null) {
				pessoaDao.criar(object);
			}else {
				MunicipioDao.criar(object.getMunicipio());
				pessoaDao.criar(object);
			}
		}
	}

	@Override
	public Pessoa ler(Pessoa object) {
		// TODO Auto-generated method stub
		PessoaDao pessoaDao = new PessoaDao();
		Pessoa pessoa;
		if(pessoaDao.ler(object)== null) {
			System.out.println("Esta pessoa não existe!");
			pessoa = null;
		}else {
			pessoa = pessoaDao.ler(object);
		}		
		return pessoa;
	}

	@Override
	public void atualizar(Pessoa object) {
		// TODO Auto-generated method stub
		PessoaDao pessoaDao = new PessoaDao();
		if(pessoaDao.ler(object) != null) {
			pessoaDao.atualizar(object);
		}else {
			System.out.println("Essa pessoa não existe!");
		}	
	}
	
	@Override
	public List<Pessoa> lerTodos() {
		// TODO Auto-generated method stub
		PessoaDao pessoaDao = new PessoaDao();
		return pessoaDao.lerTodos();
	}
	
	@Override
	public void excluir(Pessoa object) {
		// TODO Auto-generated method stub
		PessoaDao pessoaDao = new PessoaDao();
		if(pessoaDao.excluir(object)) {
			System.out.println("Pessoa excluída!");
		}else {
			System.out.println("Não foi possível excluir a pessoa!");
		}
			
		
	}
	}

	

}


