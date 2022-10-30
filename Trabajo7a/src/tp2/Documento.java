package tp2;

import java.util.ArrayList;

public class Documento {
	private String titulo;
	private ArrayList<String>autores;
	private String contenido;
	private ArrayList<String>palabrasClave;
	public Documento(String titulo, String contenido){
		this.titulo=titulo;
		this.contenido = contenido;
		autores = new ArrayList<String>();
		palabrasClave = new ArrayList<String>();
	}
	
	@Override
	public boolean equals(Object o){
		try{
			Documento aux = (Documento)o;
			return this.titulo.equalsIgnoreCase(aux.getTitulo());
		}
		catch(Exception e){
			return false;
		}
	}
	public void addPalabra(String p){
		if(!contienePalabra(p)){
			palabrasClave.add(p);
		}
	}
	public boolean contienePalabra(String p){
		return palabrasClave.contains(p);
	}
	public void addAutor(String a){
		if(!contieneAutor(a)){
			autores.add(a);
		}
	}
	public boolean contieneAutor(String a){
		return autores.contains(a);
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
}
