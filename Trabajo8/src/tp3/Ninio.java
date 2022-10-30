package tp3;

import java.util.ArrayList;

public class Ninio {
	private int dni;
	private Carta carta;
	public Ninio(int dni){
		this.dni = dni;
	}
	
	//No hacen falta estos dos metodos
	public void hacerCarta(){
		carta = new Carta (this);
	}
	public void agregarRegalo(String s){
		if(carta!=null){
			carta.agregarRegalo(s);
		}
	}
	public void depositarCarta(Buzon b){
		if(carta!=null&&carta.tieneRegalos()){
			b.addCarta(this.carta);
			this.carta = null; //una vez depositada, no la tengo mas
		}
	}
	
	@Override
	public boolean equals(Object o){
		try{
			Ninio aux = (Ninio) o;
			return this.getDni()==aux.getDni();
		}
		catch(Exception e){
			return false;
		}
	}

	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public Carta getCarta() {
		return carta;
	}
	
	
	
}
