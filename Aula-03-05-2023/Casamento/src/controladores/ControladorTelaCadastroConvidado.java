package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Repositorio.RepositorioConvidado;
import entidades.Convidado;

public class ControladorTelaCadastroConvidado implements ActionListener {

	RepositorioConvidado repositorioIniciadoControladorMenuPrincipal;
	JFrame JframeMenuPrincipal;
	JFrame frameTelaCadastroConvidado;
	JTextField nome;
	JTextField cpf;
	JTextField convite;
	JTextField endereco;
	JTextField profissao;

	
	public ControladorTelaCadastroConvidado(RepositorioConvidado repositorio,JFrame frameTelaMenuPrincipal, JFrame frameTelaCadastroConvidado, JTextField nome,JTextField cpf, JTextField convite,
			JTextField endereco, JTextField profissao) {
		this.frameTelaCadastroConvidado = frameTelaCadastroConvidado;
		this.nome = nome;
		this.cpf = cpf;
		this.convite = convite;
		this.endereco = endereco;
		this.profissao = profissao;
		this.repositorioIniciadoControladorMenuPrincipal = repositorio;
		this.JframeMenuPrincipal = frameTelaMenuPrincipal;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		repositorioIniciadoControladorMenuPrincipal.salvarConvidado(popular());
		frameTelaCadastroConvidado.setVisible(false);
		JframeMenuPrincipal.setVisible(true);
		
	}
	
	
	public Convidado popular() {
		
		Convidado convidado = new Convidado();
		convidado.setNome(nome.getText());
		convidado.setCpf(cpf.getText());
		convidado.setConvite(convite.getText());
		convidado.setEndereco(endereco.getText());
		convidado.setProfissao(profissao.getText());
		
		return convidado;
	}
	

}
