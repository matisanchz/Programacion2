package tp3;

import java.util.ArrayList;

public class Lote {
	private String nombre;
	private int hectareas;
	private ArrayList<String> minerales;
	public Lote(String nombre, int hectareas){
		this.nombre = nombre;
		this.hectareas=hectareas;
		minerales = new ArrayList<String>();
	}
	
	public boolean esApto(Cereal c1){
		int j = 0;
		for(int i = 0; i < minerales.size(); i++){
			if(c1.existeMineral(minerales.get(i))){
				j++;
			}
		}
		return(j==c1.getCereales().size());
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
		Lote aux = (Lote)obj;
		return this.getNombre().equalsIgnoreCase(aux.getNombre());
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHectareas() {
		return hectareas;
	}
	public void setHectareas(int hectareas) {
		this.hectareas = hectareas;
	}
	
}
