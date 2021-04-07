					// assina
public class Cliente implements Autenticavel {
	
	// atributo
	private AutenticacaoUtil autenticador;
	
	// constructor padr�o
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	// m�todo para definir a senha quando o objeto Cliente() � criado
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	// m�todo que confirma se a senha informada pelo Cliente � a correta (ou seja, igual a definida na classe SistemaInterno)
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}
}
