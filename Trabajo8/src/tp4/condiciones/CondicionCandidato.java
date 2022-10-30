package tp4.condiciones;

import tp4.Candidato;
import tp4.Voto;

public class CondicionCandidato extends Condicion{
	private String candidato;
	public CondicionCandidato(String cand){
		candidato = cand;
	}
	@Override
	public boolean seCumple(Voto v) {
		Candidato aux = v.getCandidato();
		if(aux != null){
			return aux.getNombre().equals(this.candidato);
		}
		return false;
	}
}
