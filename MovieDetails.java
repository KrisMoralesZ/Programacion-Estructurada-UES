import java.util.Scanner;

public class MovieDetails {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitar al usuario ingresar información sobre la película
    System.out.println("Ingrese los detalles de la película:");

    System.out.print("Título: ");
    String titulo = scanner.nextLine();

    System.out.print("Director: ");
    String director = scanner.nextLine();

    System.out.print("Año de lanzamiento: ");
    int añoLanzamiento = scanner.nextInt();
    scanner.nextLine(); // Consumir el salto de línea después de leer el entero

    System.out.print("Género: ");
    String genero = scanner.nextLine();

    System.out.print("Duración (en minutos): ");
    int duracion = scanner.nextInt();

    // Mostrar los detalles de la película en la consola
    System.out.println("\nDetalles de la película:");
    System.out.println("Título: " + titulo);
    System.out.println("Director: " + director);
    System.out.println("Año de lanzamiento: " + añoLanzamiento);
    System.out.println("Género: " + genero);
    System.out.println("Duración: " + duracion + " minutos");

    // Cerrar el scanner al finalizar
    scanner.close();
  }
}
