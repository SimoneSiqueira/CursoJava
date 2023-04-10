package Animal;

public class TesteAnimais {

	public static void main(String[] args) {
			
		Animal a = new Animal();
		Peixe p = new Peixe();
		Mamiferos m = new Mamiferos();
		Urso u = new Urso();
		
		a.setNome("Camelo");
		a.setCor("Amarelo");
		a.setComprimento(150);
		a.setVelocidade(2f);
		a.setAmbiente(m.getAmbiente());
		
	    System.out.println(" -------------------------------------- ");
	    System.out.println("                 ZOO");
	    System.out.println(" -------------------------------------- ");
	    
	    System.out.println(a.toString());
	    System.out.println(" -------------------------------------- ");
	    
	    a.alteraNome("Tubarão");
	    a.alteraComprimento(300);
	    a.alteraPatas(p.getPatas());
	    a.alteraCor(p.getCor());
	    a.alteraAmbiente(p.getAmbiente());
	    System.out.println(a.toString());
	    System.out.println(p.toString());
	    System.out.println(" -------------------------------------- ");
		
	    a.alteraNome("Urso do Canadá");
	    a.alteraComprimento(180);
	    a.getPatas();
	    a.alteraCor("Vermelho");
	    a.alteraAmbiente(m.getAmbiente());
	    m.alteraAlimento(u.getAlimento());
	    System.out.println(a.toString());
	    System.out.println(m.toString());
	    System.out.println(" -------------------------------------- ");

	}

}
