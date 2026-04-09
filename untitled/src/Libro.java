import java.util.Scanner;

public class Libro extends Publicacion {
    private int numeroPaginas;
    private int anioPublicacion;

    @Override
    public void leerDatos(Scanner sc) {
        System.out.println("\n---  REGISTRANDO UN LIBRO ---");
        super.leerDatos(sc); // Llama a las preguntas del padre

        System.out.print("➤ ¿Cuántas páginas tiene?: ");
        this.numeroPaginas = sc.nextInt();

        System.out.print("➤ ¿En qué año salió?: ");
        this.anioPublicacion = sc.nextInt();

        sc.nextLine(); // Limpieza del buffer
    }

    @Override
    public void mostrar() {
        System.out.println("\n [LIBRO]");
        super.mostrar(); // Muestra lo del padre
        System.out.println("   Páginas: " + numeroPaginas);
        System.out.println("   Año de publicación: " + anioPublicacion);
    }
}