public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50); //chamada do "procedimento" criado na classe conta
		System.out.println("O saldo na sua conta é de: R$ " + contaDoPaulo.saldo); 
		
		//boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println("O novo saldo da conta corrente é: " + contaDoPaulo.saldo);
		//System.out.println(conseguiuRetirar); imprime na tela o retorno do método boolean
		
		Conta contaDaMarcela  = new Conta();
		contaDaMarcela.deposita(1000.00);
		System.out.println("Saldo antigo da conta da Marcela: R$ " + contaDaMarcela.saldo);
		contaDaMarcela.transfere(300, contaDoPaulo);
		System.out.println("Novo saldo da conta da Marcela: R$ " + contaDaMarcela.saldo);
		
		System.out.println("Novo saldo da conta do Paulo: R$ " + contaDoPaulo.saldo);
	}
	
}

	