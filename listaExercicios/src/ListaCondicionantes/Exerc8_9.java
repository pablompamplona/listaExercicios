/**
 *  Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não.
 *  Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
	Ter no mínimo 65 anos de idade.
	Ter trabalhado no mínimo 30 anos.
	Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
	Com base nas informações acima leia: o número do empregado (código), o ano de seu nascimento
 	e o ano de seu ingresso na empresa. 
 	O programa deverá escrever a idade e o tempo de trabalho do empregado
  	e a mensagem 'Requerer aposentadoria' ou 'Não requerer'
 */
package ListaCondicionantes;
import java.util.Scanner;


/**
 * @author User
 *
 */
public class Exerc8_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		String nome ="";
		int codigoempreg = 0;
		int anoatual = 2022, anonascto = 0, anoingresso = 0;
		int temposervico = 0, idade = 0;
		
		System.out.println("Informe o nome do colaborador: ");
		nome = teclado.nextLine();
		System.out.println("Informe o código do trabalhador: ");
		codigoempreg = teclado.nextInt();
		System.out.println("Informe o ano de nascimento do colaborador " + nome + ":");
		anonascto = teclado.nextInt();
		System.out.println("Informe em que ano o colaborador " + nome + " ingressou na empresa: ");
		anoingresso = teclado.nextInt();
		
		idade = anoatual - anonascto;
		temposervico = anoatual - anoingresso;
		
		if ((idade >= 65) || (temposervico >= 30) || ((idade >= 60) && (temposervico >= 25))) {
			System.out.println("O trabalhador " + nome + ", código " + codigoempreg + " tem " + idade + " anos de idade");
			System.out.println("e " + temposervico + " anos de tempo de serviço.");
			System.out.println("Colaborador atende os requisitos");
			System.out.println("REQUERER APOSENTADORIA");
		} else {
			System.out.println("O trabalhador " + nome + ", código " + codigoempreg + " tem " + idade + " de idade");
			System.out.println(" e " + temposervico + " anos de tempo de serviço.");
			System.out.println("Colaborador NÃO atende os requisitos");
			System.out.println("NÃO REQUERER APOSENTADORIA");
			
		}
	}
	
}
