/**
 *  A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes.
 *  Esta pesquisa deseja coletar os dados sobre o salário e número de filhos de cada habitante
 *   e após as leituras, escrever: 
	
	Média de salário da população 
	Média do número de filhos 
	Maior salário dos habitantes 
	Percentual de pessoas com salário menor que R$ 150,00

Considere a população para 5 pessoas.

 */
package ListaCondicionantes;
import java.util.Scanner;


/**
 * @author User
 *
 */
public class Exerc10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		String nome = "";
		float salario = 0, salariocorrente = 0, mediasal = 0, maiorsalario = 0, percsalarioabaixo = 0;
		int filhos = 0, i = 0, qtd = 0, salarioabaixo = 0;
		double medfilhos = 0;
		
		
		for (i = 0; i < 5; i++) {
			System.out.println("Informe o nome do habitante: ");
			nome = teclado.nextLine();
			System.out.println("Informe valor do salário: ");
			salariocorrente = teclado.nextFloat();
			qtd++;
			if (salariocorrente <= 150) {
				salarioabaixo++;
			}
			salario = salariocorrente + salario;
			if (salariocorrente > maiorsalario) {
				maiorsalario = salariocorrente;
			} 				
			System.out.println("Informe a quantidade de filhos: ");
			filhos = teclado.nextInt() + filhos;
			teclado.nextLine();
		}	
	
		
		mediasal = (salario/qtd);
		medfilhos = (filhos/qtd);
		percsalarioabaixo = (salarioabaixo*100)/qtd;
		
		
		System.out.println("A média de salário por habitante é de R$ " + mediasal + ".");
		System.out.println("A média de filhos por habitante é de " + medfilhos + " filhos.");
		System.out.println("O maior salário registrado entre a população foi de R$ " + maiorsalario + ".");
		System.out.println(percsalarioabaixo + "% dos habitantes recebem abaixo de R$ 150,00.");

	}

}