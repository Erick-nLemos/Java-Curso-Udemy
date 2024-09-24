package primeirosExercicios;

import java.util.Scanner;

public class Petenciacao {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double val;
		
		System.out.print("Digite um valor: ");
		val = read.nextDouble();
		
		System.out.printf("O valor %.2f elevado ao quadrado é: %.2f\n", val, Math.pow(val, 2));
		System.out.printf("O valor %.2f elevado ao cubo é: %.2f\n", val, Math.pow(val, 3));
		

	}

}
