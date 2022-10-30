package tp4;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private ArrayList <Provincia> provincias;
	
	
	public Pais(String nombre){
		this.nombre=nombre;
		provincias=new ArrayList<Provincia>();
	}

	public ArrayList<Ciudad> ciudadesDeficitarias(){
		ArrayList<Ciudad> ciudades_deficitarias = new ArrayList<Ciudad>();
		for(int i = 0; i<provincias.size(); i++){
			ciudades_deficitarias.addAll(provincias.get(i).getCiudadesDeficitarias());
		}
		return ciudades_deficitarias;		
	}
	
	public ArrayList<Provincia> provinciaMasMitadCiudDefic(){
		ArrayList<Provincia> provincia_mas_mitad_def = new ArrayList<Provincia>();
		for(int i = 0; i<provincias.size(); i++){
			if(this.provincias.get(i).tieneMasMitadCiudDefic()){
				provincia_mas_mitad_def.add(provincias.get(i));
			}
		}
		return provincia_mas_mitad_def;
	}
	
	public void addProvincia(Provincia p1){
		if(!existeProvincia(p1)){
			provincias.add(p1);
		}
	}
	
	public void removeProvincia(Provincia p1){
		provincias.remove(p1);
	}
	
	public boolean existeProvincia(Provincia p1){
		return provincias.contains(p1);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Provincia> getProvincias() {
		return new ArrayList<Provincia>(provincias);
	}
	
}
