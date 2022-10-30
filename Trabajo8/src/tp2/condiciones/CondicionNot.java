package tp2.condiciones;

import tp2.Elemento;

public class CondicionNot extends Condicion{
	private Condicion c1;
	public CondicionNot(Condicion c1) {
		this.c1 = c1;
	}
	@Override
	public boolean seCumple(Elemento e) {
		return !c1.seCumple(e);
	}
}
