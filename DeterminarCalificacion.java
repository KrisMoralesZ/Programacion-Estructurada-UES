import java.util.Scanner;

public class DeterminarCalificacion {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitar al usuario ingresar un puntaje
    System.out.print("Ingrese el puntaje (entre 0 y 100): ");
    int puntaje = scanner.nextInt();

    // Utilizar una estructura if-else para determinar la calificación
    if (puntaje >= 90 && puntaje <= 100) {
      System.out.println("Calificación: A");
    } else if (puntaje >= 80 && puntaje <= 89) {
      System.out.println("Calificación: B");
    } else if (puntaje >= 70 && puntaje <= 79) {
      System.out.println("Calificación: C");
    } else if (puntaje >= 60 && puntaje <= 69) {
      System.out.println("Calificación: D");
    } else if (puntaje >= 0 && puntaje < 60) {
      System.out.println("Calificación: F");
    } else {
      System.out.println("El puntaje ingresado no está en el rango válido (0-100).");
    }

    // Cerrar el scanner al finalizar
    scanner.close();
  }
}
