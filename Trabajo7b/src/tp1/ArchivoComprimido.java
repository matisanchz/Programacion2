package tp1;

import java.time.LocalDate;

public class ArchivoComprimido extends Directorio{
	private double tasaCompresion;
	public ArchivoComprimido(String nombre, double tasaCompresion){
		super(nombre);
		this.tasaCompresion=tasaCompresion;
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
