package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {
	
	 private static String USUARIO = "root";
	 private static String SENHA = "root";
	 
	 private static String BANCO_URL = "jdbc:mysql://localhost:3306/db_cadastro_convidado?useTimezone=true&serverTimezone=UTC";
     
	 
	 public Connection criarConexao() {
		 
		 Connection conexao = null;
		 
		 try { 
			 
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 conexao = DriverManager.getConnection(BANCO_URL,USUARIO,USUARIO);
			 
			 System.out.println("deu certo");
			 
		 } catch (Exception MensagemErro) {
			 
			 conexao = null;
			 System.out.println(MensagemErro);
			 System.out.println("Deu errado");
			 
             }
		 
		 return conexao;
	 }
}
