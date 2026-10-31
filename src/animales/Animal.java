package animales;

public class Animal {
    protected void comer(){
        System.out.println("Como muchas veces al dia");
    }

    protected void dormir(){
        System.out.println("soy un animal y duermo");
    }
}



class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }
}

class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("-------------Ejemplo de herencia--------------");
        System.out.println("clase Padre+");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();

        System.out.println("Clase hija perro++");
        var perro1 = new Perro();
        perro1.hacerSonido();
        perro1.comer();
        perro1.dormir();
    }
}


