package tp3;

import java.time.LocalDate;

public class Barco implements ElementoOrdenable{
	private int id;
	private LocalDate fecha_carga;

	public Barco(int id, LocalDate fecha_carga) {
		super();
		this.fecha_carga = fecha_carga;
		this.id= id;
	}
	
	public boolean esMayor(ElementoOrdenable otro){
		try{
			return this.fecha_carga.isBefore(((Barco)otro).getFecha_carga());
		}
		catch(Exception exc){
			return false;
		}
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFecha_carga() {
		return fecha_carga;
	}

	public void setFecha_carga(LocalDate fecha_carga) {
		this.fecha_carga = fecha_carga;
	}
	
	
}
