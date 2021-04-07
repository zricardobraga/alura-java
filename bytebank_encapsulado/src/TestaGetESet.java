
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 123456);
		
		conta.setNumero(123456);
		conta.setAgencia(1234);
		
		System.out.println("ByteBank - 30 horas");
		System.out.println();
		System.out.println("Número da conta: " + conta.getNumero() + " ---- " + "Número da agência: " + conta.getAgencia());
		System.out.println();
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		
		conta.deposita(1000.00);
		
		System.out.println("Titular da conta corrente: " + conta.getTitular().getNome());
		System.out.println();
		
		conta.getTitular().setProfissao("Programador");
		System.out.println("Profissão: " + conta.getTitular().getProfissao());
		System.out.println();
		
		System.out.println("Saldo atualizado até o momento: " + conta.getSaldo());
	}

}
