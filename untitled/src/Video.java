import java.util.Scanner;

public class Video extends Publicacion {
    private Idioma idioma;
    private float duracionHoras;

    @Override
    public void leerDatos(Scanner sc) {
        System.out.println("\n---  REGISTRANDO UN VIDEO ---");
        super.leerDatos(sc);

        System.out.print(" Duración en horas (ej. 1.5): ");
        this.duracionHoras = sc.nextFloat();
        sc.nextLine(); // Limpieza del buffer

        System.out.print(" Selecciona el idioma (1. Español, 2. Inglés, 3. Portugués): ");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpieza del buffer

        switch (opcion) {
            case 2: this.idioma = Idioma.INGLES; break;
            case 3: this.idioma = Idioma.PORTUGUES; break;
            default: this.idioma = Idioma.ESPANOL; break;
        }
    }

    @Override
    public void mostrar() {
        System.out.println("\n [VIDEO]");
        super.mostrar();
        System.out.println("   Idioma: " + idioma);
        System.out.println("   Duración: " + duracionHoras + " horas");
    }
}