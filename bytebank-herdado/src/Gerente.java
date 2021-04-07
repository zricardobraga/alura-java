					// herda			// assina
public class Gerente extends Funcionario implements Autenticavel {
	
	// atributos
	private AutenticacaoUtil autenticador;

	// constructor padrão	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
		}
		
		// método para a bonificação
		@Override
		public double getBonificacao() {
			return 50;
		}
		
		// método para receber a senha definida quando o objeto Gerente() é criado
		@Override
		public void setSenha(int senha) {
			this.autenticador.setSenha(senha);
		}
		
		// método que confirma se a senha informada pelo gerente é a correta (definida na classe SistemaInterno)
		@Override
		public boolean autentica(int senha) {
			return this.autenticador.autentica(senha);				
		}
}
