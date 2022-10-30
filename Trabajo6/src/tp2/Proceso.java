package tp2;

public class Proceso extends ElementoOrdenable {
	private String nombre;
	private double requerimiento_memoria;
	public Proceso(String nombre, double requerimiento_memoria) {
		super();
		this.nombre = nombre;
		this.requerimiento_memoria = requerimiento_memoria;
	}
	
	@Override
	public boolean esMayor(ElementoOrdenable o){
		return (this.getRequerimiento_memoria()>((Proceso)o).getRequerimiento_memoria());
	}
	
	@Override
    public String toString() {
        return "Proceso{" +
                "nombre='" + nombre + '\'' +
                ", reqMemoria=" + requerimiento_memoria +
                '}';
    }
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getRequerimiento_memoria() {
		return requerimiento_memoria;
	}
	public void setRequerimiento_memoria(double requerimiento_memoria) {
		this.requerimiento_memoria = requerimiento_memoria;
	}
	
	
}
