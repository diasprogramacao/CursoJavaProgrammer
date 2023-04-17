package Serviços;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import entidades.Aluno;
import entidades.Coordenador;
import entidades.Professor;

public class ParteGrafica {
	
	
	public void arquivoAluno(Aluno objeto) {
		
		String endereco = "C:\\RepositorioGitHub\\MeuRepositorio\\CursoJavaProgrammer\\Aula-14-04-2023\\ArquivoAluno";
		
		try {
			
			BufferedWriter buWriter = new BufferedWriter(new FileWriter(endereco));
			buWriter.append(Integer.toString(objeto.getMatricula()));
			buWriter.append(objeto.getNome());
			buWriter.append(objeto.getTurma());
			buWriter.close();
		} catch (IOException e ) {
			
			System.out.println("teste");
		}		
	}
	
	public void arquivoCoordenador(Coordenador objeto) {
		
		String endereco = "C:\\RepositorioGitHub\\MeuRepositorio\\CursoJavaProgrammer\\Aula-14-04-2023\\ArquivoCoordenador";
			
		try {
		
		BufferedWriter buWriter = new BufferedWriter(new FileWriter(endereco));
		buWriter.append(Integer.toString(objeto.getMatricula()));
		buWriter.append(objeto.getNome());
		buWriter.append(objeto.getGerencia());
		buWriter.close();
		} catch (IOException e) {
			System.out.println("Problema na leitura do arquivo");
		}
	}
	
public void arquivoProfessor(Professor objeto) {
		
		String endereco = "C:\\RepositorioGitHub\\MeuRepositorio\\CursoJavaProgrammer\\Aula-14-04-2023\\ArquivoProfessor";
			
		try {
		
		BufferedWriter buWriter = new BufferedWriter(new FileWriter(endereco));
		buWriter.append(Integer.toString(objeto.getMatricula()));
		buWriter.append(objeto.getNome());
		buWriter.append(objeto.getDisciplina());
		buWriter.close();
		} catch (IOException e) {
			System.out.println("Problema na leitura do arquivo");
		}
	}
	

}
