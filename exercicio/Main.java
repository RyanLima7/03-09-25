package exercicio;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.titular = "Maria";
		cc.depositar(100);
		cc.sacar(30);
		cc.exibirSaldo(0);
		System.out.println("Tarifa CC: $ " + cc.calcularTarifaMensal());
		
		Conta cp = new ContaPoupanca();
		
		
	}

}
