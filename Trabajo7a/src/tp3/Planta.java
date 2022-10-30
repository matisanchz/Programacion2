package tp3;

import java.util.ArrayList;

public class Planta {
	private String nombre;
	private ArrayList<String> nombresPila;
	private String clasificacion;
	private String familia;
	private String clase;
	private boolean interior;
	private int reqSol;
	private int reqRiego;
	public Planta(String nombre, String clasificacion, String familia,
			String clase, boolean interior, int reqSol, int reqRiego) {
		this.nombre = nombre;
		this.clasificacion = clasificacion;
		this.familia = familia;
		this.clase = clase;
		this.interior = interior;
		this.reqSol = reqSol;
		this.reqRiego = reqRiego;
		nombresPila = new ArrayList<String>();
	}
	
	@Override
	public boolean equals(Object o){
		try{
			Planta aux = (Planta) o;
			return this.nombre.equalsIgnoreCase(aux.getNombre());
		}
		catch(Exception e){
			return false;
		}
	}
	
	public void addNombre(String p){
		if(!tieneNombre(p)){
			nombresPila.add(p);
		}
	}
	public boolean tieneNombre(String p){
		return nombresPila.contains(p);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public boolean isInterior() {
		return interior;
	}
	public void setInterior(boolean interior) {
		this.interior = interior;
	}
	public int getReqSol() {
		return reqSol;
	}
	public void setReqSol(int reqSol) {
		this.reqSol = reqSol;
	}
	public int getReqRiego() {
		return reqRiego;
	}
	public void setReqRiego(int reqRiego) {
		this.reqRiego = reqRiego;
	}
	
	
}	
