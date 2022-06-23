/**
 *  Crie um algoritmo que leia um valor e a partir disso faça:
 * (1) se for um valor negativo, mostre o módulo (valor sem sinal) do valor;
 * (2) se for um valor maior do que 10, solicite outro valor e mostre a diferença entre eles;
 * (3) Caso o valor não seja de nenhuma condição anterior, mostre o valor dividido por 5.
 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num1 = 0, num2 = 0;
		double result = 0;
		
		System.out.println("Informe um número inteiro: ");
		num1 = teclado.nextInt();
		
		if (num1 < 0) {
			result = Math.abs(num1);
			System.out.println("O módulo do número informado é " + result);
		} else if (num1 > 10) {
			System.out.println("Informe um novo número inteiro: ");
			num2 = teclado.nextInt();
			if (num1 > num2) {
				result = num1 - num2;
			} else {
				result = num2 - num1;
			}
			System.out.println("A diferença entre os dois números é " + result);
		} else {
			result = (num1/5.0);
			System.out.printf("O resultado do número informado dividido por 5 é = %.2f %n" , result);
		}
		
	}
	
}

	