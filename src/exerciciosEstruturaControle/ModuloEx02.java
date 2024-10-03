package exerciciosEstruturaControle;

import java.util.Scanner;

class AnoBissexto{
	public static boolean calcAnoBissexto(int ano) {
		
		if(ano%4 == 0 && !(ano%100 == 0)) {
			return true;
		}
		else {
			return false;
		}
		
	}
}

public class ModuloEx02 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Em que ano estamos? ");
		int ano = read.nextInt();
		
		if(AnoBissexto.calcAnoBissexto(ano)) {
			System.out.printf("Ano %d é Bissexto", ano);
		}
		else {
			System.out.printf("Ano %d não é Bissexto", ano);
		}
		
		read.close();
	}
}
