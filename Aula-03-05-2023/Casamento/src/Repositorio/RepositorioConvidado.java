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

	@Override
	public Convidado BuscarConvidado(String cpf) {
		
		for(Convidado listaConvidados:retornaLista()) {
			if(listaConvidados.getCpf().equals(cpf)) {
				return listaConvidados;
			}
		}
		
		return null;
	}

	@Override
	public boolean deletarConvidado(Convidado convidado) {
		
		boolean resultado = true;
	
		try {
			listaConvidado.remove(convidado);
			resultado = true;
			return resultado;
		} 
		catch (Exception e ) {
			resultado= false; 
			return resultado;
		}
		
	}

	
	
}
