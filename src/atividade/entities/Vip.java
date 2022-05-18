package atividade.entities;

import java.util.Scanner;

public class Vip extends Ingresso {

	Scanner sc = new Scanner(System.in);

	public double adicionall;
	public String bebida;

	public Vip(String evento, double data, double valor) {
		super(evento, data, valor);
		this.adicionall = adicionall;
		this.bebida = bebida;
	}

	public double getAdicionall() {
		return adicionall;
	}

	public void setAdicionall(double adicionall) {
		this.adicionall = adicionall;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public double CalcularAdicional() {
		return adicionall = valor + (valor + 200) + ((valor + 150));
	}

	@Override
	public String toString() {
		return super.toString()
				+"\nevento: "
				+"\ndata: "
				+"\nvalor"
				+"\nadicional: "
				+"\nbebida: ";
		
		
		
	}
}
