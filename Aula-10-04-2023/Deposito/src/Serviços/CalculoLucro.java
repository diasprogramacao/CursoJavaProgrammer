package Servi�os;

import entidades.Equipamento;
import entidades.Furadeira;

public class CalculoLucro {

	
	public double lucro (Equipamento equipamento) {
		
		double lucroCalculado = equipamento.getPrecoDeVenda() - equipamento.getPrecoDeCompra();
		
		return lucroCalculado;
		
	}
}
