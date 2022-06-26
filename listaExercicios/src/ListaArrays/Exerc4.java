//4 – LER AS DUAS NOTAS BIMESTRAIS PARA UM CONJUNTO DE 5 ALUNOS. ARMAZENAR AS NOTAS INFORMADAS
//PELO USUÁRIO EM DOIS ARRAYS “NOTA1” E “NOTA2”, BEM COMO O NOME DO ALUNO EM UM ARRAY “ALUNO”. O
//PROGRAMA DEVE CALCULAR A MÉDIA DAS NOTAS E INFORMAR:
//• NOME DO ALUNO;
//• NOTA 1;
//• NOTA 2;
//• MÉDIA;
//• SITUAÇÃO;
package ListaArrays;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String alunos[] = new String[5];
		double nota1[] = new double[5];
		double nota2[] = new double[5];
		int i;
		double mediaNotas;
		String situacao = "";
		
		for (i = 0; i < alunos.length; i++) {
			System.out.println("Informe o nome do Aluno: ");
			alunos[i] = teclado.nextLine();
			System.out.println("Informe a nota do 1o Bim do aluno " + alunos[i] + ":");
			nota1[i] = teclado.nextDouble();
			System.out.println("Informe a nota do 2o Bim do aluno " + alunos[i] + ":");
			nota2[i] = teclado.nextDouble();
			teclado.nextLine();
		}
		for (i = 0; i < alunos.length; i++) {
			mediaNotas = (nota1[i] + nota2[i]) / 2;
			if (mediaNotas >= 7.0) {
				situacao = "APROVADO";
			} else {
				situacao = "REPROVADO";
			}
			System.out.println("-----------------------------------");
			System.out.println("Aluno: " + alunos[i]);
			System.out.println("Nota 1o Bimestre: " + nota1[i]);
			System.out.println("Nota 2o Bimestre: " + nota2[i]);
			System.out.println("Media do aluno: " + mediaNotas);
			System.out.println("Situacao: " + situacao);
		}
		teclado.close();
	}
	
}
