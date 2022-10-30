package tp1;

public class Pelicula extends Articulo {
	private String nombre;
	private String informacion;
	private int copias;
	public Pelicula(String nombre, String informacion, int copias) {
		super();
		this.nombre = nombre;
		this.informacion = informacion;
		this.copias = copias;
	}
	
	@Override
	public void alquilar() {
		if(puedeSerAlquilado()){
			setCopias(getCopias()-1);
		}
	}
	
	@Override
	public void devolver() {
		setCopias(getCopias()+1);
	}
	
	@Override
	public boolean puedeSerAlquilado() {
		return this.getCopias()>0;
	}
	
	@Override
	public boolean equals(Object o){
		try{
			Pelicula aux = (Pelicula) o;
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
	}
	public String getInformacion() {
		return informacion;
	}
	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
	public int getCopias() {
		return copias;
	}
	public void setCopias(int copias) {
		this.copias = copias;
	}






	
}
