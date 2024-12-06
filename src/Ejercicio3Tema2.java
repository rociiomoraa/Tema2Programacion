import java.util.Scanner;

public class Ejercicio3Tema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ejercicio 3. Realiza un conversor de Mb a Kb.
		
		// Crea un objeto Scanner para leer la entrada del ususario.
		Scanner scanner1 = new Scanner(System.in);
		
		// Solicitar al usuario que introduzca los megabytes.
		
		System.out.println("Introduce la cantidad de Megabytes (Mb): ");
		double megabytes = scanner1.nextDouble();
		
		// Realizar la conversion de MB a Kb (1Mb = 1024 Kb).
		double Kilobytes = megabytes * 1024;
		
		// Mostrar el resultado de la conversión.
		System.out.println(megabytes + " Megabytes son equivalentes a " + Kilobytes + " Kilobytes.");
		
		scanner1.close();
		
	}

}
