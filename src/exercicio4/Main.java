package exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		InvestimentoComIR investimentoComIr = new InvestimentoComIR(sc.nextDouble(), sc.nextDouble());
		InvestimentoSemIR investimentoSemIr = new InvestimentoSemIR(sc.nextDouble(), sc.nextDouble());
		
		int meses1 = sc.nextInt();
		int meses2 = sc.nextInt();
		System.out.printf("Investimento com IR: %.2f%n", investimentoComIr.calcularLucro(meses1));
		System.out.printf("Investimento sem IR: %.2f%n", investimentoSemIr.calcularLucro(meses2));
		sc.close();
	}

}
