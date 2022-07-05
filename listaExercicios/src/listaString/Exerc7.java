//7 – CRIE UM PROGRAMA QUE DADO UM VALOR NUMÉRICO DIGITADO PELO USUÁRIO, IMPRIMA CADA UM DOS
//SEUS DÍGITOS POR EXTENSO.
//EXEMPLO: O NÚMERO: 4571
//• RESULTADO: QUATRO, CINCO, SETE, UM.

package listaString;

import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String numeroInformado = "";
		String[] numerosExtenso = {"ZERO", "UM", "DOIS", "TRES", "QUATRO", "CINCO", "SEIS", "SETE", "OITO", "NOVE"};
		
		System.out.println("Informe um numero de sua escolha: ");
		numeroInformado = input.nextLine();
		for (int i = 0; i < numeroInformado.length(); i++) {
			char c = numeroInformado.charAt(i);
			String ind = String.valueOf(c);
			int indNumExtenso = Integer.parseInt(ind);
			System.out.print(numerosExtenso[indNumExtenso] + " ");
		}
		
		

	}

}
