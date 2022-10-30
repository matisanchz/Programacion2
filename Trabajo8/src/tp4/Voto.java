package tp4;

import java.time.LocalDate;

public class Voto {
	private Integer dni;
	private Candidato candidato;
	private LocalDate hora;
	public Voto(Integer dni, Candidato cand){
		this(dni);
		candidato = cand;
	}
	public Voto(Integer dni){
		hora = LocalDate.now();
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	public LocalDate getHora() {
		return hora;
	}
	public void setHora(LocalDate hora) {
		this.hora = hora;
	}
	
	
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	@Override
	public boolean equals(Object o){
		try{
			Voto aux = (Voto) o;
			return this.getDni().equals(aux.getDni());
		}
		catch(Exception e){
			return false;
		}
	}
	
}
