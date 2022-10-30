package tp5.condiciones;

import tp5.Pelicula;

public class CondicionDuracionMenor extends Condicion{
	private int duracion;
	public CondicionDuracionMenor(int duracion){
		this.duracion = duracion;
	}
	@Override
	public boolean seCumple(Pelicula p) {
		return p.getDuracion()<this.duracion;
	}
}
