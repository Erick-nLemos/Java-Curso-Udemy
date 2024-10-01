package primeirosExercicios;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String dia;
		int posicaoSemana;
		
		System.out.print("Digite o dia da semana: ");
		dia = read.next();
		read.close();
		
		if(dia.equalsIgnoreCase("Domingo")) {
			posicaoSemana = 1;
			System.out.printf("É o %dº dia da semana\n", posicaoSemana);
		}
		else if(dia.equalsIgnoreCase("Segunda")) {
			posicaoSemana = 2;
			System.out.printf("É o %dº dia da semana\n", posicaoSemana);
		}
		else if(dia.equalsIgnoreCase("Terça")) {
			posicaoSemana = 3;
			System.out.printf("É o %dº dia da semana\n", posicaoSemana);
		}
		else if(dia.equalsIgnoreCase("Quarta")) {
			posicaoSemana = 4;
			System.out.printf("É o %dº dia da semana\n", posicaoSemana);
		}
		else if(dia.equalsIgnoreCase("Quinta")) {
			posicaoSemana = 5;
			System.out.printf("É o %dº dia da semana\n", posicaoSemana);
		}
		else if(dia.equalsIgnoreCase("Sexta")) {
			posicaoSemana = 6;
			System.out.printf("É o %dº dia da semana\n", posicaoSemana);
		}
		else if(dia.equalsIgnoreCase("Sábado")) {
			posicaoSemana = 7;
			System.out.printf("É o %dº dia da semana\n", posicaoSemana);
		}
		else {
			System.out.printf("Não entendi.\n");
		}
		

	}

}
