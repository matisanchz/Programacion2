package tp5;

import java.util.ArrayList;

import tp5.condiciones.Condicion;

public class Plataforma {
	private ArrayList<Pelicula> peliculas;
	private Condicion adquirirLicencia;
	public Plataforma(Condicion adquirir){
		adquirirLicencia = adquirir;
		peliculas = new ArrayList<Pelicula>();
	}
	
	public boolean adquirirLicencia(Pelicula p){
		return this.adquirirLicencia.seCumple(p);
	}
	
	public void setAdquirirLicencia(Condicion adquirirLicencia) {
		this.adquirirLicencia = adquirirLicencia;
	}

	public ArrayList<Pelicula> buscarPelis(Condicion c){
		ArrayList<Pelicula> res = new ArrayList<Pelicula>();
		for(Pelicula p: peliculas){
			if(c.seCumple(p)){
				res.add(p);
			}
		}
		return res;
	}
	public void addPelicula(Pelicula p){
		if(!peliculas.contains(p)){
			peliculas.add(p);
		}
	}
}
