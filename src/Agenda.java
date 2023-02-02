import java.util.TreeMap;
import java.util.Scanner;


public class Agenda {
    private static TreeMap<String, String> contactos = new TreeMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------");
            System.out.println("Elige una opción: ");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Salir");

            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.println("Añade nombre del contacto:");
                String nombre = sc.nextLine();
                System.out.println("Añade teléfono del contacto:");
                String telefono = sc.nextLine();
                contactos.put(nombre, telefono);
                System.out.println("Contacto añadido correctamente");
            } else if (opcion == 2) {
                System.out.println("Añade el nombre del contacto:");
                String nombre = sc.nextLine();
                if (contactos.containsKey(nombre)) {
                    System.out.println("El teléfono de " + nombre + " es " + contactos.get(nombre));
                } else {
                    System.out.println("No se encuentra el contacto " + nombre);
                }
            } else if (opcion == 3) {
                for (String nombre : contactos.keySet()) {
                    System.out.println(nombre + ": " + contactos.get(nombre));
                }
            } else if (opcion == 4) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opciónn no valida");
            }
        }

        sc.close();
    }
}