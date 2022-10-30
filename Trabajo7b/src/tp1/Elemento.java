package tp1;

import java.time.LocalDate;

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
