package com.beethedj.api;

import java.util.ArrayList;

public class Cancion {
	
	// Atributos
	private String id;
	private String nombre;
	private String artista;
	private ArrayList<ImgAlbum> imgAlbumes = new ArrayList<ImgAlbum>();
	
	// Constructor
	public Cancion(String nombre, String artista, ArrayList<ImgAlbum> imgAlbumes) {
		this.nombre = nombre;
		this.artista = artista;
		this.imgAlbumes = imgAlbumes;
	}
	public Cancion(){ }
	
	// Métodos
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public ArrayList<ImgAlbum> getImgAlbumes() {
		return imgAlbumes;
	}
	
	public void setImgAlbumes(ArrayList<ImgAlbum> imgAlbumes) {
		this.imgAlbumes = imgAlbumes;
	}
}
