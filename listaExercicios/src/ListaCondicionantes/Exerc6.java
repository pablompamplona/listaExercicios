/**
 * Calcule a média dos alunos e indique se ele está aprovado ou reprovado.
 * Permita que este aluno faça exame para poder ser aprovado.
	4 notas bimestrais
	Média para aprovação = 7,0
	Média para aprovação para Exame = 6,0
 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
			
			String nome = "";
			float mediaap = 7, mediaex = 6;
			float notabimestral = 0, media = 0;
			int bimestre = 0, i = 0;
					
			System.out.println("Insira o nome do aluno: ");
			nome = teclado.nextLine();
			
			for (i = 0; i < 4; i++) {
				bimestre++;
				System.out.println("Insira a nota do " + bimestre + "o. bimestre: ");
				notabimestral = teclado.nextInt() + notabimestral;
			}
			
			media = (notabimestral/bimestre);
			
			if (media >= mediaap) {
				System.out.println("O aluno " + nome + " foi APROVADO.");
			} else if ((media < mediaap) && (media >= mediaex)) {
				System.out.println("O aluno " + nome + " ficou em EXAMES FINAIS.");
			} else {
				System.out.println("O aluno" + nome + " foi REPROVADO.");
			}
		}
		
	}
	
		
	
		
			