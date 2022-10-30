package tp4;

import java.util.ArrayList;

import tp4.condiciones.Condicion;

public abstract class Elemento {
	private String localizacion;
	public Elemento(String loc){
		localizacion=loc;
	}
	public abstract int cantVotosCondicion(Condicion c);
	
	//Es igual para ambos elementos, lo abstraigo
	public int porcentajeVotosCondicion(Condicion c){
		return cantVotosCondicion(c)/cantTotalVotos();
	}
	
	public abstract int cantTotalVotos();
	public abstract ArrayList<Candidato> candidatosPresentan();
	
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
	
}
