package tp6;

import java.util.ArrayList;

public abstract class Trabajo {
	private String nombre;
	protected ArrayList<String>temas;
	public Trabajo(String nombre){
		this.nombre=nombre;
		temas = new ArrayList<String>();
	}
	
	public abstract boolean puedeSerEvaluado(Evaluador e);
	
	@Override
	public boolean equals(Object o){
		Evaluador aux = (Evaluador) o;
		return this.getNombre().equalsIgnoreCase(aux.getNombre());
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
