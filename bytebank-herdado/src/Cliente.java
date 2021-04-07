					// assina
public class Cliente implements Autenticavel {
	
	// atributo
	private AutenticacaoUtil autenticador;
	
	// constructor padrão
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	// método para definir a senha quando o objeto Cliente() é criado
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	// método que confirma se a senha informada pelo Cliente é a correta (ou seja, igual a definida na classe SistemaInterno)
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}
}
