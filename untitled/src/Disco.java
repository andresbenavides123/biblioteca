import java.util.Scanner;

public class Disco extends Publicacion {
    private float duracionMinutos;

    @Override
    public void leerDatos(Scanner sc) {
        System.out.println("\n--- 🎵 REGISTRANDO UN DISCO ---");
        super.leerDatos(sc);

        System.out.print("➤ Duración en minutos (ej. 45.5): ");
        this.duracionMinutos = sc.nextFloat();

        sc.nextLine(); // Limpieza del buffer
    }

    @Override
    public void mostrar() {
        System.out.println("\n💿 [DISCO]");
        System.out.println("   Título: " + titulo);
        System.out.println("   Precio (formato entero): $" + (int)precio);
        System.out.println("   Duración: " + duracionMinutos + " min");
    }
}