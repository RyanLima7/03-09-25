package exercicio;

public abstract class Conta {

	int numero;
	String agencia;
	String titular;
	double saldo;

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		saldo -= valor;
	}

	public void exibirSaldo(double valor) {
		System.out.println("Saldo : " + saldo);
	}

	public abstract double calcularTarifaMensal();

}
