package tp4;

public abstract class Ficha {
	private String nombre;
	private int fortaleza;
	private int espacio;
	public Ficha(String nombre, int fortaleza, int espacio) {
		this.nombre = nombre;
		this.fortaleza = fortaleza;
		this.espacio = espacio;
	}
	@Override
	public boolean equals(Object o){
		try{
			Ficha aux = (Ficha)o;
			return this.nombre.equals(aux.getNombre());
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
	}
	public int getFortaleza() {
		return fortaleza;
	}
	public void setFortaleza(int fortaleza) {
		this.fortaleza = fortaleza;
	}
	public int getEspacio() {
		return espacio;
	}
	public void setEspacio(int espacio) {
		this.espacio = espacio;
	}
	public abstract double getPoderDestruccion();
	
}
