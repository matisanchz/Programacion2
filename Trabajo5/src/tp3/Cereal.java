package tp3;

import java.util.ArrayList;


public class Cereal {
	private String nombre;
	private ArrayList<String> minerales;
	public Cereal(String nombre){
		this.nombre=nombre;
		minerales = new ArrayList<String>();
	}
	
	public boolean puedeSembrarse(Lote l1){
		int j = 0;
		for(int i = 0; i < minerales.size(); i++){
			if(l1.existeMineral(minerales.get(i))){
				j++;
			}
		}
		return(j==minerales.size());
	}

	public void addMineral(String m1){
		if(!existeMineral(m1)){
			minerales.add(m1);
		}
	}
	public void removeMineral(String m1){
		minerales.remove(m1);
	}
	public boolean existeMineral(String m1){
		return minerales.contains(m1);
	}
	
	@Override
	public boolean equals(Object obj){
		Cereal aux = (Cereal)obj;
		return this.getNombre().equalsIgnoreCase(aux.getNombre());
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<String> getCereales(){
		ArrayList<String> aux = new ArrayList<String>(this.minerales);
		return aux;
	}
	
}
