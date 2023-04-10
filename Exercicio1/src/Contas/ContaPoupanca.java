package Contas;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	private int diaDeRendimento;
	float novoSaldo;
	
	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}
	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}
	 
	public float calcularNovoSaldo(float taxa) {
		Calendar c = Calendar.getInstance();
		int diaAtual =  c.get(Calendar.DAY_OF_MONTH);
		if (diaDeRendimento <= diaAtual) {
		   novoSaldo = ((super.getSaldo() * (taxa / 100f)) + super.getSaldo());
		}else {
			novoSaldo = super.getSaldo();
		}
		return this.novoSaldo;
		 
	}
}
