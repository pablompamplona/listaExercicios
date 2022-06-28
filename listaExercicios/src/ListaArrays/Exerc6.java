//6 – CRIE UM ARRAY DE INTEIROS DE TAMANHO 3, ONDE O USUÁRIO IRÁ INFORMAR OS VALORES QUE DEVERÃO
//SER DE 1 A 9. O PROGRAMA DEVERÁ IMPRIMIR NA TELA A TABUADA DOS NÚMEROS ARMAZENADOS NO ARRAY.
package ListaArrays;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int validaMultiplo;
		int multiplicadores[] = new int[3];
		int result = 0;
		int i;
		int ind = 0;

		for (i = 0; i < multiplicadores.length; i++) {
			System.out.println("Insira um numero de 1 a 9: ");
			validaMultiplo = teclado.nextInt();
			if ((validaMultiplo <= 0 ) && (validaMultiplo >= 10)) {
				do {
					System.out.println("Insira um numero de 1 a 9: ");
					validaMultiplo = teclado.nextInt();
				} while ((validaMultiplo <= 0) && (validaMultiplo >= 10));
			} else {
				multiplicadores[i] = validaMultiplo;
				for (ind = 0;ind <= 10; ind++) {
					result = multiplicadores[i] * ind;
					System.out.println(multiplicadores[i] + " x " + ind + " = " + result);
				}
			}
		}



	}

}
