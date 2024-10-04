package classe.domain;

public class Data {
	private int dia, mes, ano;
	
	public void imprimirData() {
		
		System.out.printf("%d/%d/%d", dia, mes, ano);
	}
	
	public void imprimirData(int d, int m, int y) {
		this.dia = d;
		this.mes = m;
		this.ano = y;
		
		System.out.printf("%d/%d/%d", dia, mes, ano);
	}
	
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
