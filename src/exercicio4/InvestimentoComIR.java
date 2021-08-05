package exercicio4;

public class InvestimentoComIR extends Investimento {

	public InvestimentoComIR(double valorInicial, double jurosMensais) {
		super(valorInicial, jurosMensais);
	}

	@Override
	public double calcularLucro(int meses) {
		double lucro = (getValorInicial() * (Math.pow(1 + (getJurosMensais() / 100), meses))) - getValorInicial();
		if(meses < 6) {
			return lucro - (lucro * 0.225);
		}
		else if(meses >= 6 && meses < 12) {
			return lucro - (lucro * 0.20);
		}
		else if(meses >= 12 && meses < 24) {
			return lucro - (lucro * 0.175);
		}
		else {
			return lucro - (lucro * 0.15);
		}
	}
}
