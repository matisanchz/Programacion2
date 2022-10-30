package tp4.condiciones;

import tp4.Ficha;

public class CondicionOr extends Condicion{
	private Condicion c1;
	private Condicion c2;
	public CondicionOr(Condicion c1, Condicion c2){
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public boolean seCumple(Ficha f) {
		return c1.seCumple(f)||c2.seCumple(f);
	}
}
