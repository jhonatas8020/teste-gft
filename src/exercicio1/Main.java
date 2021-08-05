package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while(n < 1000 || n > 9999) {
			System.out.println("O numero digitado deve conter 4 digitos");
			n = sc.nextInt();
		}
		
		char[] digitos = String.valueOf(n).toCharArray();
		int par = 0;
		for(char d : digitos) {
			if(d % 2 == 0) {
				par++;
			}
		}
		
		System.out.println(par);
		
		sc.close();
	}

}
