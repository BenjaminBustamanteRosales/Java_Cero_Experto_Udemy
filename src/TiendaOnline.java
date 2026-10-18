import java.util.Scanner;

public class TiendaOnline {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        //el programa considerara dinero con formato decimal (centavos)

        final var dsc10 = 0.10;
        final var dsc5 = 0.05;
        final var dsc0 = 0;

        System.out.println("---------TIENDA ONLINE------");

        System.out.print("Cuanto dinero gasto comprando?: ");
        var dineroGastadoUsuario = Float.parseFloat(consola.nextLine());
        System.out.print("Ud es miembro de la tienda (true/false)?: ");
        var isMiembroTienda = Boolean.parseBoolean(consola.nextLine());



        if(dineroGastadoUsuario>= 10000 && isMiembroTienda){
                var totaldsc10 = dineroGastadoUsuario * dsc10;
                System.out.println("\ttotaldsc10 = " + totaldsc10);
                var totalPagarNormalizado = dineroGastadoUsuario - totaldsc10;
                System.out.println("\ttotalPagarNormalizado = " + totalPagarNormalizado);

        }else if(isMiembroTienda){
                var totaldsc5 = dineroGastadoUsuario * dsc5;
                System.out.println("\ttotaldsc5 = " + totaldsc5);
                var totalPagarNormalizado = dineroGastadoUsuario - totaldsc5;
                System.out.println("\ttotalPagarNormalizado = " + totalPagarNormalizado);
        }else{
                System.out.println("\tdsc0 = " + dsc0);
                System.out.println("\ttotalPagarNormalizado= "+ dineroGastadoUsuario+ " ud no tiene dsc");
        }





    }
}
