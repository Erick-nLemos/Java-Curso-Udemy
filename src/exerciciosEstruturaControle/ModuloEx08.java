package exerciciosEstruturaControle;

import java.util.Scanner;

public class ModuloEx08 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num, maiorValor = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			num = read.nextInt();
			
			if(num > maiorValor) {
				maiorValor = num;
			}
		}
		System.out.printf("O maior número é %d\n", maiorValor);
		
		read.close();
	}
}
