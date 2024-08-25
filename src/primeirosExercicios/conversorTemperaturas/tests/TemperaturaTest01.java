package primeirosExercicios.conversorTemperaturas.tests;

import java.util.Scanner;
import primeirosExercicios.conversorTemperaturas.main.CalcTemperaturas;

public class TemperaturaTest01 {
	
	public static void main(String[] args) {
		CalcTemperaturas c = new CalcTemperaturas();
		Scanner read = new Scanner(System.in);
		double temp;
		int opcao;
		String rep;
		
		do {
			System.out.println("1 - Celsius para Fahrenheit | 2 - Fahrenheit para Celsius | 3 - Fahrenheit para Kelvin"
					+ "\n4 - Kelvin para Fahrenheit | 5 - Celsius para Kelvin | 6 - Kelvin para Celsius");
			System.out.print("Qual conversão deseja Fazer? ");
			opcao = read.nextInt();
			
			switch(opcao){
			case 1:
				System.out.print("Digite a temperatura em Celsius: ");
				temp = read.nextDouble();
				
				System.out.println("\nResutado: "+ c.celsiusToFahrenheit(temp));
				break;
			
			case 2: 
				System.out.print("Digite a temperatura em Fahrenheit: ");
				temp = read.nextDouble();
				
				System.out.println("\nResutado: "+ c.fahrenheitToCelsius(temp));
				break;
			
			case 3:
				System.out.print("Digite a temperatura em Fahrenheit: ");
				temp = read.nextDouble();
				
				System.out.println("\nResutado: "+ c.fahrenheitToKelvin(temp));
				break;
				
			case 4: 
				System.out.print("Digite a temperatura em Kelvin: ");
				temp = read.nextDouble();
				
				System.out.println("\nResutado: "+ c.kelvinToFahrenheit(temp));
				break;
			
			case 5:
				System.out.print("Digite a temperatura em Celsius: ");
				temp = read.nextDouble();
				
				System.out.println("\nResutado: "+ c.celsiusToKelvin(temp));
				break;
				
			case 6:
				System.out.print("Digite a temperatura em Kelvin: ");
				temp = read.nextDouble();
				
				System.out.println("\nResutado: "+ c.kelvinToCelsius(temp));
				break;
			
			default:
				System.out.println("Opção inválida!");
				break;
			}
			
			System.out.print("Deseja continuar [s/n]? ");
			rep = read.next();
		}while(rep.equalsIgnoreCase("s"));
		
		
		System.out.println("Fim!");
		
	}

}
