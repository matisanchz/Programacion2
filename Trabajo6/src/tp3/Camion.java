package tp3;

public class Camion implements ElementoOrdenable{
	private int patente;
	private double capacidad;
	public Camion(int patente, double capacidad) {
		super();
		this.capacidad = capacidad;
		this.patente = patente;
	}
	public boolean esMayor(ElementoOrdenable otro){
		try{
			return this.capacidad>((Camion)otro).getCapacidad();
		}
		catch(Exception exc){
			return false;
		}
	}
	
	
	
	public int getPatente() {
		return patente;
	}
	public void setPatente(int patente) {
		this.patente = patente;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
}
