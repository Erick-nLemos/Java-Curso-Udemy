package primeirosExercicios.conversorTemperaturas.tests;

import java.util.Scanner;
import primeirosExercicios.conversorTemperaturas.main.CalcTemperaturas;

public class TemperaturaTest01 {
	
	public static void main(String[] args) {
		CalcTemperaturas c = new CalcTemperaturas();
		Scanner read = new Scanner(System.in);
		double temp;
		
		System.out.print("Digite a temperatura em Fahrenheits: ");
		temp = read.nextDouble();
		
		System.out.println("\n"+ c.kelvinToCelsius(temp)+" ");
	}

}
