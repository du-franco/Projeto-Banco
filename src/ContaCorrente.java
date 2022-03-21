//para vincular a classe ContaCorrene a Conta usa-se extends
public class ContaCorrente extends Conta {
	
	private final String atendimento = "Sem prioridades";
	
	public ContaCorrente(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
	}
	
	//método dados, quando fazemos sua chamada ele traz tudo que está estipulado na classe Conta
	public void dados() {
		super.dados();
		System.out.println("Atendimento: " + this.getAtendimento());
	}

	public String getAtendimento() {
		return atendimento;
	}
	
	public void sacar(double valor) {
		System.out.println("-----------------------" + this.getTitular() + "-------------------------");
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso. Seu novo saldo: R$ " + this.getSaldo());
		}else {
			System.out.println("Saldo insuficiente para saque");
		}
	}
	
	public void depositar(double valor) {
		System.out.println("-----------------------" + this.getTitular() + "--------------------------");
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso. Seu novo saldo: R$ " + this.getSaldo());
	}
	
}
