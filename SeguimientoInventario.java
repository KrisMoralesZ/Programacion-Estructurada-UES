import java.util.Scanner;

public class SeguimientoInventario {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Crear una matriz bidimensional para representar el inventario de la tienda
    String[][] inventario = {
        { "Manzanas", "2.50", "100" },
        { "Plátanos", "1.75", "75" },
        { "Naranjas", "3.00", "50" },
        { "Papas", "1.20", "120" },
        { "Zanahorias", "0.80", "90" }
    };

    // Mostrar el inventario de la tienda
    System.out.println("Inventario de la Tienda de Comestibles:\n");
    System.out.println("Nombre\t\tPrecio\tCantidad en Stock");
    System.out.println("------------------------------------------");
    for (String[] producto : inventario) {
      System.out.println(producto[0] + "\t\t$" + producto[1] + "\t" + producto[2]);
    }

    // Calcular y mostrar el valor total del inventario de la tienda
    double valorTotalInventario = 0;
    for (String[] producto : inventario) {
      double precio = Double.parseDouble(producto[1]);
      int cantidad = Integer.parseInt(producto[2]);
      valorTotalInventario += precio * cantidad;
    }
    System.out.println("\nValor total del inventario: $" + valorTotalInventario);

    // Permitir al usuario buscar productos por nombre e imprimir los detalles del
    // producto
    System.out.print("\nIngrese el nombre del producto que desea buscar: ");
    String nombreProducto = scanner.nextLine();

    boolean encontrado = false;
    for (String[] producto : inventario) {
      if (producto[0].equalsIgnoreCase(nombreProducto)) {
        System.out.println("\nDetalles del Producto:");
        System.out.println("Nombre: " + producto[0]);
        System.out.println("Precio: $" + producto[1]);
        System.out.println("Cantidad en Stock: " + producto[2]);
        encontrado = true;
        break;
      }
    }

    if (!encontrado) {
      System.out.println("\nEl producto no se encuentra en el inventario.");
    }

    // Cerrar el scanner al finalizar
    scanner.close();
  }
}
