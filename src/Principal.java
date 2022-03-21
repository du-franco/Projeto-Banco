
public class Principal {

	public static void main(String[] args) {

		//Conta c1 = new Conta("Eduardo Franco", 111, 300.50);
		//Conta c2 = new Conta("Hugo André", 112, 200);
		
		//c1.dados();
		//c2.dados();
		
		ContaCorrente c3 = new ContaCorrente("Eduardo Franco", 111, 300.50);
		ContaCorrente c4 = new ContaCorrente("Hugo André", 112, 200);
		
		c3.dados();
		c4.dados();
		
		c3.sacar(100);
		c3.depositar(200);
		
		ContaEspecial c5 = new ContaEspecial ("Gabriela Oliveira", 101, 200, 400);
		
		c5.dados();
		
		c5.sacar(600);
		c5.depositar(1000);
		
		ContaPoupanca c6 = new ContaPoupanca ("Einstein Soares", 1000, 500);
		
		c6.rendimento(0.3);
	}

}
