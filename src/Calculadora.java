import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        var menu = false;

        System.out.println("---Calculadora---");
        while (!menu) {
            System.out.print("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    
                    """);
            System.out.print("Ingrese Opcion: ");
            var opcion = Integer.parseInt(consola.nextLine());

            if (opcion == 5) {
                menu = true;
                continue;
            }


            if (opcion <= 4 && opcion > 0) {
                System.out.print("Ingrese Primer num: ");
                var a = Double.parseDouble(consola.nextLine());
                System.out.print("Ingrese Segundo num: ");
                var b = Double.parseDouble(consola.nextLine());
                double resultado;
                switch (opcion) {
                    case 1 -> {
                        resultado = a + b;
                        System.out.printf("resultado suma: %.5f", resultado);
                    }
                    case 2 -> {
                        resultado = a - b;
                        System.out.printf("resultado resta: %.5f", resultado);
                    }
                    case 3 -> {
                        resultado = a * b;
                        System.out.printf("resultado multiplicasion: %.5f", resultado);
                    }
                    case 4 -> {
                        if (b != 0) {
                            resultado = a / b;
                            System.out.printf("resultado Division: %.5f", resultado);
                        } else {
                            System.out.println("no se puede dividir por cero, Syntax error");
                        }
                    }


                }
                ;


            }   else{
                System.out.println("Opcion invalida");

                }
        }}


}
