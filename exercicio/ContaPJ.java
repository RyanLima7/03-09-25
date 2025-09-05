package exercicio;

public class ContaPJ extends Conta {
	
	

	

	@Override
	public double calcularTarifaMensal() {
		return 20.0;
	}

	
	
	@Override
	public void sacar(double valor) {
		if ((valor+ 20.0 + 1.50) >= saldo) {
			System.out.println("\n\t == AVISO == \nValor indisponível para saque! \n");
		}
		else {
			System.out.print("Seu novo saldo é de: ");
			System.out.println(saldo -= (valor + 1.50));
		}
	}

}
