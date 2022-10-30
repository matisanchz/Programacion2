package tp5;

public class EmpleadoVenta extends Empleado {
	private double ventas;
	private double porcentaje;
	
	public EmpleadoVenta(String nombre, String apellido, long dni,
			double sueldo, double ventas, double porcentaje) {
		super(nombre, apellido, dni, sueldo);
		this.ventas = ventas;
		this.porcentaje = porcentaje;
	}
	
	public double totalSueldo(){
		return super.totalSueldo()+(this.ventas*this.porcentaje);
	}
	
}
