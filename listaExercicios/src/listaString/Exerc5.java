//5 – CRIE UM PROGRAMA ONDE O USUÁRIO IRÁ DIGITAR UM VERBO REGULAR TERMINADO EM AR E MOSTRE A
//CONJUGAÇÃO NO TEMPO PRESENTE.
//EXEMPLO: VERBO ANDAR
//• EU ANDO
//• TU ANDAS
//• ELE ANDA
//• NÓS ANDAMOS
//• VÓS ANDAIS
//• ELES ANDAM
package listaString;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String verboInformado = "";
		char[] confereSufixoVerbo = new char [2];
		
		System.out.println("Informe um verbo regular no infinitivo : ");
		verboInformado = input.nextLine();
		
		String baseVerboSemSufixo = verboInformado.substring(0,(verboInformado.length() - 2));
		verboInformado.getChars((verboInformado.length() - 2), verboInformado.length(), confereSufixoVerbo, 0);
//		System.out.println(confereSufixoVerbo[0]);
		if (confereSufixoVerbo[0] == 'a') {
			System.out.println("Conjugando o verbo " + verboInformado);
			System.out.println("");
			System.out.println("EU:   " + baseVerboSemSufixo.toUpperCase() + "O");
			System.out.println("TU:   " + baseVerboSemSufixo.toUpperCase() + "AS");
			System.out.println("ELE:  " + baseVerboSemSufixo.toUpperCase() + "A");
			System.out.println("NOS:  " + baseVerboSemSufixo.toUpperCase() + "AMOS");
			System.out.println("VOS:  " + baseVerboSemSufixo.toUpperCase() + "AIS");
			System.out.println("ELES: " + baseVerboSemSufixo.toUpperCase() + "AM");
		} else if (confereSufixoVerbo[0] == 'e') {
			System.out.println("Conjugando o verbo " + verboInformado);
			System.out.println("");
			System.out.println("EU:   " + baseVerboSemSufixo.toUpperCase() + "O");
			System.out.println("TU:   " + baseVerboSemSufixo.toUpperCase() + "ES");
			System.out.println("ELE:  " + baseVerboSemSufixo.toUpperCase() + "E");
			System.out.println("NOS:  " + baseVerboSemSufixo.toUpperCase() + "EMOS");
			System.out.println("VOS:  " + baseVerboSemSufixo.toUpperCase() + "EIS");
			System.out.println("ELES: " + baseVerboSemSufixo.toUpperCase() + "EM");
		} else {
			System.out.println("O verbo que voce informou nao e regular");
		}
		
		

	}

}
