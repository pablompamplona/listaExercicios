//3 - CRIE UM ARRAY DE INTEIROS DE TAMANHO 10. IMPLEMENTE UM PROGRAMA QUE DEFINA E ESCREVA O
//ARRAY, BEM COMO A MÉDIA ARITMÉTICA DOS ELEMENTOS ARMAZENADOS NESTE ARRAY QUE SÃO ÍMPARES.

package ListaArrays;

public class Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[10];
		int i, n = 1, somaImpares = 0, qtdImpares = 0, mediaImpares = 0;
		
		for (i = 0; i < numeros.length; i++) {
			numeros[i] = n;
			n++;
		}
		System.out.println("Elementos do Array: ");
		for (i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");	
		}
		for (i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0) {
				somaImpares = numeros[i] + somaImpares;
				qtdImpares++;
			}
		}
		mediaImpares = somaImpares/qtdImpares;
		System.out.println("");
		System.out.println("A media aritimetica dos elementos impares desse array resulta em: " + mediaImpares);
	}

}
