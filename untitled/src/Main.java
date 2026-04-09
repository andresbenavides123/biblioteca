import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Polimorfismo pro: Una lista que acepta cualquier cosa que cumpla la interfaz
        List<IPublicacion> catalogo = new ArrayList<>();

        catalogo.add(new Libro());
        catalogo.add(new Disco());
        catalogo.add(new Video());

        System.out.println("¡Bienvenido al sistema! Vamos a registrar los productos.");

        // Fase 1: Pedir datos
        for (IPublicacion item : catalogo) {
            item.leerDatos(scanner);
        }

        System.out.println("\n=============================================");
        System.out.println("    RESUMEN DE TU CATÁLOGO EDITORIAL ");
        System.out.println("=============================================");

        // Fase 2: Mostrar datos
        for (IPublicacion item : catalogo) {
            item.mostrar();
        }

        System.out.println("\n=============================================");
        System.out.println("¡Registro finalizado con éxito!");

        scanner.close();
    }
}