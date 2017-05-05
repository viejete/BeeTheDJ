package com.beethedj.api;

import java.util.ArrayList;

public class ResultCanciones {

	// Atributos
	private int offset;
	private ArrayList<Cancion> canciones;
	
	// Constructor
	public ResultCanciones(int offset, ArrayList<Cancion> canciones) {
		this.offset = offset;
		this.canciones = canciones;
	}
	
	// Métodos
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}
	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}
	
	
}
