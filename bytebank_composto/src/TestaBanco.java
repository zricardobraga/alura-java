
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222-222-222-22";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		contaDoPaulo.titular = paulo;
		System.out.println("BYTEBANK - 24 horas");
		System.out.println();
		System.out.println();
		System.out.println("Titular: " + contaDoPaulo.titular.nome);
		System.out.println("Profissão: " + contaDoPaulo.titular.profissao);
	}

}
