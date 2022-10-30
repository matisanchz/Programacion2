package tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import tp2.condiciones.Condicion;

public class Link extends Elemento{
	private static final String nombreInicio = "Link al elemento: ";
	private static final double tamanio = 1;
	private Elemento referencia;
	public Link(Elemento ref){
		super(nombreInicio+ref.getNombre());
		referencia = ref;
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
	public Elemento getReferencia() {
		return referencia;
	}
	public void setReferencia(Elemento referencia) {
		this.referencia = referencia;
		this.setFechaModificacion(LocalDate.now());
	}
}
