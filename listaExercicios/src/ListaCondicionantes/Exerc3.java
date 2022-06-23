/**
 * 
 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
			
			String nome = "";
			float mediaap = 6;
			int freqap = 70;
			float nota1 = 0, nota2 = 0, media = 0;
			int frequencia;
			
			System.out.println("Informe o nome do aluno: ");
			nome = teclado.nextLine();
			System.out.println("Informe a primeira nota: ");
			nota1 = teclado.nextFloat();
			System.out.println("Informe a segunda nota: ");
			nota2 = teclado.nextFloat();
			System.out.println("Informe a frequencia do aluno: ");
			frequencia = teclado.nextInt();
			
			media = (nota1 + nota2)/2;
			
			if ((media >= mediaap) && (frequencia > freqap)) {
				System.out.println("O Aluno " + nome + " foi APROVADO com média " + media + " e frequência de " + frequencia + "%.");
			} else if ((media >= mediaap) && (frequencia <= freqap)) {
				System.out.println("O Aluno " + nome + " foi REPROVADO POR FALTAS, com média de " + media + " e frequencia de " + frequencia + "%.");
			} else {
				System.out.println("O Aluno " + nome + " foi REPROVADO.");
			}
					
			
			
		}
		
	}
