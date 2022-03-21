
public class ContaPoupanca extends Conta {

	public ContaPoupanca(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
	}
	
	public void rendimento(double porcentagem) {
		String[] anual = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		for(int i = 0; i < anual.length; i++) {
			this.saldo += (this.saldo * porcentagem);
			System.out.printf("No mês de %s, o saldo de sua poupança mais os rendimentos é de: R$ %.2f.%n", anual[i], this.saldo);
		}
	}
}
