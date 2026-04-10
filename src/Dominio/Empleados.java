package Dominio;

public class Empleados {

	private String nombre; //Este sera la llave del hashMap
	private float sueldo;
	private char sexo;

	public Empleados(String nombre, float sueldo, char sexo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", sueldo=" + sueldo + ", sexo=" + sexo + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
