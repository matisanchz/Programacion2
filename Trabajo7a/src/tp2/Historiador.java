package tp2;

import java.util.ArrayList;

import tp2.filtros.Filtro;

public class Historiador {
	private ArrayList<Documento> documentos;
	public Historiador(){
		documentos = new ArrayList<Documento>();
	}
	
	public ArrayList<Documento> buscar(Filtro f){
		ArrayList<Documento> res = new ArrayList<Documento>();
		for(Documento d: documentos){
			if(f.seCumple(d)){
				res.add(d);
			}
		}
		return res;
	}
	
	
	
	public void addDocumento(Documento d){
		if(!documentos.contains(d)){
			documentos.add(d);
		}
	}
}
