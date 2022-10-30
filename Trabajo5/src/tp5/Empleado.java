package tp5;

public class Empleado {
	private String nombre;
	private String apellido;
	private long dni;
	private double sueldo;
	
	public Empleado(String nombre, String apellido, long dni, double sueldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldo = sueldo;
	}
	
	public double totalSueldo(){
		return this.sueldo;
	}
	
	public boolean equals(Object o){
		Empleado aux = (Empleado) o;
		return (this.dni==aux.getDni());
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
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
}
