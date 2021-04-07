public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.00;
		primeiraConta.agencia = 3776;
		primeiraConta.numero = 157756;
		primeiraConta.titular = "Fulano";
		
		double depositoPrimeiraConta = 500.00;  
		
		System.out.println("Agência: " + primeiraConta.agencia + " --- " + "Conta Corrente: " + primeiraConta.numero);
		System.out.println();
		System.out.println("Saldo anterior: R$ " + primeiraConta.saldo);
		System.out.println("Depósito: R$ " + depositoPrimeiraConta);
		System.out.println();
		System.out.println(primeiraConta.titular + ", seu saldo é: R$ " + (primeiraConta.saldo + depositoPrimeiraConta));
		
		System.out.println();
		System.out.println("************************************************************************");
		System.out.println();
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 2000.00;
		segundaConta.agencia = 1234;
		segundaConta.numero = 123456;
		segundaConta.titular = "Ciclano";
		
		double depositoSegundaConta = 1000.00;
		
		System.out.println("Agência: " + segundaConta.agencia + " --- " + "Conta Corrente: " + segundaConta.numero);
		System.out.println();
		System.out.println("Saldo anterior: R$ " + segundaConta.saldo);
		System.out.println("Depósito: R$ " + depositoSegundaConta);
		System.out.println();
		System.out.println(segundaConta.titular + ", seu saldo é: R$ " + (segundaConta.saldo + depositoSegundaConta));
	}

}
