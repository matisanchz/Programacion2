package tp3;

import java.util.ArrayList;

import tp3.condiciones.Condicion;

public class Vivero {
	private ArrayList<Planta> plantas;
	public Vivero(){
		plantas = new ArrayList<Planta>();
	}
	
	public ArrayList<Planta> buscarPlantas(Condicion c){
		ArrayList<Planta> res = new ArrayList<Planta>();
		for(Planta p:plantas){
			if(c.seCumple(p)){
				res.add(p);
			}
		}
		return res;
	}
	
	public void addPlanta(Planta p){
		if(!existePlanta(p)){
			plantas.add(p);
		}
	}
	public boolean existePlanta(Planta p){
		return plantas.contains(p);
	}
}
