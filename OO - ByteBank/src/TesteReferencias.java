
public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300.00;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
	}

}