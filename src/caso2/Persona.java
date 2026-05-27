package caso2;

public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}	
	
	public void mostrarDatos() {
		System.out.println("---------------------------");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad + " años");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
