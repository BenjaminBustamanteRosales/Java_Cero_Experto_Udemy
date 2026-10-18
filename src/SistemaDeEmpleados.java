import java.util.Scanner;

public class SistemaDeEmpleados {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("ingrese Nombre: ");
        var nombre = consola.nextLine();
        System.out.println("\tnombre = " + nombre);
        System.out.print("ingresa Edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
        System.out.print("ingresa Salario= ");
        var salario = Double.parseDouble(consola.nextLine());
        System.out.println("salario = " + salario);
        System.out.print("Es jefe de departamento? ");
        var isJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        System.out.println("isJefeDepartamento = " + isJefeDepartamento);




    }
}
