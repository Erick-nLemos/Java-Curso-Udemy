package exerciciosEstruturaControle;

import java.util.Scanner;

public class ModuloEx03 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite a 1ª nota: ");
		double n1 = read.nextDouble();
		System.out.print("Digite a 2ª nota: ");
		double n2 = read.nextDouble();

		double m = (n1+n2)/2;
		
		if(m >= 7) {
			System.out.println("Aprovado.");
		}
		else if(m > 4) {
			System.out.println("Recuperação.");
		}
		else {
			System.out.println("Reprovado.");
		}
		
		read.close();
	}
}
