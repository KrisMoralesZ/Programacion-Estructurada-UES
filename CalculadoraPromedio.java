import java.util.Scanner;

public class CalculadoraPromedio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de calificaciones que desea ingresar: ");
    int cantidadCalificaciones = scanner.nextInt();

    while (cantidadCalificaciones <= 0) {
      System.out.println("Por favor, ingrese una cantidad válida mayor que 0.");
      System.out.print("Ingrese la cantidad de calificaciones que desea ingresar: ");
      cantidadCalificaciones = scanner.nextInt();
    }

    double[] calificaciones = new double[cantidadCalificaciones];

    for (int i = 0; i < cantidadCalificaciones; i++) {
      System.out.print("Ingrese la calificación " + (i + 1) + ": ");
      calificaciones[i] = scanner.nextDouble();
    }

    double sumaCalificaciones = 0;

    for (double calificacion : calificaciones) {
      sumaCalificaciones += calificacion;
    }

    double promedio = sumaCalificaciones / cantidadCalificaciones;

    System.out.println("\nEl promedio de las calificaciones ingresadas es: " + promedio);

    scanner.close();
  }
}
