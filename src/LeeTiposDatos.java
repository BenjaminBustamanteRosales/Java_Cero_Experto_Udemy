import java.util.Scanner;

public class LeeTiposDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("ingresa tu edad: ");
        var edad = consola.nextInt();
        consola.nextLine();
        System.out.println("edad = " + edad);
        edad--;
        System.out.println("edad = " + edad);


        //conversion de datos

        System.out.print("proporciona un valor entero : ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);
        
        //pedir un valor de tipo float

        System.out.print("ingresa float: ");
        var floatt = Float.parseFloat(consola.nextLine());
        System.out.println("floatt = " + floatt);




    }
}
