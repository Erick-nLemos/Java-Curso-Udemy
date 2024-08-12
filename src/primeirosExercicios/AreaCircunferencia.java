package primeirosExercicios;

import java.util.Scanner;

public class AreaCircunferencia {

	public static double calcAreaCircunf(double raio) {
		double area = Math.PI * raio * raio;
		
		return area;
	}
	
	public static void main(String[] args) {
		double r;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		r = read.nextDouble();
		System.out.println(calcAreaCircunf(r));
		
	}

}
