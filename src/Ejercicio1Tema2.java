import java.util.Scanner;

public class Ejercicio1Tema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejercicio 1. Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.
		
		// Crear un objeto Scanner para leer la entrada del usuario.
		Scanner scanner1 = new Scanner(System.in);
		
		// Fijar la tarifa por hora en euros.
		final double TarifaPorHora = 12.0;
		
		// Solicitar al usuario que introduzca las horas trabajadas.
		System.out.println("Introduce el número de horas trabajadas en la semana: ");
		double HorasTrabajadas = scanner1.nextDouble();
		
		// Calcular el salario semanal.
		double SalarioSemanal = HorasTrabajadas * TarifaPorHora;
		
		// Mostrar el salario semanal
		System.out.println("El salario semanal es de " + SalarioSemanal + " euros");
		
		// Cerrar el scanner.
		scanner1.close();
	}
}
