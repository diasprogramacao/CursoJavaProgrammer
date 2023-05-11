package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Repositorio.RepositorioConvidado;
import entidades.Convidado;

public class ControladorAlterarConvidado implements ActionListener {
	
	
	public ControladorAlterarConvidado(JFrame frameTelaAlterar, JFrame frameMenuPrincipal, Convidado convidadoRecebido,
			RepositorioConvidado repositorioRecebido, JTextField nomeAntigo, JTextField cpfAntigo,
			JTextField conviteAntigo, JTextField enderecoAntigo, JTextField profissaoAntigo) {
		
		this.frameTelaAlterar = frameTelaAlterar;
		this.frameMenuPrincipal = frameMenuPrincipal;
		this.convidadoRecebido = convidadoRecebido;
		RepositorioRecebido = repositorioRecebido;
		this.nomeAntigo = nomeAntigo;
		this.cpfAntigo = cpfAntigo;
		this.conviteAntigo = conviteAntigo;
		this.enderecoAntigo = enderecoAntigo;
		this.profissaoAntigo = profissaoAntigo;
	}

	JFrame frameTelaAlterar;
	JFrame frameMenuPrincipal;
	Convidado convidadoRecebido;
	RepositorioConvidado RepositorioRecebido;
	JTextField nomeAntigo;
	JTextField cpfAntigo;
	JTextField conviteAntigo;
	JTextField enderecoAntigo;
	JTextField profissaoAntigo;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		RepositorioRecebido.alterarConvidado(convidadoRecebido, popularConvidado());
		frameTelaAlterar.setVisible(false);
		frameMenuPrincipal.setVisible(true);
		
	}
	
	public Convidado  popularConvidado() {
		
		Convidado convidadoNovo = new Convidado();
		
		convidadoNovo.setNome(nomeAntigo.getText());
		convidadoNovo.setCpf(cpfAntigo.getText());
		convidadoNovo.setConvite(conviteAntigo.getText());
		convidadoNovo.setEndereco(enderecoAntigo.getText());
		convidadoNovo.setProfissao(profissaoAntigo.getText());	
		
		return convidadoNovo;
		
	}

}
