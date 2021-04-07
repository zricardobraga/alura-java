
							// herda 			//assina
public class Administrador extends Funcionario implements Autenticavel {
	
	// atributos
	private AutenticacaoUtil autenticador;

	// constructor padr�o	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	// m�todo para a bonifica��o
	@Override
	public double getBonificacao() {
		return 50;
	}
	
	// m�todo para definir a senha quando o objeto Administrador() � criado
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	// m�todo que confirma se a senha informada pelo administrador � a correta (definida na classe SistemaInterno)
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);				
	}
}
