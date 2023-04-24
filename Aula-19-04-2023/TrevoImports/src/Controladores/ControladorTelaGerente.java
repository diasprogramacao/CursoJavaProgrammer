package Controladores;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Telas.TelaCadastroGerente;

 public class ControladorTelaGerente implements ActionListener {

	 TextField respostaRecebida;
	 JFrame frameRecebido;
	 
	 TelaCadastroGerente telaCadastroGerente = new TelaCadastroGerente();
	 
	 public ControladorTelaGerente(TextField recebido, JFrame frame) {
		 this.respostaRecebida = recebido;
		 this.frameRecebido = frame;
		 
	 }
	 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String recebido = respostaRecebida.getText();		
		
		if(recebido.equals("1") || recebido.equals("2") ) {
			switch(recebido) { 
		case "1": ;
		telaCadastroGerente.CadastroGerente();
		frameRecebido.setVisible(false);
		
			break;
		case "2":
			System.out.println("Sair");
			}
			
		} else {
			System.out.println("Errada a Opção digitada");
		}
		
	}

}
