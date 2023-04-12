package Principal;

import Serviços.Cadastro;
import Serviços.CalculoLucro;
import entidades.Furadeira;
import entidades.Makita;

public class Principal {
	
	public static void main(String[] agrs) {
		
		// CADASTRO  EXIBIÇÃO DOS DADOS ATRAVÉS DE INTERFACES.
		
		Cadastro  instanciar01 = new Cadastro();
		instanciar01.menu();
		
	}
}