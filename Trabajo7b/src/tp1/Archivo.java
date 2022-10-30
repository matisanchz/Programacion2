package tp1;

import java.time.LocalDate;

public class Archivo extends Elemento{
	private double tamanio;
	public Archivo(String nombre, double tamanio){
		super(nombre);
		this.tamanio = tamanio;
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
