/**
 * Entrar com a idade de uma pessoa e informar:
	Se é maior de idade
	Se é menor de idade
 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
			
			int idade = 0;
			int maioridade = 18;
			
			System.out.println("Informe a idade: ");
			idade = teclado.nextInt();
			
			if (idade >= maioridade) {
				System.out.println("Essa pessoa é maior de idade.");
			} else {
				System.out.println("Essa pessoa é menor de idade.");
			}
		}
		
	}
