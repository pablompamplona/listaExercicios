//2 - CRIE UM ARRAY DE INTEIROS DE TAMANHO 10. IMPLEMENTE UM PROGRAMA QUE DEFINA E ESCREVA O
//ARRAY, BEM COMO A SOMA DOS ELEMENTOS ARMAZENADOS NESTE ARRAY.

package ListaArrays;

public class Exerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[10];
		int i;
		int n = 1;
		int totalSoma = 0;
		
		for (i = 0; i < numeros.length; i++) {
			numeros[i] = n;
			n++;
		}
		System.out.println("Elementos do Array: ");
		for (i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");	
		}
		System.out.println(" ");
		for (i = 0; i < numeros.length; i++) {
			totalSoma = numeros[i] + totalSoma;
		}
		System.out.println("O total da soma dos elementos do array e: " + totalSoma);
	}

}
