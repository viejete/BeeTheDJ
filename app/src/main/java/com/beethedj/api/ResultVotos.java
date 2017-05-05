package com.beethedj.api;

import java.util.ArrayList;

public class ResultVotos {
	
	// Atributos
	private int offset;
	private ArrayList<Voto> votos;
	
	// Constructor
	public ResultVotos(int offset, ArrayList<Voto> votos) {
		this.offset = offset;
		this.votos = votos;
	}
	
	// Métodos
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public ArrayList<Voto> getVotos() {
		return votos;
	}
	public void setVotos(ArrayList<Voto> votos) {
		this.votos = votos;
	}
	
	
}
