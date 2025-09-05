package exercicio;

public abstract class Conta {

	int numero;
	String agencia;
	String titular;
	double saldo;
	
	
	public double getSaldo(double valor) {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		saldo -= valor;
	}

	public void exibirSaldo() {
	    System.out.println("Saldo de " + titular + ": R$" + saldo);
	}

	

	public abstract double calcularTarifaMensal();

}
