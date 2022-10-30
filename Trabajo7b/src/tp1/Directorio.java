package tp1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends Elemento{
	private ArrayList<Elemento> elementos;
	public Directorio(String nombre) {
		super(nombre);
	}

	@Override
	public int getCantidad() {
		int cantidad = 1;
		for(Elemento e: elementos){
			cantidad += e.getCantidad();
		}
		return cantidad;
	}

	@Override
	public double getTamanio() {
		int tam = 0;
		for(Elemento e: elementos){
			tam += e.getTamanio();
		}
		return tam;
	}
	
	public void addElemento(Elemento e){
		if(!existeElemento(e)){
			elementos.add(e);
			this.setFechaModificacion(LocalDate.now());
		}
	}
	
	public void removeElemento(Elemento e){
		elementos.remove(e);
	}

	private boolean existeElemento(Elemento e) {
		return elementos.contains(e);
	}
		
}
