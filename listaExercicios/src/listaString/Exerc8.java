//8 – CRIE UM PROGRAMA QUE SOLICITE A DATA DE NASCIMENTO (DD/MM/AAAA) DO USUÁRIO E IMPRIMA A DATA
//COM O NOME DO MÊS POR EXTENSO.
//EXEMPLO: DATA DE NASCIMENTO: 15/03/1998
//• VOCÊ NASCEU EM 15 DE MARÇO DE 1998.

package listaString;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String dataInformada = "";
		
		System.out.println("Ola! Seja bem vindo!!!");
		System.out.println("Informe sua data de nascimento (formato DD/MM/AAAA):");
		dataInformada = input.nextLine();
		
		String[] meses = new String[] {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}; 
		String ano = dataInformada.substring(6);
		String mes = dataInformada.substring(3, 5);
		String dia = dataInformada.substring(0, 2);
		int indMeses = Integer.parseInt(mes);
		String mesExtenso = meses[indMeses - 1];		
		
		System.out.println("Voce nasceu em " + dia + " de " + mesExtenso + " de " + ano + ".");
		
	}

}
