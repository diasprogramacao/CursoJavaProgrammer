package telas;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controladores.ControladorTelaListaConvidado;
import entidades.Convidado;

public class TelaListaConvidado {
	
	public void exibirListaConvidado (List <Convidado> listaConvidado,JFrame frameMenuPrincipal) {
		
		int quantidadeLinhas = listaConvidado.size();
		
		String [][] tabelaString = new String [quantidadeLinhas][5];
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		for(Convidado convidado:listaConvidado) {
			
			tabelaString [posicaoLinha] [posicaoColuna] = convidado.getNome();
			posicaoColuna++;
			tabelaString [posicaoLinha] [posicaoColuna] = convidado.getCpf();
			posicaoColuna++;
			tabelaString [posicaoLinha] [posicaoColuna] = convidado.getConvite();
			posicaoColuna++;
			tabelaString [posicaoLinha] [posicaoColuna] = convidado.getEndereco();
			posicaoColuna++;
			tabelaString [posicaoLinha] [posicaoColuna] = convidado.getProfissao();
			posicaoLinha++;
			posicaoColuna=0;
			
		
		}
			
		JFrame frameTelaListaConvidado = new JFrame();
		frameTelaListaConvidado.setSize(500,600);
		
		String nomeColunas[]= {"NOME","CPF","CONVITE","ENDEREÇO","PROFISSÃO"};
		JTable TabelaConvidado = new JTable(tabelaString,nomeColunas);
		TabelaConvidado.setBounds(50, 70, 400, 400);
		JScrollPane scrollPaneListarJogador = new JScrollPane(TabelaConvidado);
		
		JPanel painelTelaListaConvidado = new JPanel();
		painelTelaListaConvidado.add(scrollPaneListarJogador);
		
		JButton botaoTelaListaConvidado = new JButton("Voltar - Tela Inicial");
		painelTelaListaConvidado.add(botaoTelaListaConvidado);
		
		frameTelaListaConvidado.add(painelTelaListaConvidado);
		frameTelaListaConvidado.setVisible(true);
		
		ControladorTelaListaConvidado controladorTelaListaConvidado = new ControladorTelaListaConvidado(frameTelaListaConvidado,frameMenuPrincipal);
		botaoTelaListaConvidado.addActionListener(controladorTelaListaConvidado);
	}

}
