/**
 * Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se somar os dois,
 * caso contrário multiplique A por B.
 * Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma variável C
 * e mostrar seu conteúdo na tela.
 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num1 = 0, num2 = 0;
		int result = 0;
		
		System.out.println("Informe um número inteiro: ");
		num1 = teclado.nextInt();
		System.out.println("Informe outro numero inteiro: ");
		num2 = teclado.nextInt();
		
		if (num1 == num2) {
			result = num1 + num2;
			System.out.println("A soma dos valores informados é igual a " + result);
		} else {
			result = num1 * num2;
			System.out.println("O produto dos valores informados é igual a " + result);
		}
	}
	
}

	

	