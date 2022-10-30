package tp2;

import java.util.ArrayList;

public class Casa {
	private String nombre;
	private int capacidad;
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> alumnos;
	public Casa(String nombre, int capacidad){
		this.nombre = nombre;
		this.capacidad = capacidad;
		cualidades = new ArrayList<String>();
		alumnos = new ArrayList<Alumno>();
	}
	
	public String toString(){
		String aux = this.getNombre();
		for(int i=0; i<alumnos.size(); i++){
			aux+= ", ";
			aux+= alumnos.get(i).toString();
		}
		return aux;
	}
	
	@Override
	public boolean equals(Object obj){
		Casa aux = (Casa)obj;
		return (this.nombre.equalsIgnoreCase(aux.getNombre()));
	}
	
	public boolean tieneTodasCualidades(Alumno a1){
		int j = 0;
		for(int i=0; i<cualidades.size(); i++){
			if(a1.existeCualidad(cualidades.get(i))){
				j++;
			}
		}
		return j==cualidades.size();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	public void addAlumno(Alumno a1){
		if(esAdmisible(a1)&&a1.isTiene_casa()==false){
			alumnos.add(a1);
			a1.setTiene_casa(true);
		}
	}
	
	public boolean esAdmisible(Alumno a1){
		return(!existeAlumno(a1)&&aunTieneCapacidad()&&tieneTodasCualidades(a1));
	}
	
	public boolean aunTieneCapacidad(){
		return alumnos.size()<this.capacidad;
	}
	public void removeAlumno(Alumno a1){
		alumnos.remove(a1);
	}
	public boolean existeAlumno(Alumno a1){
		return alumnos.contains(a1);
	}
	
}
