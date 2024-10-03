package exerciciosEstruturaControle;

import java.util.Scanner;

public class ModuloEx07 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int somaTotal = 0; 
		
		System.out.println("[Digite um numero negativo para sair.]");
		System.out.print("Digite um número: ");
		int num = read.nextInt();
		
		while(num >= 0) {
			somaTotal += num;
			System.out.print("Digite um número: ");
			num = read.nextInt();
		}
		
		System.out.printf("Total da soma de todos os números digitados: %d\n", somaTotal);
		read.close();
	}
}
