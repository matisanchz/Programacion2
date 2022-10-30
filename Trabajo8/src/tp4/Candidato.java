package tp4;

public class Candidato implements Comparable<Candidato>{
	private String nombre;
	private String partido;
	private String agrupacion;
	public Candidato(String nombre, String partido, String agrupacion) {
		super();
		this.nombre = nombre;
		this.partido = partido;
		this.agrupacion = agrupacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public String getAgrupacion() {
		return agrupacion;
	}
	public void setAgrupacion(String agrupacion) {
		this.agrupacion = agrupacion;
	}
	@Override
	public boolean equals(Object o){
		try{
			Candidato aux = (Candidato) o;
			return this.getNombre().equals(aux.getNombre());
		}
		catch(Exception e){
			return false;
		}
	}
	@Override
	public int compareTo(Candidato c) {
		int res1 = this.getPartido().compareTo(c.getPartido());
		if(res1 == 0){
			int res2 = this.getAgrupacion().compareTo(c.getAgrupacion());
			if(res2 == 0){
				return this.getNombre().compareTo(c.getNombre());
			}
			return res2;
		}
		return res1;
	}
	
}
