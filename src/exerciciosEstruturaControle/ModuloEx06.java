package exerciciosEstruturaControle;

import java.util.Random;
import java.util.Scanner;

public class ModuloEx06 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner read = new Scanner(System.in);
		int tentativas = 10;
		int numRand = random.nextInt(1, 101);
		
		System.out.println("Adivinhe o número de 1 a 100");
		System.out.println("[ Você tem 10 tentativas! ]");
		System.out.print("Digite um número: ");
		int num = read.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			if(num != numRand) {
				
				System.out.printf("\n[ Tentativas Restantes: %d ]\n", --tentativas);
				if(num > numRand) {
					System.out.println("Dica: é um número menor.");
				}
				else {
					System.out.println("Dica: é um número maior.");
				}
				System.out.print("Errou! Digite um número: ");
				num = read.nextInt();
			}
			else {
				System.out.println("-=-=-=--=-=-=-=-=-==-=-=-=-=-=-=");
				System.out.println("	Parabéns! Você acertou!!	");
				System.out.println("-=-=-=--=-=-=-=-=-==-=-=-=-=-=-=");
				break;
			}
		}
		
		read.close();

	}

}
