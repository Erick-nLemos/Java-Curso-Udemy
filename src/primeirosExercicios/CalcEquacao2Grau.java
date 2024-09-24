package primeirosExercicios;

public class CalcEquacao2Grau {

	public static void main(String[] args) {
		double delta, a, b, c, x1, x2;
		
		a = 1;
		b = -1;
		c = -6;
		
		delta = (Math.pow(b, 2) - 4*a*c);
		x1 = (-b + Math.sqrt(delta)) / 2*a;
		x2 = (-b - Math.sqrt(delta)) / 2*a;
		
		System.out.printf("Delta: %.2f\n", delta);
		System.out.printf("X1: %.2f\n", x1);
		System.out.printf("X2: %.2f\n", x2);

	}

}
