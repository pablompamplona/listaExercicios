/**
 * Criar uma calculadora que realize as operações abaixo com 2 números:
 *  somar, diminuir, multiplicar, dividir, número elevado a N, raiz quadrada.
 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, opcao = 0, expo = 0;
		double result = 0, result1 = 0, result2 = 0;
		
		System.out.println("Insira o primeiro número: ");
		num1 = teclado.nextInt();
		System.out.println("Insira o segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("qual operação você deseja fazer?: ");
		System.out.println(" Opção 1   -   ADIÇÃO");
		System.out.println(" Opção 2   -   SUBTRAÇÃO");
		System.out.println(" Opção 3   -   MULTIPLICAÇÃO");
		System.out.println(" Opção 4   -   DIVISÃO");
		System.out.println(" Opção 5   -   POTÊNCIA");
		System.out.println(" Opção 6   -   RAIZ QUADRADA");
		System.out.println("Insira o número correspondente a operação desejada:");
		opcao = teclado.nextInt();
		if (opcao == 1) {
			result = (num1 + num2);
			System.out.println("A soma dos números informados é " + result);					
		} else if (opcao == 2 ) {
			result = (num1 - num2);
			System.out.println("A diferença dos números informados é " + result);
		} else if (opcao == 3) {
			result = (num1 * num2);
			System.out.println("O produto da multiplicação dos números informados é " + result);
		} else if (opcao == 4) {
			result = (num1 / num2);
			System.out.println("O resultado da divisao dos números informados é " + result);
		} else if (opcao == 5) {
			System.out.println("Insira o expoente: ");
			expo = teclado.nextInt();
			result1 = Math.pow(num1, expo);
			result2 = Math.pow(num2, expo);
			System.out.println("O resultado do primeiro número elevado a " + expo + "a. potência é " + result1);
			System.out.println("O resultado do segundo número elevado a " + expo + "a. potência é " + result2);
		} else if (opcao == 6) {
			result1 = Math.sqrt(num1);
			result2 = Math.sqrt(num2);
			System.out.println("A raiz quadrada do primeiro número é " + result1);
			System.out.println("A raiz quadrada do segundo número é " + result2);
		}
		
	}
	
}

	