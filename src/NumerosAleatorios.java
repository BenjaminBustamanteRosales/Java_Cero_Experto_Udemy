import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {


            System.out.println("Numeros Aleatorios");
            var random = new Random();

            //entre 0 y 9
            var numAleatorio = random.nextInt(10);
            System.out.println("numAleatorio = " + numAleatorio);

            //entre 1 y 10

        numAleatorio = random.nextInt(10) + 1;
        
        // entre 0.0 y 1.0
        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        Integer contador = 0;

        // simular dado
        while(contador<10) {
            var dado = random.nextInt(6) + 1;
            System.out.println("dado = " + dado);
            contador++;
        }
        
        
        
        
    }
}
