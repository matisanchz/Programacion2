package tp1;

import java.util.ArrayList;

public class Enfermedad {
	private String nombre;
	private ArrayList<String> patologiasATratar;
	public Enfermedad(String nombre) {
		this.nombre = nombre;
		patologiasATratar = new ArrayList<String>();
	}
	public boolean existePagologia(String p){
		return patologiasATratar.contains(p);
	}
	public void addPatologia(String p){
		if(!existePagologia(p)){
			patologiasATratar.add(p);
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
