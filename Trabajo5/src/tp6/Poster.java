package tp6;

public class Poster extends Trabajo {
	public Poster(String nombre){
		super(nombre);
	}
	public boolean puedeSerEvaluado(Evaluador e){
		for(int i=0; i < this.temas.size(); i++){
			if(e.existeTema(temas.get(i))){
				return true;
			}
		}
		return false;
	}
}
