package tp4.condiciones;

import tp4.Ficha;

public class CondicionNot extends Condicion{
	private Condicion c1;
	public CondicionNot(Condicion c1){
		this.c1 = c1;
	}
	@Override
	public boolean seCumple(Ficha f) {
		return !c1.seCumple(f);
	}
	
}
