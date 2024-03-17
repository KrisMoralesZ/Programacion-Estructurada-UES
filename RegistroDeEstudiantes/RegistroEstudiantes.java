package RegistroDeEstudiantes;

import java.util.ArrayList;
import java.util.Scanner;

class Estudiante {
  String nombre;
  int id;
  int edad;
  double calificacion;

  public Estudiante(String nombre, int id, int edad, double calificacion) {
    this.nombre = nombre;
    this.id = id;
    this.edad = edad;
    this.calificacion = calificacion;
  }

  public String toString() {
    return "Nombre: " + nombre + ", ID: " + id + ", Edad: " + edad + ", Calificación: " + calificacion;
  }
}

public class RegistroEstudiantes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Estudiante> estudiantes = new ArrayList<>();

    while (true) {
      System.out.println("\nMenú:");
      System.out.println("1. Agregar estudiante");
      System.out.println("2. Mostrar información de estudiantes");
      System.out.println("3. Calcular promedio de calificaciones");
      System.out.println("4. Buscar estudiante por número de identificación");
      System.out.println("5. Eliminar estudiante");
      System.out.println("6. Salir del programa");
      System.out.print("Seleccione una opción: ");
      int opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          agregarEstudiante(scanner, estudiantes);
          break;
        case 2:
          mostrarInformacionEstudiantes(estudiantes);
          break;
        case 3:
          calcularPromedioCalificaciones(estudiantes);
          break;
        case 4:
          buscarEstudiante(scanner, estudiantes);
          break;
        case 5:
          eliminarEstudiante(scanner, estudiantes);
          break;
        case 6:
          System.out.println("¡Hasta luego!");
          scanner.close();
          return;
        default:
          System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
      }
    }
  }

  public static void agregarEstudiante(Scanner scanner, ArrayList<Estudiante> estudiantes) {
    System.out.print("Ingrese el nombre del estudiante: ");
    String nombre = scanner.next();
    System.out.print("Ingrese el número de identificación del estudiante: ");
    int id = scanner.nextInt();
    System.out.print("Ingrese la edad del estudiante: ");
    int edad = scanner.nextInt();
    System.out.print("Ingrese la calificación del estudiante: ");
    double calificacion = scanner.nextDouble();

    estudiantes.add(new Estudiante(nombre, id, edad, calificacion));
    System.out.println("Estudiante agregado con éxito.");
  }

  public static void mostrarInformacionEstudiantes(ArrayList<Estudiante> estudiantes) {
    System.out.println("\nInformación de estudiantes:");
    for (Estudiante estudiante : estudiantes) {
      System.out.println(estudiante);
    }
  }

  public static void calcularPromedioCalificaciones(ArrayList<Estudiante> estudiantes) {
    if (estudiantes.isEmpty()) {
      System.out.println("No hay estudiantes registrados.");
      return;
    }

    double totalCalificaciones = 0;
    for (Estudiante estudiante : estudiantes) {
      totalCalificaciones += estudiante.calificacion;
    }
    double promedio = totalCalificaciones / estudiantes.size();
    System.out.println("El promedio de calificaciones de todos los estudiantes es: " + promedio);
  }

  public static void buscarEstudiante(Scanner scanner, ArrayList<Estudiante> estudiantes) {
    System.out.print("Ingrese el número de identificación del estudiante que desea buscar: ");
    int idBusqueda = scanner.nextInt();

    for (Estudiante estudiante : estudiantes) {
      if (estudiante.id == idBusqueda) {
        System.out.println("\nInformación del estudiante encontrado:");
        System.out.println(estudiante);
        return;
      }
    }
    System.out.println("No se encontró ningún estudiante con ese número de identificación.");
  }

  public static void eliminarEstudiante(Scanner scanner, ArrayList<Estudiante> estudiantes) {
    if (estudiantes.isEmpty()) {
      System.out.println("No hay estudiantes registrados.");
      return;
    }

    System.out.print("Ingrese el número de identificación del estudiante que desea eliminar: ");
    int idEliminacion = scanner.nextInt();

    for (int i = 0; i < estudiantes.size(); i++) {
      if (estudiantes.get(i).id == idEliminacion) {
        estudiantes.remove(i);
        System.out.println("Estudiante eliminado con éxito.");
        return;
      }
    }
    System.out.println("No se encontró ningún estudiante con ese número de identificación.");
  }
}
