/**
 * Crie um algoritmo que leia um valor e a partir disso faça: 
 * (1) se o valor for 1 e 2, mostre o valor elevado ao cubo; 
 * (2) se o valor for múltiplo de 3 mostre o fatorial desse número; 
 * (3) se o valor for os valores 4, 5, 7 ou 8, mostre o valor dividido 9.
 * Caso não seja nenhum dos valores, informe como “valor inválido”.

 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double num1 = 0, result = 0; 
		
		
		System.out.println("Informe um número de 1 a 9: ");
		num1 = teclado.nextDouble();
		if ((num1 == 1) || (num1 == 2)) {
			result = Math.pow(num1, 3);
			System.out.println("O resultado do número informado elevado ao cubo é " + result);
		} else if (num1 % 3 == 0) {
			double f = num1;
			double x = num1;
			while (x > 1) {
				f = f * (x - 1); 
				x--;
								
			}
				System.out.println("O resultado do fatorial do número informado é " + f);
		} else if ((num1 == 4) || (num1 == 5) || (num1 == 7) || (num1 == 8)) {
			result = num1 / 9;
			System.out.printf("O resultado do número informado dividido por 9 é = %.2f %n" , result);
		}
	}
}



	