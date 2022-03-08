

public class Alumno {

	// Variables
	private String nombre;
	private String apellido;
	private int numAlumnos;
	private int notaMedia;

	// Métodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
		System.out.println("TESTEO GIT");
		System.out.println("TESTEO 2");
	}

	public int Incrementar() {
		return notaMedia + 5;
	}

	public int Resultado() {
		return notaMedia;
	}

	// Constructores

	// En cada constructor incrementamos el número de alumnos porque así lo deseamos
	// Constructor nombre apellido
	Alumno(String name, String surname) {
		this.nombre = name;
		this.apellido = surname;
		numAlumnos++;
	}

	// Constructor defecto
	Alumno() {
		numAlumnos++;
	}

	// Constructor copia
	Alumno(Alumno a) {
		this.nombre=a.getNombre();
		this.apellido=a.getApellido();
		numAlumnos++;

	}

}
