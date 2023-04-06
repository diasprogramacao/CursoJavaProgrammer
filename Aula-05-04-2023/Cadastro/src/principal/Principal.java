package principal;

import java.util.Scanner;

import entidade.Pessoa;

public class Principal {
	
	public static void main (String[] agrs) {
		
		Scanner exibirTela = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		
		System.out.println("Digite seu nome : ");
		p1.setNome(exibirTela.next());
		
		System.out.println("Digite seu cpf : ");
		p1.setCpf(exibirTela.next());
		
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Cpf: "  + p1.getCpf());
		
	}

}
