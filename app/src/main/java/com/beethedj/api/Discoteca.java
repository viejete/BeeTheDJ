package com.beethedj.api;

public class Discoteca {
	
	// Atributos
	private String nombre;
	private String direccion;
	private String ciudad;
	
	// Constructor
	public Discoteca(String nombre, String direccion, String ciudad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}
	public Discoteca(){ }
	
	// Métodos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

}
