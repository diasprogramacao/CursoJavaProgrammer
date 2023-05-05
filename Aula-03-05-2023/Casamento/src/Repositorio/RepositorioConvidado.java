package Repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Convidado;

public class RepositorioConvidado implements InterfaceConvidado{

	
	List<Convidado> listaConvidado = new ArrayList<>();
	
	@Override
	public void salvarConvidado(Convidado convidado) {
	
		
		listaConvidado.add(convidado);
		
	}

	@Override
	public List<Convidado> retornaLista() {
		
		return listaConvidado;
	}

}
