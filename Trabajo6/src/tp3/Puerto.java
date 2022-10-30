package tp3;

public class Puerto {
	private ColaEspera camiones;
	private ColaEspera barcos;
	public Puerto() {
		super();
		camiones = new ColaEspera();
		barcos = new ColaEspera();
	}
	
	public void addCamion(Camion c){
		camiones.addElemento(c);
	}
	
	public void addBarco(Barco c){
		barcos.addElemento(c);
	}
	
	public void cargarBarco(){
		if(camiones.tieneElementos()){
			Camion c = (Camion)camiones.siguiente();
			if(barcos.tieneElementos()){
				Barco b = (Barco)barcos.siguiente();
				accionCargar(b, c);
			}
		}
	}
	
	public void accionCargar(Barco b, Camion c){
		System.out.println("Cargando barquito "+b.getId()+" con camion "+c.getPatente());
	}
	
}
