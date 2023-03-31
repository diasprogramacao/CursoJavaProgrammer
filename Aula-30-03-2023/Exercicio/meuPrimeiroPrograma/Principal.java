package meuPrimeiroPrograma;

import java.util.Scanner;

		  public class Principal {
			
		 	public static void main(String[] agrs) {
			 	
		 	Scanner entradaDados = new Scanner(System.in); 

		 	System.out.println("PROGRAMADOR");
		 	
		 	Programador programador01 = new Programador();
		 	
			System.out.println("Digite o seu nome : ");
			programador01.nome = entradaDados.next();

		    System.out.println("Digite o seu cpf : ");
			programador01.cpf = entradaDados.next();

			System.out.println("Digite a linguagem que você utiliza para programar : ");
	        programador01.linguagem = entradaDados.next();
			
			System.out.println("Nome : " + programador01.nome );
		     System.out.println("Cpf : " + programador01.cpf );
			System.out.println("Linguagem utilizada : " + programador01.linguagem );
			
			
			System.out.println("DBA");
			
		     AdmBanco dba01 = new AdmBanco();

			System.out.println("Digite o seu nome : ");
			dba01.nome = entradaDados.next();

		 	System.out.println("Digite o seu cpf : ");
		 	dba01.cpf = entradaDados.next();

			System.out.println("Digite o Tipo de Banco de dados que você utiliza : ");
			dba01.tipoDeBancoDeDados = entradaDados.next();

			System.out.println("Nome : " + dba01.nome );
		     System.out.println("Cpf : " + dba01.cpf );
			System.out.println("Banco de Dados Utilizado : " + dba01.tipoDeBancoDeDados );
			
}

}
