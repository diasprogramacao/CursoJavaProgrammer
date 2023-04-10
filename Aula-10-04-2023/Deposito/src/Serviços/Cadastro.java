package Serviços;


import javax.swing.JOptionPane;

import entidades.Equipamento;
import entidades.Furadeira;
import entidades.Makita;

public class Cadastro {
	
	public void cadastrarFuradeira(Furadeira objeto) {
		
		JOptionPane.showMessageDialog(null, "CADASTRO DA FURADEIRA");
		objeto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do equipamento: ")));
		objeto.setMarca(JOptionPane.showInputDialog("Digite a marca do equipamento: "));
		objeto.setPrecoDeCompra(Integer.parseInt(JOptionPane.showInputDialog("Digite o preço de compra do equipamento: ")));
		objeto.setPrecoDeVenda(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de venda do equipamento: ")));
		objeto.setModeloFuradeira(JOptionPane.showInputDialog("Digite a modelo do equipamento: "));

	}

	public void exibirFuradeira(Furadeira objeto,CalculoLucro objetoLucro) {
		
		JOptionPane.showMessageDialog(null, "DADOS DO EQUIPAMENTO FURADEIRA");
		JOptionPane.showMessageDialog(null, "Código: " + objeto.getCodigo());
		JOptionPane.showMessageDialog(null, "Marca: " + objeto.getMarca());
		JOptionPane.showMessageDialog(null, "Preço de compra: " + objeto.getPrecoDeCompra());
		JOptionPane.showMessageDialog(null, "Preço de venda: " + objeto.getPrecoDeVenda());
		JOptionPane.showMessageDialog(null, "Modelo do Equipamento : " + objeto.getModeloFuradeira());
		JOptionPane.showMessageDialog(null, "Lucro : " + objetoLucro.lucro(objeto));
	}
	
	
public void cadastrarMakita(Makita objeto) {
		
	    JOptionPane.showMessageDialog(null, "CADASTRO DO EQUIPAMENTO MAKITA");
		objeto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do equipamento: ")));
		objeto.setMarca(JOptionPane.showInputDialog("Digite a marca do equipamento: "));
		objeto.setPrecoDeCompra(Integer.parseInt(JOptionPane.showInputDialog("Digite o preço de compra do equipamento: ")));
		objeto.setPrecoDeVenda(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de venda do equipamento: ")));
		objeto.setModeloMakita(JOptionPane.showInputDialog("Digite a modelo do equipamento: "));

	}

public void exibirMakita(Makita objeto,CalculoLucro objetoLucro) {
	
	JOptionPane.showMessageDialog(null, "DADOS DO EQUIPAMENTO MAKITA");
	JOptionPane.showMessageDialog(null, "Código: " + objeto.getCodigo());
	JOptionPane.showMessageDialog(null, "Marca: " + objeto.getMarca());
	JOptionPane.showMessageDialog(null, "Preço de compra: " + objeto.getPrecoDeCompra());
	JOptionPane.showMessageDialog(null, "Preço de venda: " + objeto.getPrecoDeVenda());
	JOptionPane.showMessageDialog(null, "Modelo do Equipamento : " + objeto.getModeloMakita());
	JOptionPane.showMessageDialog(null, "Lucro : " + objetoLucro.lucro(objeto));
}
	
	
	
}
