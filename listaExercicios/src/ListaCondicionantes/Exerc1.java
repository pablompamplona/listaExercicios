/**
 * Escreva um programa que leia a velocidade de um carro. Se ele ultrapassar 80 km/h, mostre uma mensagem dizendo que ele foi multado.
 *  A multa vai custar R$ 7,00 por cada km acima do limite. Exemplo: Dado o número: 100, o sistema deve mostrar a msg: 

	MULTADO! Você excedeu o limite permitido que é de 80Km/h.
	Você deve pagar uma multa de R$140.00!

	Caso o usuário digite a velocidade, 78 km/h, o sistema deve mostrar a msg:
	Muito bem! Tudo certo! Dirija com segurança!
 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int velocidade = 0, limite = 80, fator = 7;
		float multa = 0;
		
		System.out.println("Velocidade Auferida: ");
		velocidade = teclado.nextInt();
		
		if (velocidade > limite) {
			multa = (velocidade - limite) * fator;
			System.out.println("MULTADO! Você excedeu o limite permitido que é de 80Km/h.");
			System.out.println("Você deve pagar uma multa de R$ " + multa);
		} else {
			System.out.println("Muito bem! Tudo certo! Dirija com segurança!");
		}
		
		
	}
	
}
