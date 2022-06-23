/**
 * Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar
 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num1 = 0;
		
		System.out.println("Informe um número inteiro: ");
		num1 = teclado.nextInt();
		if (num1 % 2 == 0) {
			System.out.println("Esse número é par!!!!");
		} else { 
			System.out.println("Esse número é ímpar!!!");
		}
	}
	
}

	