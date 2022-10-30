package tp2;

public class PaqueteSimple extends Servicio{
	private String destinatario;
	private String direccionDestinatario;
	private String remitente;
	private String direccionRemitente;
	private boolean seRetira;
	private double peso;
	public PaqueteSimple(String destinatario, String direccionDestinatario, String remitente, String direccionRemitente, int tracking, boolean seRetira, double peso) {
		super(tracking);
		this.destinatario = destinatario;
		this.direccionDestinatario = direccionDestinatario;
		this.remitente = remitente;
		this.direccionRemitente = direccionRemitente;
		this.seRetira = seRetira;
		this.peso = peso;
	}
	@Override
	public String getDireccionDestinatario() {
		return direccionDestinatario;
	}
	@Override
	public String getDireccionRemitente() {
		return direccionRemitente;
	}
	@Override
	public String getDestinatario() {
		return destinatario;
	}
	@Override
	public String getRemitente() {
		return remitente;
	}
	@Override
	public double getPeso() {
		return peso;
	}
	public boolean isSeRetira() {
		return seRetira;
	}
	public void setSeRetira(boolean seRetira) {
		this.seRetira = seRetira;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public void setDireccionDestinatario(String direccionDestinatario) {
		this.direccionDestinatario = direccionDestinatario;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public void setDireccionRemitente(String direccionRemitente) {
		this.direccionRemitente = direccionRemitente;
	}
	
	
	
	
}
