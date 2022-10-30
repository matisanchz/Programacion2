package tp3.condiciones;

import tp3.Planta;

public class CondicionSolInferior extends Condicion{
	private int sol;
	public CondicionSolInferior(int s){
		sol = s;
	}
	@Override
	public boolean seCumple(Planta p) {
		return p.getReqSol()>this.sol;
	}
}
