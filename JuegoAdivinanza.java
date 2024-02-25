import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // Generar un número secreto aleatorio entre 1 y 100 (inclusive)
    int numeroSecreto = random.nextInt(100) + 1;

    // Inicializar variables
    int intentos = 0;
    int intentoUsuario;

    System.out.println("Bienvenido al Juego de Adivinanza!");
    System.out.println("Adivina el número secreto entre 1 y 100.");

    // Utilizar una estructura de control do-while
    do {
      // Solicitar al usuario que adivine el número
      System.out.print("Ingresa tu conjetura (o ingresa 0 para salir): ");
      intentoUsuario = scanner.nextInt();

      if (intentoUsuario == 0) {
        // Salir del bucle si el usuario decide salir
        System.out.println("Gracias por jugar. ¡Hasta luego!");
        break;
      }

      // Incrementar el contador de intentos
      intentos++;

      // Comprobar si la conjetura es correcta, demasiado alta o demasiado baja
      if (intentoUsuario == numeroSecreto) {
        System.out.println("¡Felicidades! Has adivinado el número secreto en " + intentos + " intentos.");
      } else if (intentoUsuario < numeroSecreto) {
        System.out.println("Demasiado bajo. Intenta de nuevo.");
      } else {
        System.out.println("Demasiado alto. Intenta de nuevo.");
      }

    } while (intentoUsuario != numeroSecreto);

    // Cerrar el scanner al finalizar
    scanner.close();
  }
}
