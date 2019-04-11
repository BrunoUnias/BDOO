package rn;

import java.util.List;

import dao.InterfaceDao;
import dao.bdr.MunicipioDao;
import entidade.Municipio;
import dao.bdr.UfDao;
import entidade.Uf;

public class MunicipioRn implements InterfaceRn<Municipio>{
	
	@Override
	public void criar(Municipio object) {
		// TODO Auto-generated method stub
		UfDao ufd = new UfDao();
		MunicipioDao municipioDao = new MunicipioDao();
		if(municipioDao.ler(object) != null) {
			System.out.println("esse municipio já existe");
		} else {
			if(ufd != null) {
				municipioDao.criar(object);
				
			}
			else {
				ufd.criar(object.getUf());
				municipioDao.criar(object);
			}
		}
	}

	@Override
	public Municipio ler(Municipio object) {
		// TODO Auto-generated method stub
		MunicipioDao municipioDao = new MunicipioDao();
		
		return municipioDao.ler(object);
	}

	@Override
	public void atualizar(Municipio object) {
		// TODO Auto-generated method stub
		MunicipioDao municipioDao = new MunicipioDao();
		if(municipioDao.ler(object) != null) {
			municipioDao.atualizar(object);
			
		}else {
			System.out.println("esse municipio não existe");
		}
		
	}

	@Override
	public void excluir(Municipio object) {
		// TODO Auto-generated method stub
		MunicipioDao municipioDao = new MunicipioDao();
		if(municipioDao.excluir(object)) {
			System.out.println("municipio excluido");
		}else {
			System.out.println("não foi possivel excluir esse municipio");
		}
		
	}

	@Override
	public List<Municipio> lerTodos() {
		// TODO Auto-generated method stub
		MunicipioDao municipioDao = new MunicipioDao();
		return municipioDao.lerTodos();	
	}

	

}
