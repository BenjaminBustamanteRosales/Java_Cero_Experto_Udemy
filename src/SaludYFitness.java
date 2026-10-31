import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        final var Meta_Pasos_Diario = 10000;
        final var Calorias_Por_Pasos = 0.04; //kcals



        System.out.println("---APP FITNESS---");

        System.out.print("Ingrese su Nombre completo: ");
        var nombreCompleto = consola.nextLine();
        System.out.print("Cuantos pasos camino hoy?: ");
        var pasosCaminados = Integer.parseInt(consola.nextLine());

        var calsQuemadas = pasosCaminados * Calorias_Por_Pasos;
        var meta_alcanzada = (pasosCaminados >= Meta_Pasos_Diario)? "Ud supero su meta"  :  "Ud no supero su meta";

        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorias quemadas: %.2f kcal
                Alcanzo su meta?: %s
                
                """ , nombreCompleto, pasosCaminados, calsQuemadas, meta_alcanzada  );







    }


}
