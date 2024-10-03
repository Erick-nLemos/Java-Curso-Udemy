package exerciciosEstruturaControle;

import java.util.Scanner;

public class ModuloEx01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um número de 0 a 10: ");
		int num = read.nextInt();
		
		if(num >= 0 && num <= 10) {
			if(num%2 == 0) {
				System.out.println("Valor Válido!");
				System.out.printf("O valor %d é par.\n", num);
			}
			else {
				System.out.println("Valor Válido");
				System.out.printf("O valor %d é impar.\n", num);
			}
		}
		else {
			System.out.println("Valor Inválido!");
		}
		
		
		read.close();
	}
}
