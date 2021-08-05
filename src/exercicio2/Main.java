package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Hospedagem hospedagem = new Hospedagem();
		HospedagemVIP hospedagemVip = new HospedagemVIP();
		
		System.out.println("Valor hospedagem: R$ " + hospedagem.printValor());
		System.out.println("Valor hospedagem VIP: R$ " + hospedagemVip.printValor());
		System.out.println("Diferença de preço: R$ " + (hospedagemVip.printValor() - hospedagem.printValor()));
		
		sc.close();
	}

}
