/**
 * 
 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
			
			int sim = 0, nao = 0, i = 0;
			String opcao = "";
			
			for (i = 0; i < 5; i++) {
				System.out.println("Você aprovou o produto apresentado? (S/N)");
				opcao = teclado.nextLine();
				if (opcao.equals("s")) {
					sim++;			
				} else if (opcao.equals("n")) {
					nao++;
				}
			}
			System.out.println(sim + " pessoas aprovaram o produto e " + nao + " pessoas reprovaram o produto.");
		}
		
	}
	
		