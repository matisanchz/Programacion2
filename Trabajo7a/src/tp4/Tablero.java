package tp4;

import java.util.ArrayList;

import tp4.condiciones.Condicion;

public class Tablero {
	private int puntajeMinimo;
	private ArrayList<Ficha> fichas;
	private double dificultad;
	public Tablero(int puntajeMinimo){
		this.puntajeMinimo = puntajeMinimo;
		fichas = new ArrayList<Ficha>();
	}
	
	public ArrayList<Ficha> buscarFichas(Condicion c){
		ArrayList<Ficha> res = new ArrayList<Ficha>();
		for(Ficha f:fichas){
			if(c.seCumple(f)){
				res.add(f);
			}
		}
		return res;
	}
	
	public void addFicha(Ficha f){
		if(!existeFicha(f)){
			fichas.add(f);
		}
	}
	public boolean existeFicha(Ficha f){
		return fichas.contains(f);
	}
	public int getPoderFichas(){
		int poder=0;
		for(Ficha f: fichas){
			poder+=f.getPoderDestruccion();
		}
		return poder;
	}
	public int getFortalezaFichas(){
		int fortaleza=0;
		for(Ficha f: fichas){
			fortaleza+=f.getFortaleza();
		}
		return fortaleza;
	}
	public int getPuntajeMinimo() {
		return puntajeMinimo;
	}
	public void setPuntajeMinimo(int puntajeMinimo) {
		this.puntajeMinimo = puntajeMinimo;
	}
	public void setDificultad() {
		dificultad = getFortalezaFichas()/getPoderFichas();
	}
	public double getDificultad() {
		return dificultad;
	}
	
}
