import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
      int [] enteros = new int[5]  ;
      enteros[0] = 13;
      enteros[1] = 21;
      enteros[4] = 62;



        var consola = new Scanner(System.in);

        System.out.print("proporciona largo array: ");
        var largoArray = Integer.parseInt(consola.nextLine());

        var enterosArray = new int [largoArray];

        for(int i=0; i  <  largoArray; i++){
            System.out.print("Proporciona el valor indice " + i + " :");
            enterosArray[i] = Integer.parseInt(consola.nextLine());

        }

        for (int i=0 ; i<enterosArray.length; i++){
            System.out.println(" valores: " + enterosArray[i]);
        }

        var matriz = new int[][]
                {{100, 200, 300},
                {400, 500 , 600}};

    }
}
