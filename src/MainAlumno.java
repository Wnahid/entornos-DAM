

import java.util.Scanner;

public class MainAlumno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		String apellido;
		System.out.println("Introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println("Introduce tu apellido");
		apellido = sc.nextLine();
		Alumno a1 = new Alumno(nombre, apellido);
		a1.Incrementar();
		Alumno a2 = new Alumno(a1);
		a2.Incrementar();

		System.out.println(a2.getNombre());// Esto muestra lo establecido en el constructor copia

		Alumno a3 = new Alumno();
		a3.Incrementar();
		a3 = a1;// Esto asigna el objeto a3 al objeto a1
		a1.setNombre("Juan");// Esto cambia el valor del nombre del objeto a1
		System.out.println(a2.getNombre());
		System.out.println(a1.getNombre());
		// Este if comprueba con el equals si los nombres son iguales o no
		if (a1.getNombre().equals(a2.getNombre())) {
			System.out.println("Los nombres son iguales");
		} else {
			System.out.println("Los nombres no son iguales");
		}
		System.out.println(a1.Resultado());

	}

}
