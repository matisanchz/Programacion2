package tp5.condiciones;

import tp5.Pelicula;

public class CondicionGrabadaAntes extends Condicion{
	private int anio;
	public CondicionGrabadaAntes(int anio){
		this.anio = anio;
	}
	@Override
	public boolean seCumple(Pelicula p) {
		return p.getAnio()<this.anio;
	}
	
}
