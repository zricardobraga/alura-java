package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {
		
		public static void main(String[] args) {
			char letra = 'a';
			System.out.println(letra + "!");
			
			char valor = 65;
			System.out.println(valor);
			
			// valor = valor + 1; Essa linha não compila
			valor = (char) (valor + 1); 
			System.out.println(valor);
			
			String palavra = "Bla bla bla ";
			System.out.println(palavra + 2020);
		}
		
	}
