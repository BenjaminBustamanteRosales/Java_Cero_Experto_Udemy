import java.util.Scanner;

public class AppCajeroAutomatico {
    public static void main(String[] args) {
var consola = new Scanner(System.in);
float saldo = 1000;
var menu = false;

        System.out.print("---Cajero Automatico---");


while (!menu){

    System.out.println("¿Que operacion desea realizar");
    System.out.println("1. Consultar Saldo");
    System.out.println("2. Retirar");
    System.out.println("3. Depositar");
    System.out.println("4. Salir");
    System.out.print("Ingrese Opcion: ");
        var opcion = Integer.parseInt(consola.nextLine());

        if(opcion == 1){
            System.out.printf("Su saldo es : %f ", saldo);
        } else if(opcion == 2){
            System.out.print("Cuanto desea retirar: ");
            var retiro = Float.parseFloat(consola.nextLine());
            saldo = saldo - retiro;
            System.out.printf("Su saldo es: %f", saldo);
        }else if(opcion == 3){
            System.out.print("Cuanto desea depositar: ");
            var deposito = Float.parseFloat(consola.nextLine());
            saldo  += deposito;
            System.out.printf("Su saldo es : %f ", saldo);
        }else if(opcion == 4){
            System.out.printf("Gracias por ocupar nuestro cajero ");
            menu = true;

        }else{
            System.out.println("Valor incorrecto, ingrese valor valido");
        }





}




    }




}
