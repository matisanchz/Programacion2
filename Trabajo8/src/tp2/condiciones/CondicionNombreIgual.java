package tp2.condiciones;

import tp2.Elemento;

public class CondicionNombreIgual extends Condicion{
	private String nombre;

	public CondicionNombreIgual(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean seCumple(Elemento e) {
		return e.getNombre().equals(this.nombre);
	}
	
}
