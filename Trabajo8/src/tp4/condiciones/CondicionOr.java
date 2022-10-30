package tp4.condiciones;

import tp4.Voto;

public class CondicionOr extends Condicion{
	private Condicion c1;
	private Condicion c2;
	public CondicionOr(Condicion c1, Condicion c2){
		this.c1=c1;
		this.c2=c2;
	}
	@Override
	public boolean seCumple(Voto v) {
		return this.c1.seCumple(v)||this.c2.seCumple(v);
	}
}
