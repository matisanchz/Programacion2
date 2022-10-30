package tp3;

import java.util.ArrayList;

public class Grupo extends Elemento{	
	private ArrayList<Elemento> elementos;
	public Grupo(int id){
		super(id);
		elementos = new ArrayList<Elemento>();
	}
	
	@Override
	public int cantCartasDetRegalo(String s) {
		int cant = 0;
		for(Elemento e: elementos){
			cant+= e.cantCartasDetRegalo(s);
		}
		return cant;
	}
	
	@Override
	public int cantCartasNiniosMalos() {
		int cant=0;
		for(Elemento e: elementos){
			cant += e.cantCartasNiniosMalos();
		}
		return cant;
	}
	
	@Override
	public int cantCartas() {
		int cant = 0;
		for(Elemento e : elementos){
			cant += e.cantCartas();
		}
		return cant;
	}
	
	
	
	public void addElemento(Elemento e){
		if(!elementos.contains(e)){
			elementos.add(e);
		}
	}



	
	
	
	
	
}
