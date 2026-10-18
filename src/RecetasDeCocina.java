import java.util.Scanner;

public class RecetasDeCocina {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Ingrese Nombre De La Receta: ");
        var receta = consola.nextLine();

        System.out.print("Ingrese Ingredientes Principales: ");
        var ingredientesPrincipales  = consola.nextLine();

        System.out.print("Ingrese Tiempo De Preparacion (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa La Dificultad (Facil / Medio / Dificil): ");
        var dificultadReceta = consola.nextLine();

        System.out.println("\t----RECETA---");

        System.out.println("\treceta = " + receta);
        System.out.println("\tingredientesPrincipales = " + ingredientesPrincipales);
        System.out.println("\ttiempoPreparacion = " + tiempoPreparacion + " minutos");
        System.out.println("\tdificultadReceta = " + dificultadReceta);



    }
}
