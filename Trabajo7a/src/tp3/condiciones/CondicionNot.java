package tp3.condiciones;

import tp3.Planta;

public class CondicionNot extends Condicion{
	private Condicion c;
	public CondicionNot(Condicion c){
		this.c = c;
	}
	@Override
	public boolean seCumple(Planta p) {
		return !c.seCumple(p);
	}
	
}
