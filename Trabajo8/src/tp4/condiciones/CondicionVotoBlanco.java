package tp4.condiciones;

import tp4.Voto;

public class CondicionVotoBlanco extends Condicion{

	@Override
	public boolean seCumple(Voto v) {
		return v.getCandidato()==null;
	}
	
}
