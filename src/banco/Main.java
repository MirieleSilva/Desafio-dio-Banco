package banco;

public class Main {

	public static void main(String[] args) {
				
		Cliente davi = new Cliente();
		davi.setNome("Davi");
		
		Conta cc = new ContaCorrent(davi);
		Conta poupanca = new ContaPoupanca(davi);
		
		cc.depositar(150);
		cc.sacar(50);
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
