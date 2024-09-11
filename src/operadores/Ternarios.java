package operadores;

import java.util.Scanner;

public class Ternarios {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double v;
		
		System.out.print("Digite um valor: ");
		v = reader.nextDouble();
		
		reader.close();

		String parOuImpar = v%2 == 0 ? "par" : "impar";
		System.out.printf("O valor %.1f é %s.", v, parOuImpar);
	}

}
