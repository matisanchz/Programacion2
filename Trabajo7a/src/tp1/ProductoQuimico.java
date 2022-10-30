package tp1;

import java.util.ArrayList;

public class ProductoQuimico {
	private String nombre;
	private ArrayList<Cultivo>cultivosDesaconsejados;
	private ArrayList<String> patologiasTratadas;
	public ProductoQuimico(String nombre){
		this.nombre = nombre;
		cultivosDesaconsejados = new ArrayList<Cultivo>();
		patologiasTratadas = new ArrayList<String>();
	}
	@Override
	public boolean equals(Object o){
		try{
			ProductoQuimico aux = (ProductoQuimico)o;
			return this.nombre.equalsIgnoreCase(aux.getNombre());
		}
		catch(Exception e){
			return false;
		}
	}
	public boolean trataEnfermedad(Enfermedad e){
		int index = 0;
		for(String s: patologiasTratadas){
			if(e.existePagologia(s)){
				index++;
			}
		}
		return index == patologiasTratadas.size();
	}
	public boolean existeCultivoDesaconsejado(Cultivo c){
		return cultivosDesaconsejados.contains(c);
	}
	public void addPatologiaTratada(String p){
		if(!patologiasTratadas.contains(p)){
			patologiasTratadas.add(p);
		}
	}
	public void addCultivo(Cultivo c){
		if(!existeCultivoDesaconsejado(c)){
			cultivosDesaconsejados.add(c);
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
