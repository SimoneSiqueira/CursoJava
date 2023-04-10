package Contas;

public class ContaBancaria extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cliente;
	private float saldo;
	private int numConta;
	
	public void sacar(float valorSaque) {
		if (this.saldo > valorSaque) {
	        this.saldo = this.saldo - valorSaque;	
			
		} else {
			throw new RuntimeException("Valor do Saque: " + valorSaque+ " é superior ao saldo: " + this.saldo);
		}
	}
	
	public void depositar(float deposito) {
		 this.saldo = this.saldo + deposito;
		
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

}
