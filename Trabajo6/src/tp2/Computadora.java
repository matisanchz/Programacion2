package tp2;

public class Computadora extends ElementoOrdenable{
	private int id;
	private double velocidad_procesamiento;
	public Computadora(int id, double velocidad_procesamiento) {
		super();
		this.id = id;
		this.velocidad_procesamiento = velocidad_procesamiento;
	}
	@Override
	public boolean esMayor(ElementoOrdenable o){
		return (this.getVelocidad_procesamiento()>((Computadora)o).getVelocidad_procesamiento());
	}
	public void ejecutarProceso(Proceso p){
        //el proceso se ejecuta
        System.out.println("Ejecutando "+p);
    }
	@Override
    public String toString() {
        return "Computadora{" +
                "nombre='" + id + '\'' +
                ", velocidad=" + velocidad_procesamiento +
                '}';
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getVelocidad_procesamiento() {
		return velocidad_procesamiento;
	}
	public void setVelocidad_procesamiento(double velocidad_procesamiento) {
		this.velocidad_procesamiento = velocidad_procesamiento;
	}
	
}
