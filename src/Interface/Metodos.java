package Interface;

import Dominio.Empleados;

public interface Metodos {

	public void guardar(Empleados empleado);

	public void mostrar();

	public Empleados buscar(String nombre);

	public void editar(Empleados empleado);

	public void eliminar(String nombre);
	
	public int contarRegisHash();

}
