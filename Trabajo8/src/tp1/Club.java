package tp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import tp1.comparadores.ComparadorAnd;
import tp1.comparadores.ComparadorApellidoNombre;
import tp1.comparadores.ComparadorCuotaPaga;
import tp1.comparadores.ComparadorEdad;
import tp1.comparadores.ComparadorNot;
import tp1.condiciones.Condicion;
import tp1.condiciones.CondicionCuotaImpaga;
import tp1.condiciones.CondicionMinoriaEdad;

public class Club {
	private ArrayList<Socio>socios;

	public Club() {
		socios = new ArrayList<Socio>();
	}
	
	public ArrayList<Socio> buscarSocios(Condicion c, Comparator<Socio> orden){
		ArrayList<Socio> res = new ArrayList<Socio>();
		for(Socio s:socios){
			if(c.seCumple(s)){
				res.add(s);
			}
		}
		Collections.sort(res, orden);
		return res;
	}
	
	
	
	public void addSocio(Socio s){
		if(!existeSocio(s)){
			socios.add(s);
		}
	}
	public void removeSocio(Socio s){
		socios.remove(s);
	}
	public boolean existeSocio(Socio s){
		return socios.contains(s);
	}
	
	public static void main(String []args){
		Socio s1 = new Socio("Juan", "Perez", 20, false);
		Socio s2 = new Socio("Luis", "Fernando", 20, false);
		Socio s3 = new Socio("Domingo", "Gonzalez", 13, false);
		Socio s4 = new Socio("Pedro", "Gonzalez", 13, false);
		Socio s5= new Socio("Fernando", "Alvarez", 92, false);
		Socio s6 = new Socio("Luisa", "Asd", 92, false);
		
		Club c = new Club();
		c.addSocio(s1);
		c.addSocio(s2);
		c.addSocio(s3);
		c.addSocio(s4);
		c.addSocio(s5);
		c.addSocio(s6);
		
		Condicion c1 = new CondicionMinoriaEdad();
		Condicion c2 = new CondicionCuotaImpaga();
		Comparator<Socio> comp1 = new ComparadorEdad();
		Comparator<Socio> comp2 = new ComparadorApellidoNombre();
		Comparator<Socio> comp3 = new ComparadorAnd(comp1, comp2);
		Comparator<Socio> comp4 = new ComparadorNot(comp2);
		System.out.println(c.buscarSocios(c2, comp2));
		System.out.println(c.buscarSocios(c2, comp4));
		
	}
	
}
