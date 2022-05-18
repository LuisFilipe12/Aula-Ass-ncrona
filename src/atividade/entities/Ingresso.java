package atividade.entities;

public class Ingresso {

	public String evento;
	public double data;
	public double valor;

	public Ingresso() {

	}

	public Ingresso(String evento, double data, double valor) {
		super();
		this.evento = evento;
		this.data = data;
		this.valor = valor;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return 
				"\nEvento: "
				+ "\nData: "
				+ "\nvalor: ";

		
		
		
	}

}
