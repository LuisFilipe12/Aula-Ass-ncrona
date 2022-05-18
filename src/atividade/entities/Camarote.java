package atividade.entities;

public class Camarote extends Ingresso {

	public double adicional;

	public Camarote(String evento, double data, double valor) {
		super(evento, data, valor);
		this.adicional = adicional;

	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	public double CalcularAdicional() {
		return adicional = valor + (valor + 150);
	}
	@Override
	public String toString() {
		return super.toString()
				+"\nevento: "
				+"\ndata: "
				+"\nvalor"
				+"\nadicional: ";
	}
}
