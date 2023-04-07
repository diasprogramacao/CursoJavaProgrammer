package Principal;

import javax.swing.JOptionPane;

import entidades.Celular;
import entidades.Televisao;

public abstract class Principal {

	public static void main(String[] args) {
		
	 Celular c1 = new Celular();
	 
	 c1.setCodigo(JOptionPane.showInputDialog("Digite o c�digo do Celular"));
	 JOptionPane.showMessageDialog(null, "O c�digo digitado : " + c1.getCodigo());
	 
	 c1.setModelo(JOptionPane.showInputDialog("Digite o Modelo do Celular"));
	 JOptionPane.showMessageDialog(null, "O c�digo digitado : " + c1.getModelo());
	 
	 c1.setSistemaOperacional(JOptionPane.showInputDialog("Digite o Sistema Operacional do Celular"));
	 JOptionPane.showMessageDialog(null, "O c�digo digitado : " + c1.getSistemaOperacional());
	 
	 Televisao t1 = new Televisao();
	 
	 t1.setCodigo(JOptionPane.showInputDialog("Digite o c�digo da televis�o : "));
	 JOptionPane.showMessageDialog(null, "C�digo da televis�o : " + t1.getCodigo());
	 
	 t1.setModelo(JOptionPane.showInputDialog("Digite o modelo da televis�o : "));
	 JOptionPane.showMessageDialog(null, "C�digo da televis�o : " + t1.getModelo());

	 t1.setQualidadeImagem(JOptionPane.showInputDialog("Digite a qualidade da televis�o : "));
	 JOptionPane.showMessageDialog(null, "C�digo da televis�o : " + t1.getQualidadeImagem());

	 
	}

}
