package tp5.condiciones;

import tp5.Pelicula;

public class CondicionContieneGenero extends Condicion{
	private String genero;
	public CondicionContieneGenero(String genero){
		this.genero = genero;
	}
	@Override
	public boolean seCumple(Pelicula p) {
		return p.existeGenero(this.genero);
	}
}
