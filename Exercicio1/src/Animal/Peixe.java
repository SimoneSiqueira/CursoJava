package Animal;

public class Peixe extends Animal {
      public Peixe() {
	
		this.setCaracteristica("Barbatana e calda");
		this.setAmbiente("Mar");
 		this.setCor("Cinzenta");
	}

	private String caracteristica;

	
	void alteraCaracteristica(String caracteristica) {
		this.setCaracteristica(caracteristica);
	}
	
	@Override
	public String toString() {
		return " Caracteristicas : " + this.getCaracteristica() ;
          }

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

}
