import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        //condicion ? exp1 : exp2
        var numero = 4;

        var resultado = (numero %2 == 0) ? "par" : "inpar";
        System.out.println("resultado = "+ numero + " es " + resultado);

        var num = 10;
         resultado = (num>0)? "positivo": (num<0)? "negativo" : "cero";

        System.out.println("num + resultado = " + num + resultado);
         
    }   

}
