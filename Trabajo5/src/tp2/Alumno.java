package tp2;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private boolean tiene_casa;
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> familiares;
	public Alumno(String nombre){
		cualidades = new ArrayList<String>();
		familiares = new ArrayList<Alumno>();
		this.nombre = nombre;
		this.tiene_casa = false;
	}
	
	public ArrayList<Alumno> getFamiliares(){
		ArrayList<Alumno> aux = new ArrayList<Alumno>(this.familiares);
		return aux;
	}
	
	public String toString(){
		return this.getNombre();
	}
	
	@Override
	public boolean equals(Object obj){
		Alumno aux = (Alumno)obj;
		return(this.nombre.equalsIgnoreCase(aux.getNombre()));
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void addFamiliar(Alumno a1){
		if(!familiares.contains(a1)){
			familiares.add(a1);
		}
	}
	public void removeFamiliar(Alumno a1){
		familiares.remove(a1);
	}
	public boolean existeFamiliar(Alumno a1){
		return familiares.contains(a1);
	}
	
	
	public void addCualidad(String s1){
		if(!cualidades.contains(s1)){
			cualidades.add(s1);
		}
	}
	public void removeCualidad(String s1){
		cualidades.remove(s1);
	}
	public boolean existeCualidad(String s1){
		return cualidades.contains(s1);
	}

	public boolean isTiene_casa() {
		return tiene_casa;
	}

	public void setTiene_casa(boolean tiene_casa) {
		this.tiene_casa = tiene_casa;
	}
	
	
}
