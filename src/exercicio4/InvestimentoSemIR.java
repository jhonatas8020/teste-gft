package exercicio4;

public class InvestimentoSemIR extends Investimento {

	public InvestimentoSemIR(double valorInicial, double jurosMensais) {
		super(valorInicial, jurosMensais);
	}

	@Override
	public double calcularLucro(int meses) {
		if(getValorInicial() < 1000.00) {
			System.out.println("O valor inicial para investimneto sem IR não pode ser menor que R$ 1000.00");
			return 0;
		}
		else {
			return (getValorInicial() * (Math.pow(1 + (getJurosMensais() / 100), meses))) - getValorInicial();
		}
	}
}
