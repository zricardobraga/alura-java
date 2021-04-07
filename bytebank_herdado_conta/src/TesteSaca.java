
public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 3210);
		conta.deposita(200.0);
		try {
		conta.saca(210.0);
		}catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println(conta.getSaldo());
		
	}

}
