package caso5;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		Estudiante estudent = new Estudiante();
		Scanner data_estud = new Scanner(System.in);
		String ingreso;
		
		System.out.println("---------REGISTRO DE DATOS---------");
		
		while (true) {
			
			try {
				System.out.print("Nombre del Alumno (o 'salir'): ");
				ingreso = data_estud.nextLine().trim();
				
				if (ingreso.equalsIgnoreCase("Salir")) {
					break;
				}
				
				estudent.registrar(ingreso);
				
			} catch (IllegalArgumentException e) {
				System.out.println("[error] Ingreso invalido. No use numeros ni deje vacios");
			} catch (Exception e) {
				System.out.println("[error] System Failure.");
			}
			
		}
		
		System.out.println("\n-----REPORTE FINAL -----");
		
		//
		for (int i = 0; i < estudent.getLista().size(); i++) {
		    System.out.println((i + 1) + ". " + estudent.getLista().get(i));
		}
		
		data_estud.close();
		
	}
}
