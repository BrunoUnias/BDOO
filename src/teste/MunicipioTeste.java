package teste;

import dao.bdr.MunicipioDao;
import entidade.Municipio;
import entidade.Uf;
import java.util.List;

public class MunicipioTeste {
	public static void main(String [] args) {
	
	Municipio municipio = new Municipio();
	MunicipioDao municipioDao = new MunicipioDao();
	Uf uf = new Uf();
	uf.setId(1);
	
	municipio.setId(2);
	municipio.setNome("barbalha");
	municipio.setUf(uf);
	municipioDao.criar(municipio);
	
	List<Municipio> municipios = municipioDao.lerTodos();
	
	if (municipios.size() == 0) {
		System.out.println("Tabela municipio não tem registro");
	} else {
		for (Municipio municipio2 : municipios) {
			System.out.println("ID: " + municipio2.getId());
			System.out.println("Nome: " + municipio2.getNome());
			System.out.println("Uf: " + municipio2.getUf());
		}
	}

	System.out.println("\nTeste concluído");

}
	
	}