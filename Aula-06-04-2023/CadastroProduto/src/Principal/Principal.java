package Principal;

import javax.swing.JOptionPane;

import entidades.Celular;
import entidades.Televisao;

public abstract class Principal {

	public static void main(String[] args) {
		
	 Celular c1 = new Celular();
	 
	 c1.setCodigo(JOptionPane.showInputDialog("Digite o código do Celular"));
	 JOptionPane.showMessageDialog(null, "O código digitado : " + c1.getCodigo());
	 
	 c1.setModelo(JOptionPane.showInputDialog("Digite o Modelo do Celular"));
	 JOptionPane.showMessageDialog(null, "O código digitado : " + c1.getModelo());
	 
	 c1.setSistemaOperacional(JOptionPane.showInputDialog("Digite o Sistema Operacional do Celular"));
	 JOptionPane.showMessageDialog(null, "O código digitado : " + c1.getSistemaOperacional());
	 
	 Televisao t1 = new Televisao();
	 
	 t1.setCodigo(JOptionPane.showInputDialog("Digite o código da televisão : "));
	 JOptionPane.showMessageDialog(null, "Código da televisão : " + t1.getCodigo());
	 
	 t1.setModelo(JOptionPane.showInputDialog("Digite o modelo da televisão : "));
	 JOptionPane.showMessageDialog(null, "Código da televisão : " + t1.getModelo());

	 t1.setQualidadeImagem(JOptionPane.showInputDialog("Digite a qualidade da televisão : "));
	 JOptionPane.showMessageDialog(null, "Código da televisão : " + t1.getQualidadeImagem());

	 
	}

}
