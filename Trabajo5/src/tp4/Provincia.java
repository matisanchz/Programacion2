package tp4;

import java.util.ArrayList;

public class Provincia {
	private String nombre;
	private ArrayList <Ciudad> ciudades;
	private ArrayList <Ciudad> ciudades_deficitarias;
	private static final int maxhabitantes=100000;
	
	public Provincia(String nombre){
		this.nombre=nombre;
		ciudades=new ArrayList<Ciudad>();
		ciudades_deficitarias=new ArrayList<Ciudad>();
		
	}
	
	public ArrayList<Ciudad> getCiudadesDeficitarias(){
		for(int i= 0;i< ciudades.size(); i++){
			if(esDeficitaria(ciudades.get(i))&&(ciudades.get(i).getHabitantes()>maxhabitantes)){
				ciudades_deficitarias.add(ciudades.get(i));
			}
		}
		return new ArrayList<Ciudad>(ciudades_deficitarias);
	}
	
	public boolean esDeficitaria(Ciudad c){
		for(int i= 0;i< ciudades.size(); i++){
			if(ciudades.get(i).equals(c)){
				if(ciudades.get(i).esDeficitaria()){
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean tieneMasMitadCiudDefic(){
		return this.cantCiudadesDef() > (ciudades.size()/2);
	}
	
	public int cantCiudadesDef(){
		int cantidad = 0;
		for(int i = 0; i< ciudades.size(); i++){
			if(this.ciudades.get(i).esDeficitaria()){
				cantidad++;
			}
		}
		return cantidad;
	}
	
	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + "]";
	}

	@Override
	public boolean equals(Object o){
		Provincia aux = (Provincia)o;
		return (nombre.equalsIgnoreCase(aux.getNombre()));
	}
	
	public void addCiudad(Ciudad c1){
		if(!existeCiudad(c1)){
			ciudades.add(c1);
		}
	}
	public void removeCiudad(Ciudad c1){
		ciudades.remove(c1);
	}
	public boolean existeCiudad(Ciudad c1){
		return ciudades.contains(c1);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
