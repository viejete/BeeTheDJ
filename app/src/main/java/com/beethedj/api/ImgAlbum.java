package com.beethedj.api;

public class ImgAlbum {
	
	// Atributos
	private String url;
	private int width; // La api de Spotify puede devolver null o un String vacío según el álbum. 
	private int height; // La api de Spotify puede devolver null o un String vacío según el álbum.
	
	
	// Constructor
	public ImgAlbum(String url, int width, int height) {
		this.url = url;
		this.width = width;
		this.height = height;
	}
	public ImgAlbum(){ }
	
	// Métodos
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
