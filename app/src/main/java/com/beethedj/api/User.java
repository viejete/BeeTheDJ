package com.beethedj.api;

public class User {
	
	// Atributos
	private int segundosParaVoto; // El tiempo que al usuario le falta para obtener un voto (en segundos)
	private int votosDisponibles;
	
	// Constructor
	public User(int segundosParaVoto, int votosDisponibles) {
		this.segundosParaVoto = segundosParaVoto;
		this.votosDisponibles = votosDisponibles;
	}
	
	public User() {
	}

	// Métodos
	public int getSegundosParaVoto() {
		return segundosParaVoto;
	}
	public void setSegundosParaVoto(int segundosParaVoto) {
		this.segundosParaVoto = segundosParaVoto;
	}
	public int getVotosDisponibles() {
		return votosDisponibles;
	}
	public void setVotosDisponibles(int votosDisponibles) {
		this.votosDisponibles = votosDisponibles;
	}
}
