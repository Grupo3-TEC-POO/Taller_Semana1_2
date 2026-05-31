package caso5;

import java.util.ArrayList;

public class Estudiante {
	
	private ArrayList<String> lista;
	
	public Estudiante() {
		this.lista = new ArrayList<>();
	}
		public void registrar(String nombre) throws IllegalArgumentException {
			if (nombre.isEmpty() || nombre.matches(".*\\d.*")) {
				throw new IllegalArgumentException();
			}
		lista.add(nombre);
	}
	
		public ArrayList<String> getLista() {
		    return this.lista;
		}
	
}
