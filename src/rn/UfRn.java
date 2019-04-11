package rn;

import java.util.List;

import dao.bdr.UfDao;
import entidade.Uf;

public class UfRn implements InterfaceRn<Uf>{

	@Override
	public void criar(Uf object) {
		// TODO Auto-generated method stub
		UfDao ufDao = new UfDao();
		if(ufDao.ler(object) == null) {
			ufDao.criar(object);
		}else {
			System.out.println("A uf já existe");
		}
	}

	@Override
	public Uf ler(Uf object) {
		// TODO Auto-generated method stub
UfDao ufDao = new UfDao();
		
		return ufDao.ler(object);
	}

	@Override
	public List<Uf> lerTodos() {
		// TODO Auto-generated method stub
		UfDao ufDao = new UfDao();
		return ufDao.lerTodos();
	}

	@Override
	public void atualizar(Uf object) {
		// TODO Auto-generated method stub
		UfDao ufDao = new UfDao();
		if(ufDao.ler(object) != null) {
			ufDao.atualizar(object);
		}else {
			System.out.println("Uf inexistente");
		}
	}

	@Override
	public void excluir(Uf object) {
		// TODO Auto-generated method stub
		UfDao ufDao = new UfDao();
		if(ufDao.excluir(object)) {
			System.out.println("uf excluido");
		}else {
			System.out.println("Esse estado não pode ser exculido");
		}
		
	}

}
