/**
 *  Crie um algoritmo que leia um valor e a partir disso faça: 
 * (1) se o valor for 1, 2 ou 3, mostre o valor elevado ao quadrado; 
 * (2) se o valor for o número 4 ou 9, mostre a raiz quadrada do número;
 * (3) se for os valores 6, 7 e 8, mostre o valor dividido 9.
 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
		double result = 0;
		
		System.out.println("Insira um numero de 1 a 9:");
		num = teclado.nextInt();
		
		if ((num == 1) || (num == 2) || (num == 3)) {
			result = Math.pow(num, 2);
			System.out.println("O número escolhido elevado ao quadrado resulta em: " + result);
		} else if ((num == 4) || (num == 9)) {
			result = Math.sqrt(num);	
			System.out.println("A raiz quadrada do número escolhido é: " + result);
		} else if ((num == 6) || (num == 7) || (num == 8)) {
			result = (num/9.0);
			System.out.printf("O numero escolhido divido por 9 resulta em: %.2f %n", result);
		}
			
	}

}