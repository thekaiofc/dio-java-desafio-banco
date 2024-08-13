package desafio_dio_banco;

public class Main {
	public static void main (String[] args) {
		
		Cliente kaio = new Cliente();
		kaio.setNome("Kaio");
		
		Conta cc = new ContaCorrente(kaio);
		cc.depositar(100);
		Conta cp = new ContaPoupanca(kaio);
		cp.depositar(150);
		
		cc.transferir(100, cp);
	
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
