package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		int idade = 22;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2;

			if (idade >= 18 && acompanhado) {

				System.out.println("Voc� tem mais de 18 anos!");
				System.out.println("Bem vindo!");

			} else {
				System.out.println("Infelizmente voc� n�o pode entrar!");

				}
			} 
	}

