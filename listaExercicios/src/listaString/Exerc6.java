//6 – CRIE UM PROGRAMA QUE DADO UM TEXTO DIGITADO PELO USUÁRIO O PROGRAMA TROQUE TODAS AS
//OCORRÊNCIAS DE UMA PALAVRA POR OUTRA. PARA ISSO O USUÁRIO DEVERÁ DIGITAR O TEXTO, A PALAVRA A SER
//PROCURADA E A PALAVRA PARA SER TROCADA. AO FINAL O PROGRAMA DEVE MOSTRAR O TEXTO ORIGINAL, O
//NOVO TEXTO E INFORMAR QUANTAS OCORRÊNCIAS DE TROCA OCORRERAM.

package listaString;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String fraseInformada = "";
		String palavraAtual = "";
		String palavraNova = "";
		
		
		
		System.out.println("Digite uma frase: ");
		fraseInformada = input.nextLine();
		System.out.println("Informe uma palavra da frase para ser trocada: ");
		palavraAtual = input.nextLine();
		System.out.println("Qual a nova palavra voce deseja inserir no local?: ");
		palavraNova = input.nextLine();
		
		String novaFrase = fraseInformada.replaceAll(palavraAtual, palavraNova);
		System.out.println("Frase informada: " + fraseInformada);
		System.out.println("Nova Frase: " + novaFrase);

	}

}
