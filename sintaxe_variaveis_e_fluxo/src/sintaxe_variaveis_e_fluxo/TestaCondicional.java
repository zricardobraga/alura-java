package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais!");

	int idade = 16;
		int quantidadePessoas = 1;

		if (idade >= 18) {

			System.out.println("Voc� tem mais de 18 anos!");
			System.out.println("Bem vindo!");

		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� tem mais de 18, mas pode entrar, pois est� acompanhado");
			} else {

				System.out.println("Infelizmente voc� n�o pode entrar!");

			}
		} 
		

	}

}
