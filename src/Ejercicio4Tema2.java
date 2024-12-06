import java.util.Scanner;

public class Ejercicio4Tema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ejercicio 4. Realiza un conversor de Kb a Mb
		// Crear un objeto Scanner para leer la entrada del usuario
		
		Scanner scanner1 = new Scanner(System.in);
		
		// Solicitar al usuario que introduzca los kilobytes.
		System.out.println("Introduzca la cantidad de Kilobytes (Kb): ");
		double Kilobytes = scanner1.nextDouble();
		
		// Realizar la conversión de Kb a Mb.
		double Megabytes = Kilobytes / 1024;
		
		// Mostrar el resultado de la conversión
		System.out.println(Kilobytes + " Kilobytes son equivalentes a " + Megabytes + " Megabytes.");
		
		// Cerrar el scanner.
		scanner1.close();
		
	}

}
