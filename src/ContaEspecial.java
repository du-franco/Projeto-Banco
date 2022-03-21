
public class ContaEspecial extends Conta {
	
	//subclasse
	private final String atendimento = "Com prioridades";
	public double chequeEspecial;
	
	
	//superclasse
	public ContaEspecial(String titular, int numero, double saldo, double chequeEspecial) {
		super(titular, numero, saldo);
		this.chequeEspecial = chequeEspecial;	
	}
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public String getAtendimento() {
		return atendimento;
	}
	
	public void dados() {
		super.dados();
		System.out.println("Atendimento: " + this.getAtendimento());
		System.out.println("Limite Cheque Especial: R$ " + this.getChequeEspecial());
	}
	
	public void sacar(double valor) {
		System.out.println("----------------------------" + this.getTitular() + "------------------------------");
		if(this.getSaldo() >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso. Seu novo saldo: R$ " + this.getSaldo());
		}else if((this.getSaldo() + this.getChequeEspecial()) >= valor) {
			System.out.println("Seu saldo disponível não é suficiente, você entrará no limite especial");
			this.chequeEspecial -= (valor - this.getSaldo());
			this.saldo -= valor;
			System.out.println("Saque realizado. Novo saldo: R$" + this.getSaldo() + " Seu limite: " + this.getChequeEspecial());
		}else {
			System.out.println("Saque não realizado. Litimite indisponível");
		}
	}
	
	public void depositar(double valor)
    {
		System.out.println("----------------------------" + this.getTitular() + "------------------------------");
		if(valor + this.getSaldo() <= 0) {
			this.setChequeEspecial((this.getChequeEspecial() + valor));
		}else if(this.getSaldo() < 0) {
			this.setChequeEspecial((this.getChequeEspecial() - this.getSaldo()));
		}
		this.setSaldo(this.getSaldo() + valor);
		System.out.println("Depósito realizado com sucesso." + "\n" + "Saldo Atual: R$ " + this.getSaldo() + "\n" + "Limite Cheque Especial: R$" + this.getChequeEspecial());
    }
}
