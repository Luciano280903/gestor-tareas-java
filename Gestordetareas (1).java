
import java.util.ArrayList;
import java.util.Scanner;

public class Gestordetareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> tareas = new ArrayList<String>();

        tareas.add("Estudiar para el examen");
        tareas.add("Hacer la tarea de programación");
        tareas.add("Leer apuntes de redes");
        tareas.add("Estudiar Java");
        tareas.add("Hacer ejercicio");

        System.out.println("Lista de tareas:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n=== Menú de Tareas ===");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Elegí una opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Escribí la tarea: ");
                String nuevaTarea = sc.nextLine();
                tareas.add(nuevaTarea);
                System.out.println("Tarea agregada correctamente.");
            
            } else if (opcion == 2) {
                if (tareas.isEmpty()) {
                    System.out.println("No hay tareas.");
                } else {
                    System.out.println("=== Lista de Tareas ===");
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println((i + 1) + ". " + tareas.get(i));
                    }
                }
            
            } else if (opcion == 3) {
                if (tareas.isEmpty()) {
                    System.out.println("No hay tareas para eliminar.");
                } else {
                    System.out.println("¿Qué número de tarea querés eliminar?");
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println((i + 1) + ". " + tareas.get(i));
                    }
                    System.out.print("Número: ");
                    int eliminar = sc.nextInt();
                    sc.nextLine();

                    if (eliminar >= 1 && eliminar <= tareas.size()) {
                        tareas.remove(eliminar - 1);
                        System.out.println("Tarea eliminada.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                }

            } else if (opcion == 4) {
                System.out.println("Saliendo del gestor de tareas. ¡Hasta luego!");

            } else {
                System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}
