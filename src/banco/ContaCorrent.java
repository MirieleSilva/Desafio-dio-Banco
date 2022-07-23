package banco;

public class ContaCorrent extends Conta{
	
	public ContaCorrent(Cliente cliente) {
		super(cliente);
	}

	@Override 
	public void imprimirExtrato(){
		System.out.println("===Extrato da Conta Corrente:===");
		super.imprimirInfosComuns();
	
	}
}
