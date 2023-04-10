package Contas;

public class ContaEspecial extends ContaBancaria {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float limite;
	
	@Override
	public void sacar(float valor) {
		float novoSaldo = super.getSaldo();
		
		if (super.getSaldo() + this.limite > valor) {
	        novoSaldo = getSaldo() - valor;	
			super.setSaldo(novoSaldo);
		} else {
			throw new RuntimeException("Valor do Saque Superior ao saldo: " + super.getSaldo() + " somado ao Limite disponivel de: " + this.getLimite());
		}
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}	

}
