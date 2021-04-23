package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

// realmente e somente receber algum que tem o contrato da interface de permitirAcessi e chamar o autenticar
public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar(){
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao( PermitirAcesso acesso) {
			this.permitirAcesso = acesso;
			
		
	}
}
