package exercicio3;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int ano = sc.nextInt();
		
		if(dia >= 1 && dia <= 31 && mes >= 1 && mes <=12 && ano == 2020) {
			System.out.println("Data válida");
		}
		if(dia < 1 || dia > 31 ) {
			System.out.println("Dia invalido");
		}
		if(mes < 1 || mes > 12 ) {
			System.out.println("Mês invalido");
		}
		if(ano != 2020 ) {
			System.out.println("Ano invalido");
		}
		
		sc.close();
	}

}
