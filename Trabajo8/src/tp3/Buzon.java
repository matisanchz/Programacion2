package tp3;

import java.util.ArrayList;

public class Buzon extends Elemento{
	private static final String REGALOMALO="Trozo de carbon";
	private ArrayList<Ninio> niniosBuenos;
	private ArrayList<Carta> cartas;
	public Buzon(int id){
		super(id);
		niniosBuenos = new ArrayList<Ninio>();
	}
	
	@Override
	public int cantCartasDetRegalo(String s) {
		int cant = 0;
		for(Carta c: cartas){
			if(c.existeRegalo(s)){
				cant ++;
			}
		}
		return cant;
	}
	
	@Override
	public int cantCartasNiniosMalos() {
		int cant=0;
		for(Carta c: cartas){
			Ninio aux = c.getRemitente();
			if(esMalo(aux)){
				cant++;
			}
		}
		return cant;
	}
	@Override
	public int cantCartas() {
		return cartas.size();
	}
	
	public boolean esMalo(Ninio n){
		return !niniosBuenos.contains(n);
	}
	
	public void addNinio(Ninio n){
		if(!niniosBuenos.contains(n)){
			niniosBuenos.add(n);
		}
	}
	public void addCarta(Carta c){
		if(!cartas.contains(c)){
			Ninio aux = c.getRemitente();
			if(!niniosBuenos.contains(aux)){
				c.vaciarListaRegalos();
				c.agregarRegalo(REGALOMALO);
			}
			cartas.add(c);
		}
	}



	
}
