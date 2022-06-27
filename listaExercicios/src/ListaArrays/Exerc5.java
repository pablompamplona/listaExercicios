//5 – CRIAR UM ARRAY “ORIGEM” COM 10 ELEMENTOS INTEIROS. CONSTRUIR UM ARRAY “RESULTADO” DE MESMO
//TIPO E TAMANHO, OBEDECENDO AS SEGUINTES REGRAS:
//• “RESULTADO” RECEBE O VALOR 1 QUANDO “ORIGEM” FOR PAR;
//• “RESULTADO” RECEBE O VALOR 0 QUANDO “ORIGEM” FOR ÍMPAR;

package ListaArrays;

public class Exerc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int origin[] = new int[10];
		int result[] = new int[10];
		int i;
		int n = 1;

		for (i = 0; i < origin.length; i++) {
			origin[i] = n;
			n += 3;
		}
		System.out.println("Elementos do Array / indicacao se e par ou impar (1=par, 0=impar): ");
		for (i = 0; i < origin.length; i++) {
			System.out.print(origin[i]);				
			if (origin[i]%2 == 0) {
				result[i] = 1;
			} else {
				result[i] = 0;
			}
			System.out.print("/");
			System.out.print(result[i]);
			System.out.print("   ");
		}
	}

}
