package operadores;

import java.util.Scanner;

public class DesafioCalculadoraTernario {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		double v1, v2, result;
		String choose;

		System.out.print("Digite o primeiro Valor: ");
		v1 = read.nextDouble();
		System.out.print("Digite o segundo valor: ");
		v2 = read.nextDouble();
		
		System.out.println("[+ Somar | - Subtrair | * Multiplicar | / Dividir]");
		System.out.print("Qual calculo deseja realizar? ");
		choose = read.next();
		
		read.close();
		
		result = choose.equals("+") ? v1+v2 : 0;
		result = choose.equals("-") ? v1-v2 : result; 
		result = choose.equals("*") ? v1*v2 : result;
		result = choose.equals("/") ? v1/v2 : result;
		
		System.out.printf("%.2f %s %.2f = %.2f: ", v1, choose, v2, result);
		
	}

}
