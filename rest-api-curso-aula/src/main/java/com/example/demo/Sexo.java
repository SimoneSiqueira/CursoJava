package com.example.demo;

public enum Sexo {
	F("Feminino"), M("Masculino"), NI("Nao informado");
	
    private String sexo;
	
	Sexo(String sexo){
		this.sexo = sexo;
		}
	
	public String 	getSexo() {
		return this.sexo;
	}
}
