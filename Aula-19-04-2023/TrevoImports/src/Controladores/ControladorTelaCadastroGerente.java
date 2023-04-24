package Controladores;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import entidades.Gerente;

public class ControladorTelaCadastroGerente implements ActionListener {
	
	TextField nomeGerente;
	TextField cpfGerente;
	TextField gerencia;


	public ControladorTelaCadastroGerente(TextField nomeGerente, TextField cpfGerente, TextField gerencia) {
		this.nomeGerente = nomeGerente;
		this.cpfGerente = cpfGerente;
		this.gerencia = gerencia;
	}

	public Gerente GerenteReceberDados () {
		
		Gerente  gerente = new Gerente();
		
		gerente.setNome(nomeGerente.getText());
		gerente.setCpf(cpfGerente.getText());
		gerente.setGerencia(gerencia.getText());
		
		return gerente;
	}

	
	
	public void registroDadosGerenteArquivo(Gerente gerente) {
		
		String caminhoArquivo = "C:\\RepositorioGitHub\\MeuRepositorio\\CursoJavaProgrammer\\Aula-19-04-2023\\Arquivos\\Gerente" ;
		
		try {
			BufferedWriter buWheter = new BufferedWriter(new FileWriter(caminhoArquivo));
			buWheter.append("Nome:  " + gerente.getNome());
			buWheter.append("Cpf:  " + gerente.getCpf());
			buWheter.append("Gerência:  " + gerente.getGerecia());
			buWheter.close();
		} catch (IOException e1) {
			
			System.out.println("Não está sendo possível acessar o caminho do arquivo");
		}
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		registroDadosGerenteArquivo(GerenteReceberDados());
				
		
	}
	

}
