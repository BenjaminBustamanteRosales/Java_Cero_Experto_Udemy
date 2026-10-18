import java.util.Scanner;

public class SistemaDeAutentificacion {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        final var usuario = "admin";
        final var contraseña = "123";

        var usuario_contraseña = usuario + contraseña;

        System.out.print("Ingrese su Usuario: ");
        var usuarioCliente = consola.nextLine();
        System.out.print("Ingrese contraseña: ");
        var contraseñaCliente = consola.nextLine();

        var usuario_contraseñaCliente = (usuarioCliente + contraseñaCliente).strip();



        var validacion = usuario_contraseña.equals(usuario_contraseñaCliente);
        System.out.println("Acceso: "+ validacion);


    }



}
