package Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteAnimais2 {

	public static void main(String[] args) {
		String nome;	
		String cor;
		String ambiente;
		String alimento;
		String caracteristicas;
		int comprimento;
		int patas;
		float velocidade;
		
		ArrayList<String> listaTipo = new ArrayList<String>();
		ArrayList<String> listaNome = new ArrayList<String>();
		ArrayList<String> listaCor = new ArrayList<String>();
		ArrayList<String> listaAmbiente = new ArrayList<String>();
		ArrayList<String> listaAlimento = new ArrayList<String>();
		ArrayList<String> listaCaracteristicas = new ArrayList<String>();
		ArrayList<Integer> listaComprimento = new ArrayList<Integer>();
		ArrayList<Integer> listaPatas = new ArrayList<Integer>();
		ArrayList<Float> listaVelocidade = new ArrayList<Float>();

		System.out.println("Informe os dados dos Mamiferos na sequencia: ");
		for (int i=0; i < 10; i++) {
		    Scanner input = new Scanner(System.in);

			System.out.println(" -------------------------------------- ");   
			System.out.println("Nome        : ");
			nome = input.nextLine(); 			  
			System.out.println("Cor         : ");
			cor =  input.nextLine();
			System.out.println("Ambiente    : ");
			ambiente =  input.nextLine();
			System.out.println("Alimento    : ");
			alimento = input.nextLine();
			System.out.println("Patas       : ");
			patas =  input.nextInt();
			System.out.println("Comprimento : ");
			comprimento =  input.nextInt();
			System.out.println("Velocidade  : ");
			velocidade = input.nextFloat();
			   
			listaTipo.add("Mamifero");
			listaNome.add(nome);			
			listaCor.add(cor);
			listaAmbiente.add(ambiente);
			listaAlimento.add(alimento);
			listaComprimento.add(comprimento);
			listaPatas.add(patas);
			listaVelocidade.add(velocidade);
			listaCaracteristicas.add(" ");
			   		   
			 }
		
		System.out.println("Informe os dados dos Peixes na sequencia: ");
		   
		for (int i=0; i < 10; i++) {
			Scanner input = new Scanner(System.in);
			System.out.println(" -------------------------------------- ");
			System.out.println("Nome            : ");
			nome = input.nextLine(); 			  
			System.out.println("Cor             : " );
			cor =  input.nextLine();
			System.out.println("Ambiente        : " );
			ambiente =  input.nextLine();
			System.out.println("Caracteristicas : " );
			caracteristicas =  input.nextLine();
			System.out.println("Comprimento     : ");
			comprimento =  input.nextInt();
			System.out.println("Velocidade      : ");
			velocidade = input.nextFloat();
			   
			listaTipo.add("Peixe");
			listaNome.add(nome);			
			listaCor.add(cor);
			listaAmbiente.add(ambiente);
			listaCaracteristicas.add(caracteristicas);
			listaComprimento.add(comprimento);
			listaVelocidade.add(velocidade);
			   		   
	    }
		Animal a = new Animal();
		Peixe p = new Peixe();
		Mamiferos m = new Mamiferos();
				
	    System.out.println(" -------------------------------------- ");
	    System.out.println("                 ZOO");
	    System.out.println(" -------------------------------------- ");

		for (int x=0; x< listaTipo.size(); x++) {
		  a.setNome(listaNome.get(x));
		  a.setComprimento(listaComprimento.get(x));
		  a.setAmbiente(listaAmbiente.get(x));
		  a.setCor(listaCor.get(x));
		  a.setVelocidade(listaVelocidade.get(x));
		  
		  switch (listaTipo.get(x)) {
			case "Mamifero": {				
			    a.alteraPatas(listaPatas.get(x));
			    m.alteraAlimento(listaAlimento.get(x));

			    System.out.println(" Tipo            : " + listaTipo.get(x));
			    System.out.println(a.toString());
			    System.out.println(m.toString());
			    System.out.println(" -------------------------------------- ");
			    break; 
			    
				}
			case "Peixe": {
			     a.alteraPatas(p.getPatas());
			     p.alteraCaracteristica(listaCaracteristicas.get(x));

			     System.out.println(" Tipo            : " + listaTipo.get(x)); 
			     System.out.println(a.toString());
			     System.out.println(p.toString());
			     System.out.println(" -------------------------------------- ");
			     break;
			}
			
		}
	}
}
		

	}


