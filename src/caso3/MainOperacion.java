package caso3;

public class MainOperacion {

	public static void main(String[] args) {
		
		Operacion suma = new Operacion();
		
		System.out.println(suma.sumar(5, 8));
		System.out.println(suma.sumar(41, 12, 3));
		System.out.println(suma.sumar(8.5, 3.9));
	}
}
