import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        
        var consola = new Scanner(System.in);
        System.out.print("escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
