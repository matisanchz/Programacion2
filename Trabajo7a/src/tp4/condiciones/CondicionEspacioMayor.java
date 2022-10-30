package tp4.condiciones;

import tp4.Ficha;

public class CondicionEspacioMayor extends Condicion{
	private int espacio;
	public CondicionEspacioMayor(int espacio){
		this.espacio = espacio;
	}
	@Override
	public boolean seCumple(Ficha f) {
		return f.getEspacio()>this.espacio;
	}
	
}
