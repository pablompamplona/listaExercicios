/**
 * Em um concurso para auxiliar de justiça foram recebidas inscrições de candidatos de ambos os sexos
	e a partir do segundo grau completo. Sabendo que cada candidato preencheu uma ficha que contém
	o seu grau de instrução (1 = segundo grau, 2 = terceiro grau) seu nome e sexo (F = feminino, M =
	masculino), construa um algoritmo que calcule e imprima:

	a) - O total de candidatos.
	b) - O número de candidatos do sexo masculino e do sexo feminino.
	c) - O número de mulheres com apenas o segundo grau.
	d) - A porcentagem de homens com terceiro grau em relação ao total de homens inscritos.

	Importante: o algoritmo deve permitir que o usuário digite apenas o grau de instrução e sexo definidos no
	problema. Caso o usuário digite outra informação, o algoritmo deve avisar o erro e pedir que o usuário digite
	novamente.
	
	OBS: considere como finalizador, grau de instrução igual a 0
 */
package ListaRepeticao;
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
		
		int grauInstr = 0, fem2grau = 0, masc3grau = 0, totcand = 0, totMasc = 0, totFem = 0;
		int percMasc3grau = 0;
		String nome = "", sexo = "";
		
		do {
			System.out.println("Informe seu grau de instrucao ( 1 - Nivel medio  /  2 - Superior ): ");
			grauInstr = teclado.nextInt();
			teclado.nextLine(); 
			if (grauInstr != 0) {
				System.out.println("Informe seu nome: ");
				nome = teclado.nextLine();
				System.out.println("Informe seu sexo (M/F): ");
				sexo = teclado.nextLine();
				if ((!sexo.equals("m")) && (!sexo.equals("f"))) {
					do {
						System.out.println("OPCAO INVALIDA!!! Selecione novamente.");
						System.out.println("Informe seu sexo (M/F): ");
						sexo = teclado.nextLine();
					} while ((!sexo.equals("m")) && (!sexo.equals("f")));
				}
				totcand++;
				if (sexo.equals("m")) {
					totMasc++;
				}
				if (sexo.equals("f")) {
					totFem++;
				}
				if (sexo.equals("f") && grauInstr == 1) {
					fem2grau++;
				}
				if (sexo.equals("m") && grauInstr ==2) {
					masc3grau++;
				}
				
			}
		} while (grauInstr != 0);
		
		percMasc3grau = (masc3grau * 100)/totcand;
		
		System.out.println("Total de canditados: " + totcand + " pessoas.");
		System.out.println("Compostos por " + totMasc + " homens e " + totFem + " mulheres.");
		System.out.println(fem2grau + " mulheres tem apenas o nivel medio.");
		System.out.println(percMasc3grau + "% dos homens que se candidataram tem formacao em nivel superior.");
		
	}

}
