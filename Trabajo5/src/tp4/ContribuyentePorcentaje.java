package tp4;

public class ContribuyentePorcentaje extends Contribuyente {
	private double porcentaje;
	private double porcentaje_vta;
	private double total_facturado;
	public ContribuyentePorcentaje(String nombre, long CUIT, int monto_fijo, double porcentaje, double porcentaje_vta, double total_facturado){
		super(nombre, CUIT, monto_fijo);
		this.porcentaje = porcentaje;
		this.porcentaje_vta = porcentaje_vta;
		this.total_facturado = total_facturado;
	}
	@Override
	public double getIngresos(){
		return (super.getIngresos()*porcentaje)+(this.total_facturado*this.porcentaje_vta);
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	public double getPorcentaje_vta() {
		return porcentaje_vta;
	}
	public void setPorcentaje_vta(double porcentaje_vta) {
		this.porcentaje_vta = porcentaje_vta;
	}
	public double getTotal_facturado() {
		return total_facturado;
	}
	public void setTotal_facturado(double total_facturado) {
		this.total_facturado = total_facturado;
	}
	
	
}
