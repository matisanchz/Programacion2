package tp3.condiciones;

import tp3.Planta;

public class CondicionIncluyeNombre extends Condicion{
	private String nombre;
	public CondicionIncluyeNombre(String n){
		nombre = n;
	}
	@Override
	public boolean seCumple(Planta p) {
		return p.getNombre().contains(this.nombre);
	}

	
}
