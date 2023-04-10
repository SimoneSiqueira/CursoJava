package Animal;

public class Mamiferos extends Animal {
 
	private String alimento;	
	
	public Mamiferos() {
		this.setAmbiente("Terra");
	}
		
	void alteraAlimento(String alimento) {
		this.setAlimento(alimento);
	}
	
	@Override
	public String toString() {
		return " Alimento        : " + this.alimento;
				}

	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

}
