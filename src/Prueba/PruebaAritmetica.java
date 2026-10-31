package Prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {

    public static void main(String[] args) {
        var aritmetica1 = new Aritmetica(5,7);

        System.out.println("atributo operando 1: "+ aritmetica1.getVariable1());
        aritmetica1.setVariable1(10);

        aritmetica1.sumar();
        aritmetica1.restar();
        System.out.println(" ");

        var aritmetica2 = new Aritmetica(12,16);
        aritmetica2.sumar();
        aritmetica2.setVariable2(0);
        aritmetica2.dividir();

    }



}
