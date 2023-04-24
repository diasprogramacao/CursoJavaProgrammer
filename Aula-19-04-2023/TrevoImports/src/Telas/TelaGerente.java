package Telas;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controladores.ControladorTelaGerente;

public class TelaGerente {
	
	public void TelaDoGerente() {
	
	String opcao1 = "1 - Cadastrar";
	String opcao2 = "2 - Sair";

	JFrame  frameTelaGerente = new JFrame();
	frameTelaGerente.setSize(300,300);
	frameTelaGerente.setTitle("Gerente ");
	
JPanel painelTelaGerente = new JPanel();
	
	JLabel textMenuPrincipalOpcao1 = new JLabel(opcao1);
	painelTelaGerente.add(textMenuPrincipalOpcao1);
	
	JLabel textMenuPrincipalOpcao2 = new JLabel(opcao2);
	painelTelaGerente.add(textMenuPrincipalOpcao2);	
	
	TextField textoResposta = new TextField ();
	painelTelaGerente.add(textoResposta);
	
	JButton botao = new JButton("Enviar");
	painelTelaGerente.add(botao);
	
	frameTelaGerente.add(painelTelaGerente);
	frameTelaGerente.setVisible(true);
	
	ControladorTelaGerente controladorTelaGerente = new ControladorTelaGerente(textoResposta,frameTelaGerente);
	botao.addActionListener(controladorTelaGerente);
	
	}
	
}
