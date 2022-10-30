package tp1;

import java.util.ArrayList;

public class Cultivo {
	private String nombre;
	private ArrayList<Enfermedad>enfermedadesFrecuentes;
	public Cultivo(String nombre) {
		this.nombre = nombre;
		enfermedadesFrecuentes=new ArrayList<Enfermedad>();
	}
	
	public boolean sirveProducto(ProductoQuimico p){
		return p.existeCultivoDesaconsejado(this)&&this.trataAlgunaEnfermedad(p);
	}
	
	public boolean trataAlgunaEnfermedad(ProductoQuimico p){
		for(int i = 0; i<enfermedadesFrecuentes.size(); i++){
			if(p.trataEnfermedad(enfermedadesFrecuentes.get(i))){
				return true;
			}
		}
		return false;
	}
	
	public void addEnfermedadFrecuente(Enfermedad e){
		if(!enfermedadesFrecuentes.contains(e)){
			enfermedadesFrecuentes.add(e);
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
}
