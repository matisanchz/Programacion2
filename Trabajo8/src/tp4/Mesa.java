package tp4;

import java.util.ArrayList;
import java.util.Collections;

import tp4.condiciones.Condicion;

public class Mesa extends Elemento{
	private ArrayList<Integer>padron;
	private ArrayList<Voto> votos;
	public Mesa(String loc) {
		super(loc);
		padron= new ArrayList<Integer>();
		votos = new ArrayList<Voto>();
	}
	
	@Override
	public int cantVotosCondicion(Condicion c) {
		int cant = 0;
		for(Voto v:votos){
			if(c.seCumple(v)){
				cant++;
			}
		}
		return cant;
	}

	@Override
	public int cantTotalVotos() {
		return votos.size();
	}
	
	@Override
	public ArrayList<Candidato> candidatosPresentan() {
		ArrayList<Candidato> res = new ArrayList<Candidato>();
		for(Voto v: votos){
			Candidato aux = v.getCandidato();
			if(aux!=null){
				res.add(aux);
			}
		}
		Collections.sort(res);
		return res;
	}
	
	public void addPadron(int dni){
		if(!existeDni(dni)){
			padron.add(dni);
		}
	}
	
	public boolean existeDni(int dni){
		return padron.contains(dni);
	}
	
	public void addVoto(Voto v){
		if(!existeVoto(v)){
			if(this.existeDni(v.getDni())){
				votos.add(v);
			}
		}
	}
	
	public boolean existeVoto(Voto v){
		return votos.contains(v);
	}



	
	
}
