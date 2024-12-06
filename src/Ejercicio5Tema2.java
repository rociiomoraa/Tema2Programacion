import java.util.Scanner;

public class Ejercicio5Tema2 {

	public static void main(String[] args) {
		// Ejercicio 5. 
		 
		// Crear un objeto Scanner para leer la entrada del usuario
		   Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que introduzca un número binario de hasta 8 cifras
		   System.out.print("Introduce un número binario (máximo 8 dígitos): ");
		   String numeroBinario = scanner.nextLine();

		// Verificar que el número tiene 8 cifras como máximo y que solo contiene ceros y unos
		   if (numeroBinario.matches("[01]{1,8}")) {
		   
		// Convertir el número binario a decimal
		   int numeroDecimal = Integer.parseInt(numeroBinario, 2);
		   System.out.println("El valor decimal es: " + numeroDecimal);
		      
		 } else {
		      System.out.println("Entrada no válida. Introduce un número binario de hasta 8 dígitos compuesto solo por 0 y 1.");
		        }

		 // Cerrar el scanner
		    scanner.close();
		 
	}

}
