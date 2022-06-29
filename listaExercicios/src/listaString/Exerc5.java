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
		char[] confereRadical = new char[1];
		char[] confereFimRadical = new char[1];
		String novaBase = "";
		String novaBaseExcecao = "";

		System.out.println("Informe um verbo regular no infinitivo : ");
		verboInformado = input.nextLine();
		if (verboInformado.length() == 2) {
			verboInformado.getChars((verboInformado.length()-2), verboInformado.length(), confereSufixoVerbo, 0);
			if (confereSufixoVerbo[0] == 'i') {
				System.out.println("Conjugando o verbo " + verboInformado);
				System.out.println("");
				System.out.println("EU:   VOU");
				System.out.println("TU:   VAIS");
				System.out.println("ELE:  VAI");
				System.out.println("NOS:  VAMOS");
				System.out.println("VOS:  IDES");
				System.out.println("ELES: VAO");

			} else {
				System.out.println("Voce nao informou um verbo valido!!");
			}

		}else {
			String baseVerboSemSufixo = verboInformado.substring(0,(verboInformado.length() - 2));
			verboInformado.getChars((verboInformado.length() - 2), verboInformado.length(), confereSufixoVerbo, 0);
			//			System.out.println(confereSufixoVerbo[0]);
			verboInformado.getChars(1, 2, confereRadical, 0);
			//			System.out.println(confereRadical[0]);
			verboInformado.getChars((verboInformado.length()-3), (verboInformado.length()-2), confereFimRadical, 0);
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
				if(confereFimRadical[0] == 'z') {
					System.out.println("Conjugando o verbo " + verboInformado);
					System.out.println("");
					novaBase = baseVerboSemSufixo.replace('z', 'c');
					System.out.println("EU:   " + novaBase.toUpperCase() + "O");
					System.out.println("TU:   " + baseVerboSemSufixo.toUpperCase() + "ES");
					System.out.println("ELE:  " + baseVerboSemSufixo.toUpperCase() + "");
					System.out.println("NOS:  " + baseVerboSemSufixo.toUpperCase() + "EMOS");
					System.out.println("VOS:  " + baseVerboSemSufixo.toUpperCase() + "EIS");
					System.out.println("ELES: " + baseVerboSemSufixo.toUpperCase() + "EM");
				} else {
					System.out.println("Conjugando o verbo " + verboInformado);
					System.out.println("");
					System.out.println("EU:   " + baseVerboSemSufixo.toUpperCase() + "O");
					System.out.println("TU:   " + baseVerboSemSufixo.toUpperCase() + "ES");
					System.out.println("ELE:  " + baseVerboSemSufixo.toUpperCase() + "E");
					System.out.println("NOS:  " + baseVerboSemSufixo.toUpperCase() + "EMOS");
					System.out.println("VOS:  " + baseVerboSemSufixo.toUpperCase() + "EIS");
					System.out.println("ELES: " + baseVerboSemSufixo.toUpperCase() + "EM");
				}
			} else if (confereSufixoVerbo[0] == 'i'){
				if (confereRadical[0] == 'u') {
					novaBase = baseVerboSemSufixo.replace('u','o');
					if (confereFimRadical[0] == 'g') {
						novaBaseExcecao = baseVerboSemSufixo.replace('g', 'j');
						System.out.println("Conjugando o verbo " + verboInformado);
						System.out.println("");
						System.out.println("EU:   " + novaBaseExcecao.toUpperCase() + "O");
						System.out.println("TU:   " + novaBase.toUpperCase() + "ES");
						System.out.println("ELE:  " + novaBase.toUpperCase() + "E");
						System.out.println("NOS:  " + baseVerboSemSufixo.toUpperCase() + "IMOS");
						System.out.println("VOS:  " + baseVerboSemSufixo.toUpperCase() + "IEIS");
						System.out.println("ELES: " + novaBase.toUpperCase() + "EM");
					} else {
						System.out.println("Conjugando o verbo " + verboInformado);
						System.out.println("");
						System.out.println("EU:   " + baseVerboSemSufixo.toUpperCase() + "O");
						System.out.println("TU:   " + novaBase.toUpperCase() + "ES");
						System.out.println("ELE:  " + novaBase.toUpperCase() + "E");
						System.out.println("NOS:  " + baseVerboSemSufixo.toUpperCase() + "IMOS");
						System.out.println("VOS:  " + baseVerboSemSufixo.toUpperCase() + "IEIS");
						System.out.println("ELES: " + novaBase.toUpperCase() + "EM");
					}

				} else if (confereRadical[0] == 'o') {
					novaBase = baseVerboSemSufixo.replace('o', 'u');
					System.out.println("Conjugando o verbo " + verboInformado);
					System.out.println("");
					System.out.println("EU:   " + novaBase.toUpperCase() + "O");
					System.out.println("TU:   " + baseVerboSemSufixo.toUpperCase() + "ES");
					System.out.println("ELE:  " + baseVerboSemSufixo.toUpperCase() + "E");
					System.out.println("NOS:  " + novaBase.toUpperCase() + "IMOS");
					System.out.println("VOS:  " + baseVerboSemSufixo.toUpperCase() + "IEIS");
					System.out.println("ELES: " + baseVerboSemSufixo.toUpperCase() + "EM");
				} else if (confereFimRadical[0] == 'g') {
					novaBase = baseVerboSemSufixo.replace('g','j');
					System.out.println("Conjugando o verbo " + verboInformado);
					System.out.println("");
					System.out.println("EU:   " + novaBase.toUpperCase() + "O");
					System.out.println("TU:   " + baseVerboSemSufixo.toUpperCase() + "ES");
					System.out.println("ELE:  " + baseVerboSemSufixo.toUpperCase() + "E");
					System.out.println("NOS:  " + baseVerboSemSufixo.toUpperCase() + "IMOS");
					System.out.println("VOS:  " + baseVerboSemSufixo.toUpperCase() + "IEIS");
					System.out.println("ELES: " + baseVerboSemSufixo.toUpperCase() + "EM");
				} else if (verboInformado.length() == 4) {
					baseVerboSemSufixo = verboInformado.substring(0,(verboInformado.length() - 1));
					if (confereFimRadical[0] == 'g') {
						novaBaseExcecao = baseVerboSemSufixo.replace('g', 'j');
						System.out.println("Conjugando o verbo " + verboInformado);
						System.out.println("");
						System.out.println("EU:   " + novaBaseExcecao.toUpperCase() + "O");
						System.out.println("TU:   " + baseVerboSemSufixo.toUpperCase() + "S");
						System.out.println("ELE:  " + baseVerboSemSufixo.toUpperCase() + "");
						System.out.println("NOS:  " + baseVerboSemSufixo.toUpperCase() + "MOS");
						System.out.println("VOS:  " + baseVerboSemSufixo.toUpperCase() + "S");
						novaBase = baseVerboSemSufixo.replace('i', 'e');
						System.out.println("ELES: " + novaBase.toUpperCase() + "M");

					}
					System.out.println("Conjugando o verbo " + verboInformado);
					System.out.println("");
					System.out.println("EU:   " + baseVerboSemSufixo.toUpperCase() + "O");
					System.out.println("TU:   " + baseVerboSemSufixo.toUpperCase() + "S");
					System.out.println("ELE:  " + baseVerboSemSufixo.toUpperCase() + "");
					System.out.println("NOS:  " + baseVerboSemSufixo.toUpperCase() + "MOS");
					System.out.println("VOS:  " + baseVerboSemSufixo.toUpperCase() + "S");
					novaBase = baseVerboSemSufixo.replace('i', 'e');
					System.out.println("ELES: " + novaBase.toUpperCase() + "M");
				} else {
					System.out.println("Conjugando o verbo " + verboInformado);
					System.out.println("");
					System.out.println("EU:   " + baseVerboSemSufixo.toUpperCase() + "O");
					System.out.println("TU:   " + baseVerboSemSufixo.toUpperCase() + "ES");
					System.out.println("ELE:  " + baseVerboSemSufixo.toUpperCase() + "E");
					System.out.println("NOS:  " + baseVerboSemSufixo.toUpperCase() + "IMOS");
					System.out.println("VOS:  " + baseVerboSemSufixo.toUpperCase() + "IEIS");
					System.out.println("ELES: " + baseVerboSemSufixo.toUpperCase() + "EM");
				}

			}
		}



	}

}
