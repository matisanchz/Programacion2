package tp6;

import java.util.ArrayList;

public class Evaluador {
	private String nombre;
	private ArrayList<String>temas;
	private ArrayList<Trabajo>trabajos;
	public Evaluador(String nombre){
		this.nombre = nombre;
		temas = new ArrayList<String>();
		trabajos = new ArrayList<Trabajo>();
	}
	
	public void addTrabajo(Trabajo t){
		if(esApto(t)){
			trabajos.add(t);
		}
	}
	
	public ArrayList<Trabajo> getTrabajos(){
		return new ArrayList<Trabajo>(trabajos);
	}
	
	public boolean esApto(Trabajo t){
		return t.puedeSerEvaluado(this);
	}
	
	@Override
	public boolean equals(Object o){
		Evaluador aux = (Evaluador) o;
		return this.getNombre().equalsIgnoreCase(aux.getNombre());
	}
	
	public void addTema(String t){
		if(!existeTema(t)){
			temas.add(t);
		}
	}
	
	public void removeTema(String t){
		temas.remove(t);
	}
	
	public boolean existeTema(String t){
		return temas.contains(t);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
