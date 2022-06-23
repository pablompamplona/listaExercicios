/**
 * Construa um algoritmo que:
	a) - Leia várias fichas contendo cada uma:
* 	 sua matrícula
*	 o nome de um atleta
*	 o seu peso
* 	 o sexo
*	 a idade
	b) - Calcule e imprima:
	a) - O peso e a matrícula do atleta mais pesado;
	b) - A média de idade dos atletas do sexo feminino;
	c) - A matrícula e o peso do atleta masculino de menor peso.
	Obs: O programa deve finalizar quando for digitada matrícula = 0
 */
package ListaRepeticao;
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
		
		String nome = "", nomeMaisPeso = "", nomeMenosPeso = "";
		int matric = 0, idade = 0, sexo = 0, idadefem = 0, matricmenospeso = 0, qtdFem = 0, matricmaispeso = 0, medIdadeFem = 0;
		int peso = 0, maispesado = 0, menospesado = 1000000;
		
		do {
			System.out.println("Informe o codigo da matricula: ");
			matric = teclado.nextInt();
			teclado.nextLine();
			if (matric != 0) {
				System.out.println("Informe o nome do atleta: ");
				nome = teclado.nextLine();
				System.out.println("Informe o peso do atleta: ");
				peso = teclado.nextInt();
				teclado.nextLine();
				if (peso > maispesado) {
					maispesado = peso;
					matricmaispeso = matric;
					nomeMaisPeso = nome;
				}
				System.out.println("Informe o sexo do atleta (1 - Masc / 2 - Fem): ");
				sexo = teclado.nextInt();
				teclado.nextLine();
				if ((sexo != 1) && (sexo != 2)) {
					do {
						System.out.println("OPCAO INVALIDA!!! Repita a operacao.");
						System.out.println("Informe o sexo do atleta (1 - Masc / 2 - Fem): ");
						sexo = teclado.nextInt();
					} while ((sexo != 1) && (sexo != 2));
				}
				if (sexo == 2) {
					idadefem = idade + idadefem;
					qtdFem++;
				}
				if ((sexo == 1) && (peso < menospesado)) {
						menospesado = peso;
						matricmenospeso = matric;
						nomeMenosPeso = nome;
					}
				System.out.println("Informe a idade do atleta: ");
				idade = teclado.nextInt();
				}
				
			
		} while (matric != 0);
		
		medIdadeFem = (idadefem/qtdFem);
				
		System.out.println("O atleta " + nomeMaisPeso + ", da matricula: " + matricmaispeso + " e o mais pesado, com " + maispesado + " Kg.");
		System.out.println("");
		System.out.println("A media de idade dos atletas do sexo feminino e de " + medIdadeFem + " anos." );
		System.out.println("");
		System.out.println("O atleta " + nomeMenosPeso + ", da matricula: " + matricmenospeso + " e o masculino menos pesado, com " + menospesado + "kg.");
		
	}
	
}
