package LogicaMetodos;

import java.util.HashMap;

import Dominio.Empleados;
import Interface.Metodos;

public class Implementacion implements Metodos {

	//Los tipos de datos primitivos ponerlos parseados
	private HashMap<String, Empleados> registrosHash = new HashMap<String, Empleados>();

	@Override
	public void guardar(Empleados empleado) {
		// TODO Auto-generated method stub
		registrosHash.put(empleado.getNombre(), empleado);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(registrosHash);
	}

	@Override
	public Empleados buscar(String nombre) {
		// TODO Auto-generated method stub
		return registrosHash.get(nombre);
	}

	@Override
	public void editar(Empleados empleado) {
		// TODO Auto-generated method stub
		registrosHash.put(empleado.getNombre(), empleado);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		registrosHash.remove(nombre);
	}

	@Override
	public int contarRegisHash() {
		// TODO Auto-generated method stub
		return registrosHash.size();
	}

}
