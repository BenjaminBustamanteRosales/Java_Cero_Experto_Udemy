import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {

 var consola = new Scanner(System.in);


        System.out.print("Cuantos articulos compro?: ");
        var articulosComprados = Integer.parseInt(consola.nextLine());
        System.out.print("Es miembro? (true/false): ");
        var isMiembro = Boolean.parseBoolean(consola.nextLine());

        if( articulosComprados>= 10  &&  isMiembro ){
            System.out.println("Ud tiene acceso al dsc VIP de la tienda");
    }else {
            System.out.println("No tiene acceso al dsc Vip de la tienda");
        }
    }
}
