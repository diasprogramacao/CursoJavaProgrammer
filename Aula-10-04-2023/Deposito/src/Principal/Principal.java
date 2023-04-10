package Principal;

import Serviços.Cadastro;
import Serviços.CalculoLucro;
import entidades.Furadeira;
import entidades.Makita;

public class Principal {
	
	public static void main(String[] agrs) {
		
		// CADASTRO  EXIBIÇÃO DOS DADOS ATRAVÉS DE INTERFACES.
		
		Furadeira furadeira01 = new Furadeira();
		Cadastro  instanciar01 = new Cadastro();
		CalculoLucro LucroFuradeira = new CalculoLucro();
		instanciar01.cadastrarFuradeira(furadeira01);
		instanciar01.exibirFuradeira(furadeira01, LucroFuradeira);
		
		// CADASTRO  EXIBIÇÃO DOS DADOS ATRAVÉS DE INTERFACES.
		
		Makita makita01 = new Makita();
		Cadastro  instanciar02 = new Cadastro();
		CalculoLucro LucroMakita = new CalculoLucro();
		instanciar02.cadastrarMakita(makita01);
		instanciar02.exibirMakita(makita01, LucroMakita);
			
		
	}

}
