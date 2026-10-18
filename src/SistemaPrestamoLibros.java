import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.print("Ud tiene credencial estudiante? (true/false): ");
        var isEstudianteCredencial = Boolean.parseBoolean(consola.nextLine());
        System.out.print("A cuantos Km ud vive?: ");
        var distanciaCasa = Float.parseFloat(consola.nextLine());

        if (isEstudianteCredencial || distanciaCasa<= 3){
            System.out.println("Ud cumple con las condiciones de adquerir un libro");
        }else{
            System.out.println("Ud no puede adquerir un libro");
        }







    }
}
