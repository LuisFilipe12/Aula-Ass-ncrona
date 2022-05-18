package atividade;

import java.util.Scanner;

import atividade.entities.Camarote;
import atividade.entities.Ingresso;
import atividade.entities.Vip;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ingresso ingresso = new Ingresso();
		Camarote camarote = (Camarote) ingresso;
		Vip vip = (Vip) ingresso;
		
		System.out.print("Entre com o nome do evento: ");
		ingresso.setEvento(sc.nextLine());
		
		System.out.print("Entre com a data do evento: ");
		ingresso.setData(sc.nextDouble());
		
		System.out.print("Entre com o valor do ingresso: ");
		ingresso.setValor(sc.nextDouble());
				
		System.out.println(ingresso);
		
		sc.close();
	}

}
