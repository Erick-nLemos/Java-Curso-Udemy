package learningWrappers;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String sal1, sal2, sal3, nameFunc;
		double s1, s2, s3, m, soma;
		
		System.out.print("Digite o nome do funcionário: ");
		nameFunc = read.nextLine();
		
		System.out.print("\nDigite o primeiro salário: ");
		sal1 = read.next().replace(",", ".");
		
		System.out.print("\nDigite o segundo salário: ");
		sal2 = read.next().replace(",", ".");
		
		System.out.print("\nDigite o terceiro salário: ");
		sal3 = read.next().replace(",", ".");
		
		read.close();
		
		s1 = Double.parseDouble(sal1);
		s2 = Double.parseDouble(sal2);
		s3 = Double.parseDouble(sal3);
		
		soma = s1 + s2 + s3;
		m = soma/3;
		
		System.out.println("A soma dos salários é: "+ soma);
		System.out.println("A média dos salários é: "+ m);
		

	}

}
