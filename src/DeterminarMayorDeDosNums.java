import java.util.Scanner;

public class DeterminarMayorDeDosNums {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("----¿Tus nums son iguales?----");




        while(true) {

            System.out.print("Ingrese su primer num: ");
            var a = Integer.parseInt(consola.nextLine());
            System.out.print("Ingrese su segundo num: ");
            var b = Integer.parseInt(consola.nextLine());

            if (a > b) {
                System.out.println("\tEl num: " + a + " es mayor");
            } else if (b > a) {
                System.out.println("\tEl num: " + b + " es mayor");
            } else {
                System.out.println("\tLos numeros son iguales");
            }


        }


    }




}
