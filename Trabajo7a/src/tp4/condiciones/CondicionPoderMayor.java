package tp4.condiciones;

import tp4.Ficha;

public class CondicionPoderMayor extends Condicion{
	private double poder;
	public CondicionPoderMayor(double poder){
		this.poder = poder;
	}
	@Override
	public boolean seCumple(Ficha f) {
		return f.getPoderDestruccion()>this.poder;
	}
	
}