package Principal;

import servi�os.CadastroConvidado;

public class Principal {
	
	public static void main(String[]agrs) {
		
		CadastroConvidado  cadastro1 = new CadastroConvidado();
		
		cadastro1.ArquivoNormal(cadastro1.cadastroNormal());
		cadastro1.ArquivoVip(cadastro1.cadastroVip());
	}
	
	

}
