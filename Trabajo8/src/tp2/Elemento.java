package tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import tp2.condiciones.Condicion;

public abstract class Elemento {
	private String nombre;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	public Elemento(String nombre){
		this.nombre = nombre;
		this.fechaCreacion = LocalDate.now();
		this.fechaModificacion = LocalDate.now();
	}
	public abstract int getCantidad();
	public abstract double getTamanio();
	public abstract ArrayList<Elemento> buscar(Condicion c, Comparator<Elemento> c1);
	
	@Override
	public boolean equals(Object o){
		try{
			Elemento aux = (Elemento)o;
			return this.getNombre().equalsIgnoreCase(aux.getNombre());
		}
		catch(Exception e){
			return false;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		setFechaModificacion(LocalDate.now());
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	
	
}
