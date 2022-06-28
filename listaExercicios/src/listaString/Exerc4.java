//4 – CRIE UM PROGRAMA ONDE O USUÁRIO IRÁ DIGITAR UMA PALAVRA E APRESENTE AS SEGUINTES
//INFORMAÇÕES:
//A) O NÚMERO DE CARACTERES DA PALAVRA.
//B) APALAVRA COM TODAS SUAS LETRAS EM MAIÚSCULO.
//C) O NÚMERO DE VOGAIS DA PALAVRA.
//D) SE A PALAVRA DIGITADA COMEÇA COM UM TERMO A SER DIGITADO PELO USUÁRIO
//E) SE A PALAVRA DIGITADA TERMINA COM UM TERMO A SER DIGITADO PELO USUÁRIO.

package listaString;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String palavraInformada = "";
		int qtdVogais = 0;
		int i = 0;
		String confereInicio = "";
		String confereFinal = "";

		System.out.println("Digite uma palavra aleatoria de sua escolha: ");
		palavraInformada = input.nextLine();
		//A
		System.out.println("A palavra informada possui " + palavraInformada.length() + " caracteres.");
		//B
		System.out.println("Palavra informada em letras maiusculas: " + palavraInformada.toUpperCase());
		//C
		palavraInformada.toLowerCase();
		for (i = 0; i < palavraInformada.length(); i++) {
			char c = palavraInformada.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				qtdVogais++;
			}
		}
		System.out.println("A palavra informada possui " + qtdVogais + " vogais.");
		System.out.println("");
		//D
		System.out.println("Informe o termo que vc deseja conferir se e igual ao inicio da palavra informada:");
		confereInicio = input.nextLine();
		boolean inicia = palavraInformada.startsWith(confereInicio);
		if (inicia) {
			System.out.println("A palavra " + palavraInformada + " realmente comeca com " + confereInicio);
		} else {
			System.out.println("O termo informado nao confere com o inicio da palavra " + palavraInformada);
		}
		System.out.println("");
		//E
		System.out.println("Informe o termo que vc deseja conferir se e igual ao final da palavra informada:");
		confereFinal = input.nextLine();
		boolean termina = palavraInformada.endsWith(confereFinal);
		if (termina) {
			System.out.println("A palavra " + palavraInformada + " realmente termina com " + confereFinal);
		} else {
			System.out.println("O termo informado nao confere com o inicio da palavra " + palavraInformada);
		}
	}	

}
