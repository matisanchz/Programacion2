package tp3.condiciones;

import tp3.Planta;

public class CondicionRiegoSuperior extends Condicion{
	private int riego;
	public CondicionRiegoSuperior(int r){
		riego = r;
	}
	@Override
	public boolean seCumple(Planta p) {
		return p.getReqRiego()>this.riego;
	}
}
