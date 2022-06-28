//1 – CRIE UM PROGRAMA QUE, A PARTIR DE UM TEXTO DIGITADO PELO USUÁRIO, CONTE O NÚMERO DE
//PALAVRAS E EXIBA O RESULTADO.

package listaString;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String fraseInformada = "";
		int i = 0;
		int qtdPalavras = 0;
		
		System.out.println("Digite uma frase de sua escolha: ");
		fraseInformada = input.nextLine();
		
		String[] palavras = fraseInformada.split(" ");
		for (i = 0; i < palavras.length; i++) {
			qtdPalavras++;
		}
		System.out.println("A frase informada possui " + qtdPalavras + " palavras.");

	}

}
