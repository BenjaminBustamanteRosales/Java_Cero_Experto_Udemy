import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        final var cuartoSinVistaMar= 150.50;
        final var cuartoConVistaMar= 190.50;

        System.out.print("Ingrese su nombre completo: ");
        var nombreCompleto = consola.nextLine();
        System.out.print("Cuantos dias se va a quedar?: ");
        var diasEstancia = Integer.parseInt(consola.nextLine());
        System.out.print("Quiere un cuarto con vista al Mar? (true/false): ");
        var isVistaMar = Boolean.parseBoolean(consola.nextLine());

        var costoTotal = (isVistaMar? "Su cuarto tiene vista a mar, debe pagar: " + diasEstancia * cuartoConVistaMar :
                "Su cuarto no tiene vista a mar. debe pagar: "+ diasEstancia*cuartoSinVistaMar);
        System.out.printf(costoTotal);







    }


}
