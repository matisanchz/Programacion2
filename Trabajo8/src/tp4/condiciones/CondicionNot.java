package tp4.condiciones;

import tp4.Voto;

public class CondicionNot extends Condicion{
	private Condicion c;
	public CondicionNot(Condicion c){
		this.c=c;
	}
	@Override
	public boolean seCumple(Voto v) {
		return !this.c.seCumple(v);
	}
	
}
