package primeirosExercicios.conversorTemperaturas.main;

public class CalcTemperaturas {
	
	private double celsius = 0, fahrenheit = 0, kelvin = 0;
	private final int AJUSTE = 32;
	private final double AJUSTEK = 273.15;
	private final double FATOR = 5/9.0;
	private final double FATOR2 = 9/5.0;
	
	// Metodos de conversãp
	public double fahrenheitToCelsius(double fahren) {
		
		this.celsius = (fahren - this.AJUSTE) * this.FATOR;
		return celsius;
	}
	
	public double celsiusToFahrenheit(double cel) {
	
		this.fahrenheit = (cel * this.FATOR2) + this.AJUSTE;
		return fahrenheit;
	}
	
	public double fahrenheitToKelvin(double fahren) {
		
		this.kelvin = (fahren - this.AJUSTE) * this.FATOR + this.AJUSTEK;
		return kelvin;
	}
	
	public double kelvinToFahrenheit(double kel) {
		
		this.fahrenheit = (kel - this.AJUSTEK) * this.FATOR2+ this.AJUSTE;
		return fahrenheit;
	}
	
	public double celsiusToKelvin(double cel) {
		
		this.kelvin = cel + this.AJUSTEK;
		return kelvin;
	}
	
	public double kelvinToCelsius(double kel) {
		
		this.celsius = kel - this.AJUSTEK;
		return celsius;
	}
	
	
}
