package PruebaPersona;
import persona.Persona;

import java.util.Scanner;

public class PruebaPersona {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("contador: "+ Persona.contadorPersonas);

        var persona1 = new Persona("Jorge", "Gomez");
        System.out.println("Nombre y apellido persona 1: "
                + persona1.getNombre() + " " + persona1.getApellido());

        var persona2 = new Persona();
        System.out.print("Ingrese nombre persona2: ");
        persona2.setNombre(consola.nextLine());
        System.out.print("Ingrese apellido persona2: ");
        persona2.setApellido(consola.nextLine());

        System.out.println("Nombre y apellido persona 2: "
                + persona2.getNombre() + " " + persona2.getApellido());

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println("Personas creadas: " + Persona.contadorPersonas );
        System.out.println("contador: "+ Persona.contadorPersonas);
    }




}
