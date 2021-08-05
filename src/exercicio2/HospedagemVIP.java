package exercicio2;

public class HospedagemVIP extends Hospedagem{

	private double valorAdicional = 100.00;

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public double printValor() {
		return getValor() + valorAdicional;
	}
}
