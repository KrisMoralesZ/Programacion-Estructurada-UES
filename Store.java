import java.util.Scanner;

public class Store {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int product = 0;
    System.out.println("Cuanto cuesta su producto");
    product = scanner.nextInt();

    System.out.println("El total a pagar es: " + product);

    scanner.close();
  }
}