package Repositorio;


import java.util.ArrayList;
import java.util.List;

import entidades.Convidado;
import persistencia.ConvidadoDao;



public class RepositorioConvidado implements InterfaceConvidado{

	
	ConvidadoDao convidadoDao = new ConvidadoDao();
	
	List<Convidado> listaConvidado = new ArrayList<>();
	
	@Override
	public void salvarConvidado(Convidado convidado) {
	
		convidadoDao.salvarJogadorBanco(convidado)	;
		
	}
	

	@Override
	public List<Convidado> retornaLista() {
		
		return convidadoDao.retornaListaConvidadoBanco();
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
		
		return convidadoDao.deletarConvidadoBancoDadosPeloCpf(convidado.getCpf());
		
	}

	@Override
	public void alterarConvidado(Convidado convidadoAntigo, Convidado convidadoNovo) {
		
		convidadoDao.alterarJogador(convidadoNovo);
		
	}

	
	
}
