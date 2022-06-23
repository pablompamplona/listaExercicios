/**
 * Elabore um algoritmo que calcule o que deve ser pago por um produto,
 * considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
 * utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida
 * e efetuar o cálculo adequado. 

Código
Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 10% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em duas vezes, preço normal de etiqueta mais juros de 10%
 */
package ListaCondicionantes;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Exerc19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double precoEtiq = 0, precoFinal = 0, valorParcela = 0;
		int opcao = 0;
		
		System.out.println("Informe o valor do produto: ");
		precoEtiq = teclado.nextFloat();
		System.out.println("Selecione a forma de pagamento no menu abaixo:");
		System.out.println("Condições de pagamento: ");
		System.out.println("  1   -   A vista (dinheiro ou cheque)");
		System.out.println("  2   -   A vista (cartão de crédito)");
		System.out.println("  3   -   2x sem juros");
		System.out.println("  4   -   2x com juros");
		opcao = teclado.nextInt();
		
		switch (opcao) {
			case 1: 
				precoFinal = (precoEtiq * 0.90);
				System.out.println("Voce recebeu 10% de desconto");
				System.out.println("O valor da compra para pagamento a vista é de: R$ " + precoFinal);
				break;
			case 2:
				precoFinal = (precoEtiq * 0.85);
				System.out.println("Voce recebeu 15% de desconto");
				System.out.println("O valor da compra para pagamento a vista é de: R$ " + precoFinal);
				break;
			case 3:
				precoFinal = precoEtiq;
				valorParcela = (precoFinal / 2);
				System.out.println("O valor da compra para pagamento parcelado é de: R$ " + precoFinal);
				System.out.println("Voce pode pagar em 2 parcelas de: R$ " + valorParcela);
				break;
			case 4:
				precoFinal = (precoEtiq * 0.90);
				valorParcela = (precoFinal / 2);
				System.out.println("O valor da compra para pagamento parcelado é de: R$ " + precoFinal);
				System.out.println("Voce pode pagar em 2 parcelas de: R$ " + valorParcela);
				break;
							
		}
				
	}

}
