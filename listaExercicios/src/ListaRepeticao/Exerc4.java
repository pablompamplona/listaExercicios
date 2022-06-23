/**
 * Em uma eleição presidencial, existem 4 candidatos. Os votos são informados através de códigos. Os dados
	utilizados para escrutinagem obedecem à seguinte codificação:
	1,2,3,4 = voto para os respectivos candidatos.
	5 = voto nulo
	6 = voto em branco
	Elabore um algoritmo que calcule e escreva o total de votos para cada candidato, o total de votos nulos, o
	total de votos em branco e o percentual dos votos nulos e em branco sobre o total.

	Importante: o algoritmo deve permitir que o usuário digite apenas os códigos definidos no problema. Caso o
	usuário digite outro código, o algoritmo deve informar o erro e pedir que o usuário digite novamente a
	informação.

	OBS: Considere como finalizador voto = 0
 */
package ListaRepeticao;
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
		
		String cand1 = "Ze dos Anzois", cand2 = "Poca Telha", cand3 = "Boca de Gamela", cand4 = "Cu Sujo";
		String cand5 = "Votos nulos", cand6 = "Votos em branco";
		int voto = 0, voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, voto5 = 0, voto6 = 0;
		int percNulos = 0, percBrancos = 0, qtdvotos = 0; 
		
		do {
			System.out.println("BEM VINDO A CEDULA ELEITORAL DIGITAL");
			System.out.println("====================================");
			System.out.println("Selecione o seu candidato e digite a");
			System.out.println("opcao correspondente ao seu voto:");
			System.out.println("------------------------------------");
			System.out.println("");
			System.out.println("   1   -   ZE DOS ANZOIS");
			System.out.println("");
			System.out.println("   2   -   POCA TELHA");
			System.out.println("");
			System.out.println("   3   -   BOCA DE GAMELA");
			System.out.println("");
			System.out.println("   4   -   CU SUJO");
			System.out.println("");
			System.out.println("   5   -   VOTO NULO");
			System.out.println("");
			System.out.println("   6   -   VOTO EM BRANCO");
			System.out.println("");
			System.out.println("=====================================");
			System.out.println("AGUARDANDO SEU VOTO:");
			voto = teclado.nextInt();
			
			switch (voto) {
				case 1:
					voto1++;
					break;
				case 2:	
					voto2++;
					break;
				case 3:
					voto3++;
					break;
				case 4:
					voto4++;
					break;
				case 5:
					voto5++;
					break;
				case 6:
					voto6++;
					break;
			}
			if (voto >= 7) {
				System.out.println("OPCAO INVALIDA, TENTE NOVAMENTE!");
			}
			if (voto !=0) {
				qtdvotos++;
			}
					
		} while (voto != 0);
		
		percNulos = (voto5 * 100)/qtdvotos;
		percBrancos = (voto6 * 100/qtdvotos);
		
		System.out.println("###### RESULTADO DAS ELEICOES ######");
		System.out.println("====================================");
		System.out.println("");
		System.out.println("ZE DOS ANZOIS: " + voto1 + " votos");
		System.out.println("POCA TELHA: " + voto2 + " votos");
		System.out.println("BOCA DE GAMELA: " + voto3 + " votos");
		System.out.println("CU SUJO: " + voto4 + " votos");
		System.out.println("");
		System.out.println("");
		System.out.println("Percentual Votos Nulos: " + percNulos + "%");
		System.out.println("Percentual Votos Brancos: " + percBrancos + "%");
		
	}
	
}
	
	


