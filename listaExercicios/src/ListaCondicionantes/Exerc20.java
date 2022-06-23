/**
 * Desenvolver um programa que calcule o salário bruto e o salário líquido de um funcionário: 
• 	Dados de entrada: o Nome do funcionário; o Quantidade de horas trabalhadas; 
•	Constantes: o Salário mínimo = R$ 1025,00; o Valor da hora-extra = R$ 10,00. 

	Sabe-se que: 
• 	Salário hora-extra = horas-extras * Valor da hora-extra; 
•	Salário Bruto = 3 * Salário mínimo + Salário hora-extra; 
•	Desconto INSS = 12% do salário bruto, se o salário bruto for maior que R$ 2000,00; 
• 	
	Desconto do Imposto de Renda = Conforme a faixa salarial abaixo;
vide tabela
• Salário líquido = salário líquido – descontos.


 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome = "";
		int horasTrabalhadas = 0, he = 0, opcaohe = 0;
		double salarioMin = 1025.00 , valorHe = 10.00, salBruto = 0, salLiquido = 0, salHe = 0, descontos = 0;
		double salPadrao = (3 * salarioMin), descInss = 0, descIrpf = 0;
				
		System.out.println("Informe o Nome do funcionario: ");
		nome = teclado.nextLine();
		System.out.println("Informe o total de horas trabalhadas: ");
		horasTrabalhadas = teclado.nextInt();
		System.out.println("");
		System.out.println("O funcionario tem horas-extras? (1 - sim / 2 - nao)");
		opcaohe = teclado.nextInt();
		if (opcaohe == 1) {
			System.out.println("Informe a quantidade de horas extras: ");
			he = teclado.nextInt();
		}
		
		salHe = (he * valorHe);
		salBruto = salPadrao + salHe;
		
		if (salBruto > 2000.00) {
			descInss = (salBruto * 0.12);
		}
		if (salBruto > 4000.00) {
			descIrpf = (salBruto * 0.35);
		} else if ((salBruto <= 4000.00) && (salBruto > 2500.00)) {
			descIrpf = (salBruto * 0.275);
		} else if ((salBruto <= 2500.00) && (salBruto > 1500.00)) {
			descIrpf = (salBruto * 0.15);
		}
		
		descontos = descInss + descIrpf;
		salLiquido = salBruto - descontos;
		
		System.out.println(" FOLHA DE PAGAMENTO - FUNCIONARIO: " + nome);
		System.out.println(" =============================================================");
		System.out.printf(" SALARIO BRUTO:        R$ %.2f %n ", salBruto);
		System.out.printf("TOTAL DESCONTOS       R$ %.2f %n ", descontos);
		System.out.println("=============================================================");
		System.out.printf(" SALARIO LIQUIDO       R$ %.2f %n ", salLiquido);
	}

}
