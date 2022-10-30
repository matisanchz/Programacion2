package tp4;

import java.util.ArrayList;
import java.util.Collections;

import tp4.condiciones.Condicion;

public class Zona extends Elemento{
	private ArrayList<Elemento>elementos;

	public Zona(String loc) {
		super(loc);
		elementos = new ArrayList<Elemento>();
	}
	
	@Override
	public ArrayList<Candidato> candidatosPresentan() {
		ArrayList<Candidato> res = new ArrayList<Candidato>();
		for(Elemento e: elementos){
			res.addAll(e.candidatosPresentan());
		}
		Collections.sort(res);
		return res;
	}
	
	@Override
	public int cantVotosCondicion(Condicion c) {
		int cant = 0;
		for(Elemento e:elementos){
			cant+=e.cantVotosCondicion(c);
		}
		return cant;
	}

	@Override
	public int cantTotalVotos() {
		int cant = 0;
		for(Elemento e:elementos){
			cant+=e.cantTotalVotos();
		}
		return cant;
	}
	
	public void addElemento(Elemento e){
		if(!existeElemento(e)){
			elementos.add(e);
		}
	}
	public boolean existeElemento(Elemento e){
		return elementos.contains(e);
	}
	
}
