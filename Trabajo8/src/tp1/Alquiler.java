package tp1;

import java.time.LocalDate;

public class Alquiler {
	private LocalDate fecha;
	private int id;
	private double precio;
	public Alquiler(LocalDate fecha, int id, double precio) {
		super();
		this.fecha = fecha;
		this.id = id;
		this.precio = precio;
	}
	@Override
	public boolean equals(Object o){
		try{
			Alquiler aux = (Alquiler)o;
			return this.fecha.equals(aux.getFecha())&&
					this.id == aux.getId();
		}
		catch(Exception e){
			return false;
		}
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
