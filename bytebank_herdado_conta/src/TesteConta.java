
public class TesteConta {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(111, 123456);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(111, 101010);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		
	}

}
