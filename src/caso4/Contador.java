package caso4;

public class Contador {
	
	
	public static int cuentaObjetos = 0;
	
	
	public Contador() {
		
		cuentaObjetos++;
	}
	
	public static void mostrarTotal() {
		System.out.println("Total de Objetos creados hasta ahora: " + cuentaObjetos);
	}
	
}
