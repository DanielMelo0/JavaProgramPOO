package cursojava.interfaces;

import cursojava.classes.Secretario;

/*Interface ser� contrato de autentica��o*/
public interface PermitirAcesso {

	public boolean autenticar(String login, String senha);
	public boolean autenticar();
}
