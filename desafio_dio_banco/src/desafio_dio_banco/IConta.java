package desafio_dio_banco;

public interface IConta {

	// Interface facilitadora
	
	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor, Conta contaDestino);
	void imprimirExtrato();
}
