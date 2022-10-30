package tp1;

import java.time.LocalDate;

public class Alquiler {
	private Articulo item;
	private int factura;
	private Cliente cliente;
	private LocalDate fechaEntrega;
	private LocalDate fechaFinalizacion;
	public Alquiler(Articulo item, Cliente cliente, LocalDate fechaEntrega,
			LocalDate fechaFinalizacion, int factura) {
		super();
		this.item = item;
		this.cliente = cliente;
		this.fechaEntrega = fechaEntrega;
		this.fechaFinalizacion = fechaFinalizacion;
		this.factura = factura;
	}
	@Override
	public boolean equals(Object o){
		try{
			Alquiler aux = (Alquiler) o;
			return this.getFactura()==(aux.getFactura());
		}
		catch(Exception e){
			return false;
		}
	}
	public int getFactura() {
		return factura;
	}

	public void setFactura(int factura) {
		this.factura = factura;
	}

	public Articulo getItem() {
		return item;
	}
	public void setItem(Articulo item) {
		this.item = item;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public LocalDate getFechaFinalizacion() {
		return fechaFinalizacion;
	}
	public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}
	
}
