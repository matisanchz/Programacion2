package tp5.condiciones;

import tp5.Pelicula;

public class CondicionTituloContiene extends Condicion{
	private String substring;
	public CondicionTituloContiene(String substring){
		this.substring = substring;
	}
	@Override
	public boolean seCumple(Pelicula p) {
		return p.getTitulo().contains(this.substring);
	}
	
}
