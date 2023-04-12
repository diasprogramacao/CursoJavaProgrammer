package Serviços;


import javax.swing.JOptionPane;

import entidades.Equipamento;
import entidades.Furadeira;
import entidades.Makita;

public class Cadastro {
	
	
	
	public void cadastrarFuradeira() {
		
		Furadeira objeto= new Furadeira();
		
		JOptionPane.showMessageDialog(null, "CADASTRO DA FURADEIRA");
		objeto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do equipamento: ")));
		objeto.setMarca(JOptionPane.showInputDialog("Digite a marca do equipamento: "));
		objeto.setPrecoDeCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de compra do equipamento: ")));
		objeto.setPrecoDeVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda do equipamento: ")));
		objeto.setModeloFuradeira(JOptionPane.showInputDialog("Digite a modelo do equipamento: "));
		objeto.setLucro(objeto.getPrecoDeVenda()- objeto.getPrecoDeCompra());
		
		exibirFuradeira(objeto);
		
	}

	public void exibirFuradeira(Furadeira objeto) {
		
		
		JOptionPane.showMessageDialog(null, "DADOS DO EQUIPAMENTO FURADEIRA");
		JOptionPane.showMessageDialog(null, "Código: " + objeto.getCodigo());
		JOptionPane.showMessageDialog(null, "Marca: " + objeto.getMarca());
		JOptionPane.showMessageDialog(null, "Preço de compra: " + objeto.getPrecoDeCompra());
		JOptionPane.showMessageDialog(null, "Preço de venda: " + objeto.getPrecoDeVenda());
		JOptionPane.showMessageDialog(null, "Modelo do Equipamento : " + objeto.getModeloFuradeira());
		JOptionPane.showMessageDialog(null, "Lucro : " + objeto.getLucro());
	}
	
	
public void cadastrarMakita() {
	
		Makita objeto = new Makita();
		
	    JOptionPane.showMessageDialog(null, "CADASTRO DO EQUIPAMENTO MAKITA");
		objeto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do equipamento: ")));
		objeto.setMarca(JOptionPane.showInputDialog("Digite a marca do equipamento: "));
		objeto.setPrecoDeCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de compra do equipamento: ")));
		objeto.setPrecoDeVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda do equipamento: ")));
		objeto.setModeloMakita(JOptionPane.showInputDialog("Digite a modelo do equipamento: "));
		objeto.setLucro(objeto.getPrecoDeVenda() - objeto.getPrecoDeCompra());
		
		exibirMakita(objeto);
		
	}

public void exibirMakita(Makita objeto) {
	
	JOptionPane.showMessageDialog(null, "DADOS DO EQUIPAMENTO MAKITA");
	JOptionPane.showMessageDialog(null, "Código: " + objeto.getCodigo());
	JOptionPane.showMessageDialog(null, "Marca: " + objeto.getMarca());
	JOptionPane.showMessageDialog(null, "Preço de compra: " + objeto.getPrecoDeCompra());
	JOptionPane.showMessageDialog(null, "Preço de venda: " + objeto.getPrecoDeVenda());
	JOptionPane.showMessageDialog(null, "Modelo do Equipamento : " + objeto.getModeloMakita());
	JOptionPane.showMessageDialog(null, "Lucro : " + objeto.getLucro());
}
	

  public void menu () {
	  
	   int id = 0;
			  
	  id = Integer.parseInt(JOptionPane.showInputDialog(" Cadastro de Furadeira digite 1 e Cadastro de Makita digite 2"));
	  
	  Cadastro cadastro = new Cadastro();
	 
	 if (id == 1) {
		 cadastro.cadastrarFuradeira();
	 } else {
		 cadastro.cadastrarMakita();
	 }
  }
	
	
}
