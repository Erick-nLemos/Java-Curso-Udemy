package primeirosExercicios.conversorTemperaturas.main;

public class CalcTemperaturas {
	
	private double celsius = 0, fahrenheit = 0, kelvin = 0;
	private final int AJUSTE = 32;
	private final double AJUSTEK = 273.15;
	
	public double fahrenheitToCelsius(double fahren) {
		final double FATOR = 5/9.0;
		
		this.celsius = (fahren - this.AJUSTE) * FATOR;
		return celsius;
	}
	
	public double celsiusToFahrenheit(double cel) {
		final double FATOR = 9/5.0;
		
		this.fahrenheit = (cel * FATOR) + this.AJUSTE;
		return fahrenheit;
	}
	
	public double fahrenheitToKelvin(double fahren) {
		final double FATOR = 5/9.0;
		
		this.kelvin = (fahren - this.AJUSTE) * FATOR + this.AJUSTEK;
		return kelvin;
	}
	
	public double kelvinToFahrenheit(double kel) {
		final double FATOR = 9/5.0;
		
		this.fahrenheit = (kel - this.AJUSTEK) * FATOR + this.AJUSTE;
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
