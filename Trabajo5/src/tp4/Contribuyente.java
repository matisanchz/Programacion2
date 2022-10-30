package tp4;

public class Contribuyente {
	private String nombre;
	private long CUIT;
	private int monto_fijo;
	public Contribuyente(String nombre, long CUIT, int monto_fijo){
		this.nombre=nombre;
		this.CUIT=CUIT;
		this.monto_fijo=monto_fijo;
	}
	public double getIngresos(){
		return getMonto_fijo();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getCUIT() {
		return CUIT;
	}
	public void setCUIT(long cUIT) {
		CUIT = cUIT;
	}
	public int getMonto_fijo() {
		return monto_fijo;
	}
	public void setMonto_fijo(int monto_fijo) {
		this.monto_fijo = monto_fijo;
	}
	
	
}
