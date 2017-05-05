package com.beethedj.api;

import java.util.ArrayList;

public class Api {
	
	public static User getUser(String idUser){
		User user = new User();
		return user;
	}
	
	public static void votar(String idUser, String idDiscoteca){
	}
	
	public static ArrayList<Discoteca> buscarDiscotecasByStr(String query){
		ArrayList<Discoteca> discotecas = new ArrayList<Discoteca>();
		return discotecas;
	}
	
	public static ArrayList<Discoteca> buscarDiscotecasByGps(String gps){
		ArrayList<Discoteca> discotecas = new ArrayList<Discoteca>();
		return discotecas;
	}
	
	public static ArrayList<Cancion> buscarCanciones(String query){
		ArrayList<Cancion> canciones = new ArrayList<Cancion>();
		return canciones;
	}
	
	public static ArrayList<Voto> getVotos(String idDiscoteca){
		ArrayList<Voto> votos = new ArrayList<Voto>();
		return votos;
	}
}
