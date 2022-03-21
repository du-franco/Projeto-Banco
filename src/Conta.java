
public class Conta {
	
	public int numero;
	public String titular;
	public double saldo;
	
	public Conta(String titular, int numero, double saldo){
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}
	
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void dados() {
		System.out.println("------------------------------");
		System.out.println("Titular da Conta: " + this.getTitular());
		System.out.println("Número da Conta: " + this.getNumero());
		System.out.println("Saldo da Conta: R$ " + this.getSaldo());
	}
	
}
