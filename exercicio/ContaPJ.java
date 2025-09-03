package exercicio;

public class ContaPJ extends Conta {

	@Override
	public double calcularTarifaMensal() {
		return 20.0;
	}

	@Override
	public void sacar(double valor) {
		saldo -= (valor + 1.50);
	}

}
