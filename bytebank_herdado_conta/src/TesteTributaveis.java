
public class TesteTributaveis {
	public static void main(String[] args) {
		
		// instanciando o Objeto SeguroDeVida
		SeguroDeVida seguro = new SeguroDeVida();
		
		// instanciando o Objeto ContaCorrente
		ContaCorrente cc = new ContaCorrente(1234, 56789);
		cc.deposita(100.0);
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		calculador.registra(seguro);
		calculador.registra(cc);
		
		System.out.println(calculador.getTotalImposto());
	}
}
