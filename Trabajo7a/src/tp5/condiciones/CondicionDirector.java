package tp5.condiciones;

import tp5.Pelicula;

public class CondicionDirector extends Condicion{
	private String director;
	public CondicionDirector(String director){
		this.director = director;
	}
	@Override
	public boolean seCumple(Pelicula p) {
		return p.getDirector().equals(this.director);
	}
}
