package com.beethedj.api;

import java.util.ArrayList;

public class ResultDiscotecas {
	
	// Atributos
	private int offset; // Numero por el que se empieza a buscar
	private ArrayList<Discoteca> discotecas;
	
	// Constructor
	public ResultDiscotecas(int offset, ArrayList<Discoteca> discotecas) {
		this.offset = offset;
		this.discotecas = discotecas;
	}
	
	// Métodos
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public ArrayList<Discoteca> getDiscotecas() {
		return discotecas;
	}
	public void setDiscotecas(ArrayList<Discoteca> discotecas) {
		this.discotecas = discotecas;
	}
	
}
