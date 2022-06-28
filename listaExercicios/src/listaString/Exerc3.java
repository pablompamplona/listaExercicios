//3 – CRIE UM PROGRAMA ONDE O USUÁRIO IRÁ DIGITAR UMA FRASE E O PROGRAMA IRÁ CONTABILIZAR A
//QUANTIDADE DE CADA VOGAL DA FRASE DIGITADA. CONSIDERE QUE A FRASE NÃO POSSUA NENHUMA
//ACENTUAÇÃO. POR FIM APRESENTE A FRASE E A QUANTIDADE DE CADA VOGAL.

package listaString;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String fraseInformada = "";
		int qtdVogais = 0;
		int i = 0;
		
		System.out.println("Digite uma frase de sua escolha: ");
		fraseInformada = input.nextLine();
		for (i = 0; i < fraseInformada.length(); i++) {
			char c = fraseInformada.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				qtdVogais++;
			}
		}
		System.out.println("Frase escolhida pelo usuario: " + "'" + fraseInformada + "'.");
		System.out.println("A frase informada possui " + qtdVogais + " vogais.");
	}

}
