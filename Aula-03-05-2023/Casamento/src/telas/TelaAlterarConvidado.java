package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Repositorio.RepositorioConvidado;
import controladores.ControladorAlterarConvidado;
import entidades.Convidado;

public class TelaAlterarConvidado {
	
	Convidado convidadoIdentificadoRecebido;
	
	JFrame FrameMenuPrincipal;
	JFrame FrameTelaIdentificarConvidado;
	RepositorioConvidado repositorioRecebido;
	Convidado convidadoRecebido;
	
	Convidado convidadoIdentificado = convidadoIdentificadoRecebido;
	
	public void AlterarConvidado(Convidado convidado) {
		
		 String campo01 = "Nome"; 
		 String campo02 = "Convite";
		 String campo03 = "Endereco";
		 String campo04 = "Profissao";
		 String campo05 = "Cpf";
		 
		 convidadoRecebido = convidado;
		 
		 JFrame frameTelaCadastroConvidado = new JFrame();
		 frameTelaCadastroConvidado.setTitle("Cadastro Convidado");
		 frameTelaCadastroConvidado.setSize(400,400);
		 
		 JPanel painelTelaCadastroConvidado = new JPanel();
		 
		 GridLayout grid = new GridLayout(0,1);
		 painelTelaCadastroConvidado.setLayout(grid);
		 
		 JLabel nome = new JLabel(campo01);
		 painelTelaCadastroConvidado.add(nome);
		 JTextField  respostaCampo01 = new JTextField(10);
		 respostaCampo01.setText(convidadoRecebido.getNome());
		 painelTelaCadastroConvidado.add(respostaCampo01);
		 
		 JLabel cpf = new JLabel(campo05);
		 painelTelaCadastroConvidado.add(cpf);
		 JTextField  respostaCampo02 = new JTextField(10);
		 respostaCampo02.setText(convidadoRecebido.getCpf());
		 painelTelaCadastroConvidado.add(respostaCampo02);
		 
		 JLabel convite = new JLabel(campo02);
		 painelTelaCadastroConvidado.add(convite);
		 JTextField  respostaCampo03 = new JTextField(10);
		 respostaCampo03.setText(convidadoRecebido.getConvite());
		 painelTelaCadastroConvidado.add(respostaCampo03);
		 
		 JLabel endereco = new JLabel(campo03);
		 painelTelaCadastroConvidado.add(endereco);
		 JTextField  respostaCampo04 = new JTextField(10);
		 respostaCampo04.setText(convidadoRecebido.getEndereco());
		 painelTelaCadastroConvidado.add(respostaCampo04);
		 
		 JLabel profissao = new JLabel(campo04);
		 painelTelaCadastroConvidado.add(profissao);
		 JTextField  respostaCampo05 = new JTextField(10);
		 respostaCampo05.setText(convidadoRecebido.getProfissao());
		 painelTelaCadastroConvidado.add(respostaCampo05);
		 
		 JButton botaoAlterar = new JButton();
		 painelTelaCadastroConvidado.add(botaoAlterar);
		 JButton botaoVoltar  = new JButton();
		 painelTelaCadastroConvidado.add(botaoVoltar);
		 
		 frameTelaCadastroConvidado.add(painelTelaCadastroConvidado);
		 frameTelaCadastroConvidado.setVisible(true);
		
		 ControladorAlterarConvidado ControladorAlterarConvidado =  new ControladorAlterarConvidado();
		 
		 botaoAlterar.addActionListener(ControladorAlterarConvidado);
		 botaoVoltar.addActionListener(ControladorAlterarConvidado);
	}
	

	
}
