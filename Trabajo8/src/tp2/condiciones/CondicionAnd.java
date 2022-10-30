package tp2.condiciones;

import tp2.Elemento;

public class CondicionAnd extends Condicion{
	private Condicion c1;
	private Condicion c2;
	public CondicionAnd(Condicion c1, Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public boolean seCumple(Elemento e) {
		return c1.seCumple(e)&&c2.seCumple(e);
	}
	
}
