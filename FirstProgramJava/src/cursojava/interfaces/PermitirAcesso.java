package cursojava.interfaces;

import cursojava.classes.Secretario;

/*Interface será contrato de autenticação*/
public interface PermitirAcesso {

	public boolean autenticar(String login, String senha);
	public boolean autenticar();
}
