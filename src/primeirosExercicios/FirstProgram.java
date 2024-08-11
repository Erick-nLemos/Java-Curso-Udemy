package primeirosExercicios;
import java.util.Scanner;

class ConsumoGasolina{
	double d, gasolinaGasta;
	
	public double consumoGasolina(double temp, double vel){
		this.d = vel * temp;
		
		return this.gasolinaGasta = d / 12;
	}
}


public class FirstProgram {
	public static void main(String[] args) {
		//Calculando a quantidade de litros de gasolina gastos em uma viagem
		
		double tempGasto, velMedia;
		Scanner read = new Scanner(System.in);
		ConsumoGasolina consumo = new ConsumoGasolina();
		
		System.out.print("Qual foi o tempo gasto em horas na viagem? ");
		tempGasto = read.nextDouble();
		
		System.out.print("Qual foi a velocidade média em km/h durante a viagem? ");
		velMedia = read.nextDouble();
		
		String resultFormat = String.format("%.3f", consumo.consumoGasolina(tempGasto, velMedia));
		
		System.out.println("Foi gasto nesta viagem " + resultFormat + " Litos de Gasolina.");
		
	}
}
