package tp2.condiciones;

import tp2.Elemento;

public class CondicionNombreContiene extends Condicion{
	private String substring;
	public CondicionNombreContiene(String substring){
		this.substring = substring;
	}
	@Override
	public boolean seCumple(Elemento e){
		return e.getNombre().contains(this.substring);
	}
}
