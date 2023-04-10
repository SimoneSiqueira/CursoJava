package Animal;

public class Animal  {

	private String nome;
	private String cor;
	private String ambiente;
	private int comprimento;
	private float velocidade;
	private int patas;
	
	//public Animal (String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
	public Animal() {
		this.setNome(nome);
		this.setCor(cor);
		this.setAmbiente(ambiente);
		this.setComprimento(comprimento);
		this.setVelocidade(velocidade);
		this.setPatas(4);
	}
	
	void alteraNome(String nome) {
		this.setNome(nome);
	}
	
	void alteraComprimento(int comprimento) {
		this.setComprimento(comprimento);
	}
	
	void alteraPatas(int patas) {
		this.setPatas(patas);
	}

	void alteraCor(String cor) {
		this.setCor(cor);
	}
		
	
	void alteraAmbiente(String ambiente) {
		this.setAmbiente(ambiente);
	}
	
	void alteraVelocidade(float velocidade) {
		this.setVelocidade(velocidade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}

	@Override
	public String toString() {
	
	return
	" Animal          : " + this.getNome() + "\n" + 
    " Compprimento    : " + this.getComprimento() + " cm \n" +
    " Patas           : " + this.getPatas() + "\n" +
    " Cor             : " + this.getCor() + "\n" +
    " Ambiente        : " + this.getAmbiente() + "\n" + 
	" Velocidade      : " + this.getVelocidade() + " m/s ";
	}	

}
