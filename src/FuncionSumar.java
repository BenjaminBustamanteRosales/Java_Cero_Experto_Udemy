import java.util.Scanner;

public class FuncionSumar {

    static int sumar (int a, int b){
        var resultado = a + b;
        return resultado;
    }

    static boolean esPar(int numero){
        return (numero%2==0)? true : false ;
    }


    public static void main(String[] args) {
       int arg1 = 3, arg2 = 8 ;
       var resultadoFuncion = sumar(10, 2);
        System.out.print("dame tu numero para ver si es par: ");
        var isNumeroPar = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println("numero = " +  esPar(isNumeroPar));


    }

}
