package caso2;

public class MainPersona {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Jorge Flores", 45);
		Persona persona2 = new Persona("Obi-Wan Kenobi", 90);
		System.out.println("=== REPORTE DE PERSONAS (POO) ===");
		persona1.mostrarDatos();
		persona2.mostrarDatos();
		System.out.println("---------------------------");
	}
}
