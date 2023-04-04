package Principal;

import Serviços.CalcularSalario;
import entidade.ProfessorJunior;
import entidade.ProfessorPleno;
import entidade.ProfessorSenior;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[]agrs) {
	
		
		// *********JUNIOR***************//
		
		
	    System.out.println("// *********JUNIOR***************//"); 

		
		ProfessorJunior junior = new ProfessorJunior();
		
		
		//PRINT DA TELA JUNIOR - INTERAÇÃO USUÁRIO : 
		
		Scanner exibirTela = new Scanner(System.in);
		
		System.out.println("Professor Junior,Digite seu nome : "); 
		junior.nome = exibirTela.next();

		System.out.println("Professor Junior,Digite seu Cpf : "); 
		junior.Cpf = exibirTela.next();
		
		System.out.println("Professor Junior,Digite a quantidade de horas trabalhadas : "); 
		junior.qtdHorasTrabalhadas = Integer.parseInt(exibirTela.next());
		
		
		//INSTANCIANDO O SERVIÇO QUE CALCULA O BRUTO.
				CalcularSalario bruto= new CalcularSalario();
				junior.salarioBruto = bruto.brutoCalculado(junior.qtdHorasTrabalhadas, 60);
				
				//INSTANCIANDO O JUNIOR E O SERVIÇO QUE CALCULA O BRUTO.
				CalcularSalario liquido = new CalcularSalario();
				junior.salarioLiquido = liquido.LiquidadoCalculado(junior.salarioBruto,junior.imposto/100);
		
		
		System.out.println("Nome Professor Junior: " + junior.nome);
		System.out.println("Numero do Cpf: " + junior.Cpf);
		System.out.println("Salário Bruto: " + junior.salarioBruto);
		System.out.println("Salario Liquido: "  + junior.salarioLiquido);
		System.out.println();
		
		
		
		                    // *********PLENO***************//
		
		
		
		        ProfessorPleno  pleno = new ProfessorPleno();
				
				
				//PRINT DA TELA JUNIOR - INTERAÇÃO USUÁRIO : 
				
				
				System.out.println("Professor Pleno,Digite seu nome : "); 
				pleno.nome = exibirTela.next();

				System.out.println("Professor Pleno,Digite seu Cpf : "); 
				pleno.Cpf = exibirTela.next();
				
				System.out.println("Professor Pleno,Digite a quantidade de horas trabalhadas : "); 
				pleno.qtdHorasTrabalhadas = Integer.parseInt(exibirTela.next());
				
				
				//INSTANCIANDO O SERVIÇO QUE CALCULA O BRUTO.
						CalcularSalario bruto2= new CalcularSalario();
						pleno.salarioBruto = bruto2.brutoCalculado(pleno.qtdHorasTrabalhadas, 80);
						
						//INSTANCIANDO O JUNIOR E O SERVIÇO QUE CALCULA O BRUTO.
						CalcularSalario liquido2 = new CalcularSalario();
						pleno.salarioLiquido = liquido2.LiquidadoCalculado(pleno.salarioBruto,pleno.imposto/100);
				
				
				System.out.println("Nome Professor Pleno: " + pleno.nome);
				System.out.println("Numero do  Cpf: " + pleno.Cpf);
				System.out.println("Salário Bruto: " + pleno.salarioBruto);
				System.out.println("Salario Liquido: "  + pleno.salarioLiquido);
				System.out.println();
				
				
	            // *********SENIOR***************//
				
				
				
				    ProfessorSenior Senior = new ProfessorSenior();
						
						
						//PRINT DA TELA JUNIOR - INTERAÇÃO USUÁRIO : 
						
						
						System.out.println("Professor Senior,Digite seu nome : "); 
						Senior.nome = exibirTela.next();

						System.out.println("Professor Senior,Digite seu Cpf : "); 
						Senior.Cpf = exibirTela.next();
						
						System.out.println("Professor Senior,Digite a quantidade de horas trabalhadas : "); 
						Senior.qtdHorasTrabalhadas = Integer.parseInt(exibirTela.next());
						
						
						//INSTANCIANDO O SERVIÇO QUE CALCULA O BRUTO.
								CalcularSalario bruto3= new CalcularSalario();
								Senior.salarioBruto = bruto3.brutoCalculado(Senior.qtdHorasTrabalhadas, 100);
								
								//INSTANCIANDO O JUNIOR E O SERVIÇO QUE CALCULA O BRUTO.
								CalcularSalario liquido3 = new CalcularSalario();
								Senior.salarioLiquido = liquido3.LiquidadoCalculado(Senior.salarioBruto,Senior.imposto/100);
						
						
						System.out.println("Nome Professor Senior: " + Senior.nome);
						System.out.println("Numero do  Cpf: " + Senior.Cpf);
						System.out.println("Salário Bruto: " + Senior.salarioBruto);
						System.out.println("Salario Liquido: "  + Senior.salarioLiquido);
						System.out.println();
		
		
	}

}
