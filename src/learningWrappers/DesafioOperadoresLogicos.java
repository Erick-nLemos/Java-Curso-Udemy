package learningWrappers;

public class DesafioOperadoresLogicos {

	public static void main(String[] args) {
		// Se os dois trabalhos derem certo, sera comprado uma televisão de 50 polegadas e sorvete
		// Se apenas um der certo, será comprado uma televisão de 32 polegadas e sorvete

		boolean job1 = false, job2 = false;
		
		
		if(job1 & job2) {
			System.out.println("OS 2 trabalhos deram certo, vou comprar uma TV de 50 polegadas e um sorvete.");
		}
		else if(job1 | job2) {
			System.out.println("Um dos trabalhos deu certo, vou comprar uma TV de 32 polegadas e um sorvete.");
		}
		else {
			System.out.println("Não vou conseguir comprar nada.");
		}
		
	}

}
