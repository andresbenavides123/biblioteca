import java.util.Scanner;

public abstract class Publicacion implements IPublicacion {
    protected String titulo;
    protected float precio;

    @Override
    public void leerDatos(Scanner sc) {
        System.out.print("➤ Ingresa el título: ");
        this.titulo = sc.nextLine();

        System.out.print("➤ Ingresa el precio: $");
        this.precio = sc.nextFloat();

        // Limpiamos el Enter fantasma de la memoria
        sc.nextLine();
    }

    @Override
    public void mostrar() {
        System.out.println("   Título: " + titulo);
        System.out.println("   Precio: $" + precio);
    }
}