/**
 * Faça um algoritmo que define o login e a senha de um usuário. O algoritmo deve permitir que o usuário tente
	logar no máximo 3 vezes e caso erre o login e/ou senha mais que o máximo permitido, o algoritmo deve
	emitir uma mensagem dizendo “Cadastro bloqueado”.
 */
package ListaRepeticao;
import java.util.Scanner;


/**
 * @author User
 *
 */
public class Exerc2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String user = "usuario", inputUser = "";
		int password = 123456, inputPassword = 0, qtdErro = 0, qtdTentativa = 3;
		
		System.out.println("Informe o Usuario:");
		inputUser = teclado.nextLine();
		System.out.println("Insira sua Senha:");
		inputPassword = teclado.nextInt();
		teclado.nextLine();
		if ((inputUser.equals(user)) && (inputPassword == password)) {
			System.out.println("=========================================");
			System.out.println("===== LOGIN EFETUADO COM SUCESSO   ======");
			System.out.println("=========================================");
		}
				
		if ((!inputUser.equals(user)) || (inputPassword != password)) {
			do {
				qtdTentativa--;
				System.out.println("USUARIO E/OU SENHA INVALIDOS!!!");
				System.out.println("Voce ainda tem " + qtdTentativa + " tentativas.");
				System.out.println("Tente novamente.");
				System.out.println();
				System.out.println("Informe o Usuario:");
				inputUser = teclado.nextLine();
				System.out.println("Insira sua Senha:");
				inputPassword = teclado.nextInt();
				teclado.nextLine();
				qtdErro++;
			} while ((!inputUser.equals(user)) && (inputPassword != password) && (qtdErro < 2));
			if (qtdErro == 2) {
				System.out.println("=========================================");
				System.out.println("==========   USUARIO BLOQUEADO   ========");
				System.out.println("=========================================");
			}	
						
		}
					
	}

}
