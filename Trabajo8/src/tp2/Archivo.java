package tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import tp2.condiciones.Condicion;

public class Archivo extends Elemento{
	private double tamanio;
	public Archivo(String nombre, double tamanio){
		super(nombre);
		this.tamanio = tamanio;
	}
	@Override
	public ArrayList<Elemento> buscar(Condicion c, Comparator<Elemento> orden){
		ArrayList<Elemento> res = new ArrayList<Elemento>();
		if(c.seCumple(this)){
			res.add(this);
		}
		Collections.sort(res, orden); //No hace falta ordenarlo si los ordeno en el root directorio
		return res;
	}
	@Override
	public int getCantidad() {
		return 1;
	}
	@Override
	public double getTamanio() {
		return tamanio;
	}
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
		this.setFechaModificacion(LocalDate.now());
	}
	
	
}
