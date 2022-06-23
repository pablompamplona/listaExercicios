/**
 *  O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde
 *  para dar uma indicação sobre a condição de peso de uma pessoa adulta.
 *  A fórmula é IMC = peso / (altura)2. Elabore um algoritmo que leia o peso e a altura de um adulto
 *  e mostre sua condição de acordo com a tabela abaixo. 

	IMC em adultos 
	Abaixo de 18,5 -> Abaixo do peso 
	Entre 18,5 e 25 -> Peso normal 
	Entre 25 e 30 -> Acima do peso 
	Acima de 30 -> obeso
	 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double peso = 0, altura = 0, imc = 0;
		
		System.out.println("Informe o seu peso: ");
		peso = teclado.nextDouble();
		System.out.println("Informe sua altura: ");
		altura = teclado.nextDouble();
		
		imc = peso / (Math.pow(altura, 2));
				
		if (imc < 18.5) {
			System.out.println("Seu IMC calculado foi de: " + imc);
			System.out.println("Voce esta abaixo do peso");
		} else if ((imc >= 18.5) && (imc < 25)) {
			System.out.println("Seu IMC calculado foi de: " + imc);
			System.out.println("Seu peso esta normal");
		} else if ((imc >= 25) && (imc < 30)) {
			System.out.println("Seu IMC calculado foi de: " + imc);
			System.out.println("Voce esta acima do peso");
		} else {
			System.out.println("Seu IMC calculado foi de: " + imc);
			System.out.println("Voce esta obeso.... Gordao!!!");
		}
	
	}

}
