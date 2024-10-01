package primeirosExercicios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double somaNotas = 0, nota, m;
		int cont = 0;
		
		System.out.print("Quantas do aluno notas são? ");
		int qtdNotas = read.nextInt();
		
		System.out.println("\n[Digite -1 para sair]");
		System.out.println("=============================\n\n");
		
		while(cont < qtdNotas) {
			
			System.out.print("Digite a nota: ");
			nota = read.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				somaNotas += nota;
			}
			else if(nota == -1) {
				System.out.println("Calculo cancelado!");
				return ;
			}
			else {
				System.out.println("Nota Inválida! Digite novamente por favor.");
				continue;
			}
			cont++;
			
		}
		
		m = somaNotas/qtdNotas;
		System.out.printf("A média das notas é: %.2f", m);
		
		read.close();

	}

}
