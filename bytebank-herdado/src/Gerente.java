					// herda			// assina
public class Gerente extends Funcionario implements Autenticavel {
	
	// atributos
	private AutenticacaoUtil autenticador;

	// constructor padr�o	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
		}
		
		// m�todo para a bonifica��o
		@Override
		public double getBonificacao() {
			return 50;
		}
		
		// m�todo para receber a senha definida quando o objeto Gerente() � criado
		@Override
		public void setSenha(int senha) {
			this.autenticador.setSenha(senha);
		}
		
		// m�todo que confirma se a senha informada pelo gerente � a correta (definida na classe SistemaInterno)
		@Override
		public boolean autentica(int senha) {
			return this.autenticador.autentica(senha);				
		}
}
