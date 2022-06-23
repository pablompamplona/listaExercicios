/**
 *  Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 * 
 * morango: ate 5kg - 2,50 por kg
 * 			acima   - 2,20 por kg
 * 
 * maca:	ate 5kg - 1,80 por kg
 * 			acima	- 1,50 por kg


Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
receberá ainda um desconto de 10% sobre este total.
Escreva um algoritmo para ler a quantidade (em Kg) de morangos e 
a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 */
package ListaCondicionantes;
import java.util.Scanner;


/**
 * @author User
 *
 */
public class Exerc7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
		
		String nome = "";
		String continua = "";
		double pesomorango = 0, pesomorangoacumula = 0, pesomaca = 0, pesomacaacumula = 0, pesototal = 0;
		double precomorangovarejo = 2.50, precomorangoatac = 2.20, precomacavarejo = 1.80, precomacaatac = 1.50;
		double valormorango = 0, valormorangoacumula = 0, valormaca = 0, valormacaacumula = 0;
		double desconto = 0.1, valordesconto = 0;
		double subtotal = 0, valorfinal = 0;
		int opcao = 0;
		
		System.out.println("SEJA BEM VINDO AO MENU VIRTUAL DA FRUTEIRA DO ZÉ!!!");
		System.out.println("Por favor digite seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Olá " + nome + "!!!");
		
		do {
			System.out.println("Selecione o produto desejado no menu abaixo:");
			System.out.println("Opçao 1 - Morango");
			System.out.println("Opção 2 - Maçã");
			System.out.println("Digite a opção correspondente ao produto desejado:");
			opcao = teclado.nextInt();
			
			if (opcao == 1) {
				System.out.println("Muito bem! Quantos kilos de morango você deseja?");
				System.out.println("(LEMBRE-SE QUE COMPRANDO ACIMA DE 5KG VOCÊ JÁ COMEÇA A GANHAR DESCONTO!!!)");
				System.out.println("Digite o peso desejado: ");
				pesomorango = teclado.nextDouble();
				pesomorangoacumula = pesomorango + pesomorangoacumula;
				
				if (pesomorango <= 5) {
					valormorango = (pesomorango * precomorangovarejo);
					valormorangoacumula = valormorango + valormorangoacumula;
				} else {
					valormorango = (pesomorango * precomorangoatac);
					valormorangoacumula = valormorango + valormorangoacumula;
				}
				
			} else if (opcao == 2) {
				System.out.println("Muito bem! Quantos kilos de maçã você deseja?");
				System.out.println("(LEMBRE-SE QUE COMPRANDO ACIMA DE 5KG VOCÊ JÁ COMEÇA A GANHAR DESCONTO!!!)");
				System.out.println("Digite o peso desejado: ");
				pesomaca = teclado.nextDouble();
				pesomacaacumula = pesomaca + pesomacaacumula;
				
				if (pesomaca <= 5) {
					valormaca = (pesomaca * precomacavarejo);
					valormacaacumula = valormaca + valormacaacumula;
				} else {
					valormaca = (pesomaca * precomacaatac);
					valormacaacumula = valormaca + valormacaacumula;
				}
										
			}
			
			teclado.nextLine();
			System.out.println("Deseja adquirir novos itens?(S/N)");
			continua = teclado.nextLine();	
		
		} while (continua.equals("s"));
		
		pesototal = pesomorangoacumula + pesomacaacumula;
		subtotal = valormorangoacumula + valormacaacumula;
		
		if ((pesototal >= 8) || (subtotal >= 25)) {
			
			valordesconto = subtotal * desconto;
			valorfinal = subtotal - valordesconto;
			System.out.println("Parabéns!" + nome + " Você adiquiriu " + pesomorangoacumula + "Kg de Morango por R$ " + valormorangoacumula);
			System.out.println("e " + pesomacaacumula + "Kg de Maçã por R$ " + valormacaacumula + ".");
			System.out.println("Sua compra totalizou R$ " + subtotal + " e você recebeu R$ " + valordesconto + "de desconto." );
			System.out.println("Valor total a pagar: R$ " + valorfinal + ".");
			
		} else {
			valorfinal = subtotal;
			System.out.println("Parabéns!" + nome+ " Você adiquiriu " + pesomorangoacumula + "Kg de Morango por R$ " + valormorangoacumula);
			System.out.println("e " + pesomacaacumula + "Kg de Maçã por R$ " + valormacaacumula + ".");
			System.out.println("Valor total a pagar: R$ " + valorfinal + ".");
		}
	}
		
}