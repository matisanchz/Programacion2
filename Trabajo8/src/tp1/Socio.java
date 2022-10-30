package tp1;

import java.util.ArrayList;

public class Socio /*implements Comparable<Socio>*/{
	private String nombre;
	private String apellido;
	private int edad;
	private boolean ultimaCuotaPaga;
	private ArrayList<Alquiler> alquileres;
	public Socio(String nombre, String apellido, int edad, boolean ultimaCuotaPaga) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ultimaCuotaPaga = ultimaCuotaPaga;
		alquileres = new ArrayList <Alquiler>();
	}
	/*
	@Override
	public int compareTo(Socio s) {
		int res = this.getApellido().compareTo(s.getApellido());
        if (res == 0)
            return this.getNombre().compareTo(s.getNombre());
        return res;
	}
	*/
	public int cantCanchasId(int id){
		int cant = 0;
		for(Alquiler a:alquileres){
			if(a.getId()==id){
				cant++;
			}
		}
		return cant;
	}
	public boolean alquiloCancha(int id){
		for(Alquiler a: alquileres){
			if(a.getId()==id){
				return true;
			}
		}
		return false;
	}
	public boolean pagoMas(double precio){
		for(Alquiler a:alquileres){
			if(a.getPrecio()>precio){
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean equals(Object o){
		try{
			Socio aux = (Socio)o;
			return this.apellido.equalsIgnoreCase(aux.getApellido())&&
					this.nombre.equalsIgnoreCase(aux.getNombre());
		}
		catch(Exception e){
			return false;
		}
	}
	@Override
	public String toString(){
		return this.getNombre()+" "+this.getApellido();
	}
	public void addAlquiler(Alquiler a){
		if(!existeAlquiler(a)){
			alquileres.add(a);
		}
	}
	public boolean existeAlquiler(Alquiler a){
		return alquileres.contains(a);
	}
	public void removeAlquiler(Alquiler a){
		alquileres.remove(a);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isUltimaCuotaPaga() {
		return ultimaCuotaPaga;
	}
	public void setUltimaCuotaPaga(boolean ultimaCuotaPaga) {
		this.ultimaCuotaPaga = ultimaCuotaPaga;
	}
	
	
}
