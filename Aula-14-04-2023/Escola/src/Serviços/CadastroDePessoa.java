package Servi�os;

import javax.swing.JOptionPane;

import entidades.Aluno;
import entidades.Coordenador;
import entidades.Professor;

public class CadastroDePessoa {

	public Aluno cadastroAluno(){
		
		Aluno objeto = new Aluno(); 
		objeto.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero da matricula: ")));
		objeto.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		objeto.setTurma(JOptionPane.showInputDialog("Digite sua turma: "));
		
		return objeto;
	}
	
		public Coordenador cadastroCoordenador(){
			
			Coordenador objeto = new Coordenador(); 
			
			objeto.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero da matricula: ")));
			objeto.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
			objeto.setGerencia(JOptionPane.showInputDialog("Digite o c�digo da gerencia: "));
			
			return objeto;
		}
		
		public Professor cadastroProfessor(){
			
			Professor objeto = new Professor();
			
			objeto.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero da matricula: ")));
			objeto.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
			objeto.setDisciplina(JOptionPane.showInputDialog("Digite a disciplina que voc� � respons�vel : "));
			
			return objeto;
		}
	
		
}
