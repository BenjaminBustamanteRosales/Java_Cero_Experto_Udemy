
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GeneradorDeIdUnico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var random = new Random();


        System.out.print("Ingrese Nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingrese Apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Ingrese Año Nacimiento (YYYY): ");
        var añoNacimiento = consola.nextLine();

        var numRandom = random.nextInt(9999) + 1;

        //Normalizar datos

        var nombre2 = nombre.trim().toUpperCase().substring(0,2);
        var apellido2 = apellido.trim().toUpperCase().substring(0,2);
        var añoNacimineto2= añoNacimiento.trim().substring(2);

        //valor aleatorii

        var numAleatorio = random.nextInt(9999) + 1;

        var numeroAleatorioFormato = String.format("%04d", numAleatorio);

            var idUnico = nombre2 + apellido2 + añoNacimineto2 + numeroAleatorioFormato;



            System.out.println("idUnico = " + idUnico);





    }
}
