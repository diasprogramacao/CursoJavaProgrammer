import java.util.Scanner;

public class Principal {

public static void main (String [] agrs) {

	Scanner entradaDados = new Scanner(System.in); 

	System.out.println("Digite o seu nome");
      String nome = entradaDados.next();

	System.out.println("Digite o seu idade");
      String idade = entradaDados.next();

      System.out.println("Digite o seu endereco");
      String endereco = entradaDados.next();
		
	System.out.println("Nome digitado : " + nome);
      System.out.println("Idade digitado : " + idade);
      System.out.println("Endereco digitado : " + endereco);



     }

}