package learningWrappers;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		double expressao1, expressao2, result;
		
		expressao1 = Math.pow(6*(3+2), 2)/(3*2);
		expressao2 = Math.pow(((1-5)*(2-7))/2, 2);
		
		result = Math.pow(expressao1 - expressao2, 3)/ Math.pow(10, 3);
		
		System.out.println(result);
		
	}

}
