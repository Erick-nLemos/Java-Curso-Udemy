package learningClassString;

import java.util.Scanner;

public class aprendendoStrings {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String nome;
		
		System.out.print("Informe seu nome completo: ");
		nome = read.nextLine();
		System.out.println(nome);
		
		// metodo charAt retorna o valor do indice da string
		//System.out.println("Olá galera!".charAt(10));
		
		// metodo concat concatena uma string com outra
		//System.out.println(nome.concat(", e até a próxima."));
		
		// o metodo contains retorna verdadeiro se a string contem a string do parametro
		//System.out.println(nome.contains("Mundo"));
		
		// o metodo indexOf retorna o indice inicial da string no parametro
		//System.out.println(nome.indexOf("tarde."));
		
		String palavras[] = nome.split(" ");
		String firstName = palavras[0];
		
		System.out.printf("Olá %s, seja bem-vindo!", firstName);
		
		
		
	}

}
