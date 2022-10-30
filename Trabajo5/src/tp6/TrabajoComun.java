package tp6;

public class TrabajoComun extends Trabajo{
	public TrabajoComun(String nombre){
		super(nombre);
	}
	public boolean puedeSerEvaluado(Evaluador e){
		int cantidad=0;
		for(int i=0; i < this.temas.size(); i++){
			if(e.existeTema(temas.get(i))){
				cantidad++;
			}
		}
		return cantidad==temas.size();
	}
}
