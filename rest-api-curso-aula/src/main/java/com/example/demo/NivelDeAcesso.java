package com.example.demo;

public enum NivelDeAcesso {
	
	A("Administrador"), M("Master"), P("Padrao");

    private String nivelDeAcesso;
	
	NivelDeAcesso (String nivelDeAcesso){
		this.nivelDeAcesso = nivelDeAcesso;
		}
	
	public String 	getNivelDeAcesso() {
		return this.nivelDeAcesso;
	}
}
