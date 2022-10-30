package tp5.condiciones;

import tp5.Pelicula;

public class CondicionContieneActor extends Condicion{
	private String actor;
	public CondicionContieneActor(String actor){
		this.actor = actor;
	}
	@Override
	public boolean seCumple(Pelicula p) {
		return p.existeActor(this.actor);
	}
	
}
