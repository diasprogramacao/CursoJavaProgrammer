package Repositorio;

import java.util.List;

import entidades.Convidado;

public interface InterfaceConvidado {
	
	public void salvarConvidado(Convidado convidado);
	
	public List<Convidado> retornaLista();
	

}
