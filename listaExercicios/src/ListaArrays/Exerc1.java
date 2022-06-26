//1 - CRIE UM ARRAY DE INTEIROS DE TAMANHO 10. IMPLEMENTE UM PROGRAMA QUE DEFINA E ESCREVA O
//ARRAY, BEM COMO A QUANTIDADE DE ELEMENTOS ARMAZENADOS NESTE ARRAY QUE SÃO PARES.

package ListaArrays;

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[10];
		int i;
		int n = 1;
		int qtd = 0;
		for (i = 0; i < numeros.length; i++) {
			numeros[i] = n;
			n++;
		}
		System.out.println("Elementos do Array: ");
		for (i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");	
		}
		System.out.println(" ");
		System.out.println("Elementos pares do Array: ");
		for (i = 0; i < numeros.length; i++) {
			if (numeros[i]%2 == 0) {
				System.out.print(numeros[i] + " ");
				qtd++;
			}
		}
		System.out.println("");
		System.out.println("Quantidade de elementos pares: " + qtd);
		
	}

}
