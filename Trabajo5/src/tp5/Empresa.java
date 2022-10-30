package tp5;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado> empleados;
	public Empresa(){
		empleados = new ArrayList<Empleado>();
	}
	
	public double totalSueldos(){
		double sueldos=0;
		for(int i=0; i<empleados.size(); i++){
			sueldos+=empleados.get(i).getSueldo();
		}
		return sueldos;
	}
	
	public void addEmpleado(Empleado e){
		if(!existeEmpleado(e)){
			empleados.add(e);
		}
	}
	
	public void removeEmpleado(Empleado e){
		empleados.remove(e);
	}
	
	public boolean existeEmpleado(Empleado e){
		return empleados.contains(e);
	}
	
}	
