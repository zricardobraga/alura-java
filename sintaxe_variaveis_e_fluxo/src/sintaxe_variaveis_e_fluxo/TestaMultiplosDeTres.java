package sintaxe_variaveis_e_fluxo;

public class TestaMultiplosDeTres {
	public static void main(String[] args) {
		/*
		for(int contador = 1; contador < 100; contador++) {
			if(contador % 3 == 0) {
				System.out.println(contador);	
			}			
		}
		*/
		
		for(int i = 3; i < 100; i += 3) {
			// a letra i é serve como contador quando usamos o for
			System.out.println(i);
			
		}	
	}
}
