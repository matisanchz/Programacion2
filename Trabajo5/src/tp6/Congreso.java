package tp6;

import java.util.ArrayList;

public class Congreso {
	private ArrayList<Evaluador> evaluadores;
	private ArrayList<Trabajo> trabajos;
	private ArrayList<String> temasGenerales;
	private ArrayList<String> temasExperto;
	
	public Congreso(){
		evaluadores = new ArrayList<Evaluador> ();
		trabajos = new ArrayList<Trabajo> ();
		temasGenerales = new ArrayList <String> ();
		temasExperto = new ArrayList <String> ();
	}
	
	//Punto 4
	public String tipoEvaluador(Evaluador e){
		for(int i=0; i<temasGenerales.size(); i++){
			if(e.existeTema(temasGenerales.get(i))){
				return "General";
			}
		}
		for(int i=0; i<temasExperto.size(); i++){
			if(e.existeTema(temasExperto.get(i))){
				return "Experto";
			}
		}
		return "Ningun tipo";
	}
	
	//Punto 3
	public ArrayList<Trabajo> trabajosTieneAsignado(Evaluador e){
		return e.getTrabajos();
	}
	
	//Punto 2
	public ArrayList<Trabajo> trabajosPuedenAsignarse(Evaluador e){
		ArrayList<Trabajo> trabajosPuedenAsignarse = new ArrayList<Trabajo>();
		for(int i=0; i<trabajos.size(); i++){
			if(trabajos.get(i).puedeSerEvaluado(e)){
				trabajosPuedenAsignarse.add(trabajos.get(i));
			}
		}
		return trabajosPuedenAsignarse;
	}
	
	//Punto 1
	public ArrayList<Evaluador> evaluadoresAptos(Trabajo t){
		ArrayList<Evaluador> evaluadoresAptos = new ArrayList<Evaluador>();
		for(int i=0; i<evaluadores.size(); i++){
			if(evaluadores.get(i).esApto(t)){
				evaluadoresAptos.add(evaluadores.get(i));
			}
		}
		return evaluadoresAptos;
	}
	
	public void addTrabajo(Trabajo t){
		if(!existeTrabajo(t)){
			trabajos.add(t);
		}
	}
	
	public void removeTrabajo(Trabajo t){
		trabajos.remove(t);
	}
	
	public boolean existeTrabajo(Trabajo t){
		return trabajos.contains(t);
	}
	
	public void addEvaluador(Evaluador e){
		if(!existeEvaluador(e)){
			evaluadores.add(e);
		}
	}
	
	public void removeEvaluador(Evaluador e){
		evaluadores.remove(e);
	}
	
	public boolean existeEvaluador(Evaluador e){
		return evaluadores.contains(e);
	}
	
	public void addTemaGeneral(String t){
		if(!existeTemaExperto(t)){
			temasGenerales.add(t);
		}
	}
	
	public void removeTemaGeneral(String t){
		temasGenerales.remove(t);
	}
	
	public boolean existeTemaGeneral(String t){
		return temasGenerales.contains(t);
	}
	
	public void addTemaExperto(String t){
		if(!existeTemaExperto(t)){
			temasExperto.add(t);
		}
	}
	
	public void removeTemaExperto(String t){
		temasExperto.remove(t);
	}
	
	public boolean existeTemaExperto(String t){
		return temasExperto.contains(t);
	}
}
