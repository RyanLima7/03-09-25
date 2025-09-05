package exercicio;

public class ContaCorrente extends Conta {
	@Override
	public double calcularTarifaMensal() {
		return 12.0;
	}

	@Override
	public void sacar(double valor) {
		if ((valor + 12.0) >= saldo) {
			System.out.println("\n\t == AVISO == \nValor indisponível para saque! \n");
		} else {
			System.out.print("Seu novo saldo é de: ");
			System.out.println(saldo -= (valor));
		}
	}

}
