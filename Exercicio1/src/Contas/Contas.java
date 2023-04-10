package Contas;


public class Contas  {

	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria();
		cb.setCliente("Simone");
		cb.setNumConta(22222);
		cb.setSaldo(1200.15f);
		
		System.out.println("Cliente " + cb.getCliente() +
				           " possui a conta nr " + cb.getNumConta() +
				           " que está com o saldo de: " + cb.getSaldo());
		System.out.println(" ");
		
		cb.depositar(500f);
		System.out.println("Novo saldo apos deposito: " + cb.getSaldo());
		System.out.println(" ");
		
		try {
			cb.sacar(500f);
			System.out.println("Novo saldo apos saque: " + cb.getSaldo());			
		}
		catch (RuntimeException e){
			System.out.println(e.getMessage());
		}
		System.out.println(" ");
		
		try {
			cb.sacar(2500f);
				System.out.println("Novo saldo apos segundo deposito:" + cb.getSaldo());			
			}
		catch (RuntimeException e){
				System.out.println(e.getMessage());
				
		}
		System.out.println(" ");
		// --------------------------- ContaPoupanca ----------------------------------------------------------
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setCliente("Simone");
		cp.setNumConta(22222);
		cp.setSaldo(1200.15f);
		cp.setDiaDeRendimento(1);
		
		cp.novoSaldo = cp.calcularNovoSaldo(10.5f);
		System.out.println("Valor da poupança apos dia de rendimento " + cp.novoSaldo);
		System.out.println(" ");

		cp.setDiaDeRendimento(10);
		
		cp.novoSaldo = cp.calcularNovoSaldo(10.5f);
		System.out.println("Valor da poupança antes do dia de rendeimento " + cp.novoSaldo);
		System.out.println(" ");
		
		// --------------------------- ContaEspecial ----------------------------------------------------------

    	ContaEspecial ce =  new ContaEspecial();
    	ce.setCliente("Simone");
		ce.setNumConta(22222);
		ce.setSaldo(1200.15f);
		ce.setLimite(500f);

		try {
			ce.sacar(5000f);
	     	System.out.println("Seu  Novo saldo : " + ce.getSaldo());
	        	} 
	       catch(RuntimeException e) {
	                System.out.println(e.getMessage());   
	        	}
		System.out.println("");
		try {
			ce.sacar(1000f);
	     	System.out.println("Seu novo saldo : " + ce.getSaldo());
	        	} 
	       catch(RuntimeException e) {
	                System.out.println(e.getMessage());   
	        	}
		System.out.println(" ");
	}

}
