package tp3.condiciones;

import tp3.Planta;

public class CondicionApodo extends Condicion{
	private String nombre;
	public CondicionApodo(String n){
		nombre = n;
	}
	@Override
	public boolean seCumple(Planta p) {
		return p.tieneNombre(this.nombre);
	}
}
