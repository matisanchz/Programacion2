package tp5;

import java.util.ArrayList;

public class Pelicula {
	private String titulo;
	private String sinopsis;
	private ArrayList<String>generos;
	private String director;
	private ArrayList<String> actores;
	private int anio;
	private double duracion;
	private int edadMinima;
	public Pelicula(String titulo, String sinopsis, String director, int anio,
			double duracion, int edadMinima) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.director = director;
		this.anio = anio;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		generos = new ArrayList<String>();
		actores = new ArrayList<String>();
	}
	@Override
	public boolean equals(Object o){
		try{
			Pelicula aux = (Pelicula)o;
			return this.titulo.equals(aux.getTitulo());
		}
		catch(Exception e){
			return false;
		}
	}
	public void addGenero(String g){
		if(!existeGenero(g)){
			generos.add(g);
		}
	}
	public boolean existeGenero(String g){
		return generos.contains(g);
	}
	public void addActor(String a){
		if(!existeActor(a)){
			actores.add(a);
		}
	}
	
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public boolean existeActor(String a){
		return actores.contains(a);
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	
	
}
