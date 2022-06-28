//2 – CRIE UM PROGRAMA ONDE O USUÁRIO IRÁ DIGITAR UMA FRASE. DEPOIS O PROGRAMA DEVERÁ SOLICITAR
//QUE O USUÁRIO DIGITE UMA PALAVRA. O PROGRAMA DEVE APRESENTAR A FRASE DIGITADA, A PALAVRA
//DIGITADA, BEM COMO A QUANTIDADE DE VEZES QUE A PALAVRA DIGITADA APARECE NA FRASE.
package listaString;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String fraseInformada = "";
		String palavraInformada = "";
		
		System.out.println("Digite uma frase de sua escolha: ");
		fraseInformada = input.nextLine();
		System.out.println("Digite uma palavra para verificar se consta na frase: ");
		palavraInformada = input.nextLine();
		
		fraseInformada.toLowerCase();
		palavraInformada.toLowerCase();
		
		if (fraseInformada.contains(palavraInformada)) {
			System.out.println("A palavra " + palavraInformada + " consta na frase.");
		} else {
			System.out.println("Não foi possivel localizar a palavra " + palavraInformada);
		}

	}

}
