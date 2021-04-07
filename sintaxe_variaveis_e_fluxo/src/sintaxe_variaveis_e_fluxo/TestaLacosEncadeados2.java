package sintaxe_variaveis_e_fluxo;

public class TestaLacosEncadeados2 {
	public static void main(String[] args) {
		for (int linha = 0; linha < 10; linha++) {
	        for(int coluna = 0; coluna <= linha; coluna++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    
		
		/*
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				if(linha < coluna) {
					break;
				}
				
				System.out.print("*");
			}
			System.out.println();
			
			*/
		}
		
		
	}
		
}
