/**
 * Desenvolva um programa que pergunte a distância de uma viagem em Km.
 * Calcule o preço da passagem, cobrando R$ 0,50 por Km para viagens de até 200Km e R$ R$ 0,45 para viagens mais longas.
 * Exemplo: Dada a distância 1000, o sistema deve mostrar a msg: 

	Você está prestes a começar uma viagem de 1000.0Km.
	O preço da sua passagem será de R$ 450.00
 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		double passagem = 0, band1 = 0.50, band2 = 0.45;
		int distancia = 0;
		
		System.out.println("Informe a distância percorrida na viagem: ");
		distancia = teclado.nextInt();
		
		if (distancia < 200) {
			passagem = distancia * band1;
		} else {
			passagem = distancia * band2;
		}
		
		System.out.println("Voce está prestes a começar uma viagem de " + distancia + "Km.");
		System.out.println("O preço de sua passagem será de R$ " + passagem);
	}
	
}

	
