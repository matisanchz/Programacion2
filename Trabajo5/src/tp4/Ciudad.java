package tp4;

import java.util.ArrayList;

public class Ciudad {
	private String nombre;
	private int habitantes;
	private int gastos;
	private ArrayList <Contribuyente> contribuyentes;
	public Ciudad(String nombre, int habitantes, int gastos) {
		super();
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.gastos = gastos;
		contribuyentes = new ArrayList<Contribuyente>();
	}
	
	public boolean esDeficitaria(){
		return(obtCantGastos()<obtCantIngresos());
	}
	
	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", habitantes=" + habitantes
				+ ", gastos=" + gastos + ", contribuyentes=" + contribuyentes
				+ "]";
	}
	
	@Override
	public boolean equals(Object o){
		Ciudad aux = (Ciudad)o;
		return (nombre.equalsIgnoreCase(aux.getNombre())&&
				habitantes==aux.getHabitantes());
	}

	public int obtCantIngresos(){
		int ingresos=0;
		for(int i=0; i<contribuyentes.size(); i++){
			ingresos+=contribuyentes.get(i).getIngresos();
		}
		return ingresos;
	}
	
	public int obtCantGastos(){
		return(getGastos());
	}
	
	public void addContribuyente(Contribuyente c1){
		if(!existeContribuyente(c1)){
			contribuyentes.add(c1);
		}
	}
	public void removeContribuyente(Contribuyente c1){
		contribuyentes.remove(c1);
	}
	public boolean existeContribuyente(Contribuyente c1){
		return contribuyentes.contains(c1);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	public int getGastos() {
		return gastos;
	}
	public void setGastos(int gastos) {
		this.gastos = gastos;
	}
}
