import java.util.Scanner;

public class TablaMultiplicar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese un numero para generar la tabla de multiplicar");
    int numero = scanner.nextInt();

    System.out.println("\nTabla de multiplicar para el número " + numero + ":\n");

    for (int i = 1; i <= 10; i++) {
      int resultado = numero * i;
      System.out.println(numero + " x " + i + " = " + resultado);
    }

    scanner.close();
  }
}
