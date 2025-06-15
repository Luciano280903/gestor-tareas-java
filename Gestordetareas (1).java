
// Importamos las clases necesarias: Scanner para entrada de datos y ArrayList para almacenar las tareas
import java.util.ArrayList;
import java.util.Scanner;

// Definimos la clase principal del programa
public class Gestordetareas {
    // Método principal donde se ejecuta el programa
    public static void main(String[] args) {
        // Creamos un Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Creamos una lista para almacenar las tareas
        ArrayList<String> tareas = new ArrayList<String>();

        // Agregamos algunas tareas por defecto al iniciar el programa
        tareas.add("Estudiar para el examen");
        tareas.add("Hacer la tarea de programación");
        tareas.add("Leer apuntes de redes");
        tareas.add("Estudiar Java");
        tareas.add("Hacer ejercicio");

        // Mostramos las tareas iniciales
        System.out.println("Lista de tareas:");
        for (int i = 0; i < tareas.size(); i++) {
            // Mostramos cada tarea con su número correspondiente
            System.out.println((i + 1) + ". " + tareas.get(i));
        }

        // Variable para guardar la opción elegida por el usuario
        int opcion = 0;

        // Repetimos el menú hasta que el usuario elija salir (opción 4)
        while (opcion != 4) {
            // Mostramos el menú de opciones
            System.out.println("\n=== Menú de Tareas ===");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Elegí una opción: ");
            
            // Leemos la opción ingresada por el usuario
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiamos el salto de línea pendiente

            // Opción 1: Agregar una nueva tarea
            if (opcion == 1) {
                System.out.print("Escribí la tarea: ");
                String nuevaTarea = sc.nextLine();
                tareas.add(nuevaTarea); // Agregamos la tarea a la lista
                System.out.println("Tarea agregada correctamente.");
            
            // Opción 2: Ver todas las tareas actuales
            } else if (opcion == 2) {
                if (tareas.isEmpty()) {
                    System.out.println("No hay tareas.");
                } else {
                    System.out.println("=== Lista de Tareas ===");
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println((i + 1) + ". " + tareas.get(i));
                    }
                }
            
            // Opción 3: Eliminar una tarea según su número
            } else if (opcion == 3) {
                if (tareas.isEmpty()) {
                    System.out.println("No hay tareas para eliminar.");
                } else {
                    // Mostramos las tareas con sus números
                    System.out.println("¿Qué número de tarea querés eliminar?");
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println((i + 1) + ". " + tareas.get(i));
                    }
                    System.out.print("Número: ");
                    int eliminar = sc.nextInt();
                    sc.nextLine(); // Limpiamos Enter pendiente

                    // Validamos que el número esté en rango
                    if (eliminar >= 1 && eliminar <= tareas.size()) {
                        tareas.remove(eliminar - 1); // Eliminamos la tarea
                        System.out.println("Tarea eliminada.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                }

            // Opción 4: Salir del programa
            } else if (opcion == 4) {
                System.out.println("Saliendo del gestor de tareas. ¡Hasta luego!");

            // Cualquier otra opción es inválida
            } else {
                System.out.println("Opción no válida.");
            }
        }

        // Cerramos el Scanner para liberar recursos
        sc.close();
    }
}
