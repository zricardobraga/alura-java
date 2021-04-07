
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel a) {
		boolean autenticou = a.autentica(this.senha);
		if(autenticou) {
			System.out.println("Acesso autorizado");
			
		} else {
			System.out.println("Acesso não autorizado");
		}	
	}

}
