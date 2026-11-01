package animales;

public class Animal {
    protected void hacerSonido(){
    }
}

    class Perro extends Animal{
        protected void hacerSonido(){
            System.out.println("El perro hace wauf");
        }

    }

    class Gato extends Animal{
            protected void hacerSonido(){
            System.out.println("El gato hace miau");
        }
    }


        class PruebaAnimal{
        //metodo poliformismo
        static void imprimirSonido(Animal animal){
            animal.hacerSonido();
        }

                public static void main(String[] args) {
                var animal = new Perro();
                var animalGato = new Gato();
                imprimirSonido(animal);
                imprimirSonido(animalGato);
                }
}


