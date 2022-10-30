package tp3.condiciones;

import tp3.Planta;

public class CondicionAnd extends Condicion{
	private Condicion c1;
	private Condicion c2;
	
	public CondicionAnd(Condicion c1, Condicion c2){
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public boolean seCumple(Planta p) {
		return c1.seCumple(p)&&c2.seCumple(p);
	}
}
