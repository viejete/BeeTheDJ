package com.beethedj.api;

public class Voto {
	
	// Atributos
	private Cancion cancion;
	private int numVotos;
	
	// Constructor
	public Voto(Cancion cancion, int numVotos) {
		this.cancion = cancion;
		this.numVotos = numVotos;
	}
	
	public Voto() {
	}

	// Métodos
	public Cancion getCancion() {
		return cancion;
	}
	public void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}
	public int getNumVotos() {
		return numVotos;
	}
	public void setNumVotos(int numVotos) {
		this.numVotos = numVotos;
	}
}
