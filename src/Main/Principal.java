package Main;

import java.util.Scanner;

import Dominio.Empleados;
import LogicaMetodos.Implementacion;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectura = null;

		System.out.println("Hola mundo");
		System.out.println("Tienes un " + 100);

		String nombre;
		float sueldo;
		char sexo;
		int menuPri;

		Empleados empleado;

		Implementacion imp = new Implementacion();

		do {
			System.out.println("BIENVENID AL SISTEMA");
			System.out.println("1---ALTA");
			System.out.println("2---MOSTRAR");
			System.out.println("3---BUSCAR");
			System.out.println("4---EDITAR EL SUELDO");
			System.out.println("5---ELIMINAR");
			System.out.println("6---SALIR");

			lectura = new Scanner(System.in);
			menuPri = lectura.nextInt();

			switch (menuPri) {
			case 1:
				try {
					System.out.println("Ingrese el nombre");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();

					System.out.println("Ingrese el sueldo");
					lectura = new Scanner(System.in);
					sueldo = lectura.nextFloat();

					System.out.println("Ingrese el sexo");
					lectura = new Scanner(System.in);
					sexo = lectura.next().charAt(0);

					// crear el objeto
					empleado = new Empleados(nombre, sueldo, sexo);

					// agregar al hashMap
					imp.guardar(empleado);
					System.out.println("Se guardo");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;
			case 2:
				if (imp.contarRegisHash() > 0)
					imp.mostrar();
				else
					System.out.println("No hay registros");
				break;
			case 3:
				if (imp.contarRegisHash() > 0) {

					System.out.println("Ingrese el nombre a buscar");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();

					// buascar
					empleado = imp.buscar(nombre);

					if (empleado != null)
						System.out.println(empleado);
					else
						System.out.println("No existe ese empleado");
				} else
					System.out.println("No hay registros para buscar");
				break;
			case 4:
				if (imp.contarRegisHash() > 0) {

					System.out.println("Ingrese el nombre del empleado a editar");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();

					// buascar
					empleado = imp.buscar(nombre);

					if (empleado != null) {
						System.out.println("Se encontro " + empleado.getNombre());

						// Proceso para editar
						System.out.println("Ingrese el nuevo sueldo");
						lectura = new Scanner(System.in);
						sueldo = lectura.nextFloat();

						// actualizar el objeto
						empleado.setSueldo(sueldo);

						// actualizar el objeto en el hashMap
						imp.editar(empleado);
						System.out.println("Se edito");

					} else
						System.out.println("No existe ese empleado");
				} else
					System.out.println("No hay registros para buscar");
				break;
			case 5:
				System.out.println("Ingrese el nombre del empleado a eliminar");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();

				// eliminacion
				imp.eliminar(nombre);
				System.out.println("Se elimino");
				break;
			case 6:
				break;
			}

		} while (menuPri < 6);
	}

}
