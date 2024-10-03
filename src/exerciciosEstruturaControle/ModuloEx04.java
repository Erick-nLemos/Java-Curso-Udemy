package exerciciosEstruturaControle;

import java.util.Scanner;

class NumPrimo{
	
	public static boolean isPrimo(int numero) {
		boolean isPrimo;
		
		if(numero <= 1) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(numero); i++) {
			if(numero%i == 0) {
				return false;
			}	
		}
		
		return true;
	}
}

public class ModuloEx04 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		
		System.out.print("Digite um número: ");
		int num = read.nextInt();
		
		
		
		if(NumPrimo.isPrimo(num)) {
			System.out.printf("O número %d é primo.", num);
		}
		else {
			System.out.printf("O número %d não é primo.", num);
		}
		
		read.close();
	}
}
