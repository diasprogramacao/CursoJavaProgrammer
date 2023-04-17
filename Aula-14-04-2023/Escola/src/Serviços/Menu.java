package Serviços;

import javax.swing.JOptionPane;

import entidades.Aluno;
import entidades.Coordenador;
import entidades.Professor;

public class Menu {
	
	
	public void interacao() {
		
	   CadastroDePessoa cadastro= new CadastroDePessoa();
	   ParteGrafica  arquivo = new ParteGrafica();
	   
	   boolean validacao = true;
	 do {
		 
		 int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção que você cadastrar : 1- Aluno 2-Coordenador 3-Professor - 4 - Sair "));
			
		 if (opcao == 1) {
				Aluno aluno = new Aluno();
				aluno = cadastro.cadastroAluno();
				arquivo.arquivoAluno(aluno);
			}
			if (opcao == 2) {
				Coordenador coordenador = new Coordenador();
				coordenador = cadastro.cadastroCoordenador();
				arquivo.arquivoCoordenador(coordenador);
			} 
			if (opcao == 3) {
				Professor professor = new Professor();
				professor= cadastro.cadastroProfessor();
				arquivo.arquivoProfessor(professor);
			}
			if (opcao == 4 ) {
				validacao = false;
			}
			
	 } while(validacao);	
		
	 System.exit(0);
		 
	}
	
	
	

}
