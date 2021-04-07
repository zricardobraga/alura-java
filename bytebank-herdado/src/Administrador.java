
							// herda 			//assina
public class Administrador extends Funcionario implements Autenticavel {
	
	// atributos
	private AutenticacaoUtil autenticador;

	// constructor padrão	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	// método para a bonificação
	@Override
	public double getBonificacao() {
		return 50;
	}
	
	// método para definir a senha quando o objeto Administrador() é criado
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	// método que confirma se a senha informada pelo administrador é a correta (definida na classe SistemaInterno)
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);				
	}
}
