package serviços;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import entidades.ConvidadoNormal;
import entidades.ConvidadoVip;

public class CadastroConvidado {
	
	
		public ConvidadoNormal cadastroNormal() {
			
			ConvidadoNormal objeto = new ConvidadoNormal();
			
			objeto.setNome(JOptionPane.showInputDialog("Digite o seu nome: "));
			objeto.setCpf(JOptionPane.showInputDialog("Digite o seu Cpf: "));
			objeto.setTipoNormal(JOptionPane.showInputDialog("Digite o seu tipo: "));
			
			return objeto;
			
		}
		
          public ConvidadoVip cadastroVip() {
			
			ConvidadoVip objeto = new ConvidadoVip();
			
			objeto.setNome(JOptionPane.showInputDialog("Digite o seu nome: "));
			objeto.setCpf(JOptionPane.showInputDialog("Digite o seu Cpf: "));
			objeto.setTipoVip(JOptionPane.showInputDialog("Digite o seu tipo: "));
			
			return objeto;
			
		}
		
          public void ArquivoNormal(ConvidadoNormal parametro) {
        	  
        	  String endereco = "C:\\RepositorioGitHub\\MeuRepositorio\\CursoJavaProgrammer\\Aula-12-04-2023\\ConvidadoNormal";
        	  
  			
			try {
				BufferedWriter buWriter = new BufferedWriter(new FileWriter(endereco));
				System.out.println("DEU CERTO");
				buWriter.append("Cadastro do Convidado Normal : ");
				buWriter.append(parametro.getNome());
				buWriter.append("  " + parametro.getCpf());
				buWriter.append("  " + parametro.getTipoNormal());
				buWriter.close();
				
			} catch (IOException e) {
				
				System.out.println("DEU ERRADO");
			}
        	  
        	  
          }
          
         public void ArquivoVip(ConvidadoVip parametro) {
        	 
        	 String endereco = "C:\\RepositorioGitHub\\MeuRepositorio\\CursoJavaProgrammer\\Aula-12-04-2023\\ConvidadoVip";
        	  
        	 try {
        		 
        		 BufferedWriter buWriter = new BufferedWriter(new FileWriter(endereco));
        		 System.out.println("DEU CERTO");
        		 
        		 buWriter.append("Cadastro do Convidado Vip : ");
        		 buWriter.append(" " + parametro.getNome());
        		 buWriter.append(" " + parametro.getCpf());
        		 buWriter.append(" " + parametro.getTipoVip());
        		 buWriter.close();
        		 
        	 } catch (IOException e) {
        		 System.out.println("DEU ERRADO");
        	 }
        		 
        	 
        	  
          }
         
       

}
