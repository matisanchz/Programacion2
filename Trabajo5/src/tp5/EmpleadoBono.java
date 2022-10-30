package tp5;

public class EmpleadoBono extends Empleado{
	private int cantidad_ventas;
	private double bono;
	private int cantidad;
	public EmpleadoBono(String nombre, String apellido, long dni,
			double sueldo, int cantidad_ventas, double bono, int cantidad) {
		super(nombre, apellido, dni, sueldo);
		this.cantidad_ventas = cantidad_ventas;
		this.bono = bono;
		this.cantidad = cantidad;
	}
	public double totalSueldo(){
		if(cumpleCantVentas()){
			return super.totalSueldo()+this.bono;
		}
		else{
			return super.totalSueldo();
		}
	}
	
	public boolean cumpleCantVentas(){
		return cantidad_ventas>=cantidad;
	}
}
