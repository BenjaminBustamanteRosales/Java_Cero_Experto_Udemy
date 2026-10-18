import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("---¿Su numero se encuentra entre 0 y 5?---");
    var consola = new Scanner(System.in);


        System.out.print("ingrese numero a: ");
        var a = Float.parseFloat(consola.nextLine());


        if(a>=0 && a<=5){
            System.out.println("Su numero a  = " + a + " se encuentra entre 0 y 5");

        }else{
            System.out.println("no se encuentra en el rango");
        }




    }
}
