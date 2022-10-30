package tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import tp2.condiciones.Condicion;

public class ArchivoComprimido extends Directorio{
	private double tasaCompresion;
	public ArchivoComprimido(String nombre, double tasaCompresion){
		super(nombre);
		this.tasaCompresion=tasaCompresion;
	}
	@Override
	public ArrayList<Elemento> buscar(Condicion c, Comparator<Elemento> orden){
		ArrayList<Elemento> res = new ArrayList<Elemento>();
		for(Elemento e: elementos){
			if(c.seCumple(e)){
				res.add(this);
				return res;
			}
		}
		Collections.sort(res, orden); //No hace falta ordenarlo si los ordeno en el root directorio
		return res;
	}
	@Override
	public double getTamanio() {
		return super.getTamanio()*tasaCompresion;
	}
	public double getTasaCompresion() {
		return tasaCompresion;
	}
	public void setTasaCompresion(double tasaCompresion) {
		this.tasaCompresion = tasaCompresion;
		this.setFechaModificacion(LocalDate.now());
	}
	
	
}
