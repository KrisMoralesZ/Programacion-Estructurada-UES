import java.util.Scanner;

public class Store {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitar al usuario ingresar la cantidad y precio de varios productos
    System.out.println("Calculadora de Compra en la Tienda de Comestibles");
    System.out.println("Ingrese los detalles de los productos. Para finalizar, ingrese 0 en cantidad.\n");

    double costoTotal = 0;

    while (true) {
      System.out.print("Ingrese el nombre del producto (o 'fin' para terminar): ");
      String producto = scanner.nextLine();

      if (producto.equalsIgnoreCase("fin")) {
        break; // Salir del bucle si el usuario ingresa 'fin'
      }

      System.out.print("Ingrese la cantidad: ");
      int cantidad = scanner.nextInt();

      System.out.print("Ingrese el precio por unidad: ");
      double precioPorUnidad = scanner.nextDouble();
      scanner.nextLine(); // Consumir el salto de línea después de leer el precio

      // Calcular el costo parcial del producto y sumarlo al costo total
      double costoParcial = cantidad * precioPorUnidad;
      costoTotal += costoParcial;

      // Mostrar detalles del producto
      System.out.println("Producto: " + producto);
      System.out.println("Cantidad: " + cantidad);
      System.out.println("Precio por unidad: $" + precioPorUnidad);
      System.out.println("Costo parcial: $" + costoParcial);
      System.out.println();
    }

    // Mostrar el costo total de la compra
    System.out.println("Costo total de la compra: $" + costoTotal);

    // Cerrar el scanner al finalizar
    scanner.close();
  }
}
