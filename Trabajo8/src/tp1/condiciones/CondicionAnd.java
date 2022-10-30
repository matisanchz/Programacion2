package tp1.condiciones;

import tp1.Socio;

public class CondicionAnd extends Condicion{
	private Condicion c1;
	private Condicion c2;
	public CondicionAnd(Condicion c1, Condicion c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public boolean seCumple(Socio s) {
		return c1.seCumple(s)&&c2.seCumple(s);
	}
	
}
