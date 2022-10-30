package tp1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
	private ArrayList<Articulo> articulos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Alquiler> alquileres;
	public Sistema(){
		articulos = new ArrayList<Articulo>();
		clientes = new ArrayList<Cliente>();
		alquileres = new ArrayList<Alquiler>();
	}
	
	public void alquilarItem(Cliente c, Articulo a, LocalDate fecha_finalizacion, int factura){
		if(a.puedeSerAlquilado()){
			a.alquilar();
			addAlquiler(c, a, fecha_finalizacion, factura);
		}
	}
	
	public void recibirItem(Alquiler a){
		a.getItem().devolver();
		this.removeAlquiler(a);
	}
	
	public ArrayList<Cliente> getClientesAlquilerVencido(){
		ArrayList<Cliente> clientesVencidos = new ArrayList<Cliente>();
		for(int i=0; i<alquileres.size(); i++){
			if((alquileres.get(i).getFechaFinalizacion()).isAfter(LocalDate.now())){
				clientesVencidos.add(alquileres.get(i).getCliente());
			}
		}
		return clientesVencidos;
	}
	
	public ArrayList<Articulo> itemsAlquilados(Cliente c){
		ArrayList<Articulo> itemsAlquilados = new ArrayList<>();
		for(int i=0; i<alquileres.size(); i++){
			if((alquileres.get(i).getCliente()).equals(c)){
				itemsAlquilados.add(alquileres.get(i).getItem());
			}
		}
		return itemsAlquilados;
	}
	
	public void addAlquiler(Cliente c, Articulo a, LocalDate fecha_finalizacion, int factura){
		Alquiler a1 = new Alquiler(a, c, LocalDate.now(), fecha_finalizacion, factura);
		if(!existeAlquiler(a1)){
			alquileres.add(a1);
		}
	}
	public void removeAlquiler(Alquiler a){
		alquileres.remove(a);
	}
	public boolean existeAlquiler(Alquiler a){
		return alquileres.contains(a);
	}
	
	public void addArticulo(Articulo a){
		if(!existeArticulo(a)){
			articulos.add(a);
		}
	}
	public void removeArticulo(Articulo a){
		articulos.remove(a);
	}
	public boolean existeArticulo(Articulo a){
		return articulos.contains(a);
	}
	public void addCliente(Cliente c){
		if(!existeCliente(c)){
			clientes.add(c);
		}
	}
	public void removeCliente(Cliente c){
		clientes.remove(c);
	}
	public boolean existeCliente(Cliente c){
		return clientes.contains(c);
	}

	
}