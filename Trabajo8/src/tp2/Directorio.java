package tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import tp2.condiciones.Condicion;

public class Directorio extends Elemento{
	protected ArrayList<Elemento> elementos;
	public Directorio(String nombre) {
		super(nombre);
	}
	
	@Override
	public ArrayList<Elemento> buscar(Condicion c, Comparator<Elemento> orden){
		ArrayList<Elemento> res = new ArrayList<Elemento>();
		for(Elemento e: elementos){
			if(c.seCumple(e)){
				res.addAll(e.buscar(c, orden));
			}
		}
		Collections.sort(res, orden);
		return res;
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
