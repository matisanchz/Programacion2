package tp1.condiciones;

import tp1.Socio;

public class CondicionNot extends Condicion{
	private Condicion c;

	public CondicionNot(Condicion c) {
		super();
		this.c = c;
	}

	@Override
	public boolean seCumple(Socio s) {
		return !c.seCumple(s);
	}
	
}
