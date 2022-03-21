
public class ContaPoupanca extends Conta {

	public ContaPoupanca(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
	}
	
	public void rendimento(double porcentagem) {
		String[] anual = {"Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		for(int i = 0; i < anual.length; i++) {
			this.saldo += (this.saldo * porcentagem);
			System.out.printf("No m�s de %s, o saldo de sua poupan�a mais os rendimentos � de: R$ %.2f.%n", anual[i], this.saldo);
		}
	}
}
