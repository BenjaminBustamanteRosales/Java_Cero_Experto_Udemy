package aritmetica;


public class Aritmetica {
private int variable1;
private int variable2;

    public Aritmetica(){}

    public Aritmetica(int variable1, int variable2){
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    public void sumar(){
        var resultado = variable1 + variable2;
        System.out.println("resultado suma = " + resultado);
    }

    public void restar(){
       var resultado = variable1 - variable2;
    }

    public void multiplicar(){
        var resultado = variable1 * variable2;
    }

    public void dividir(){

        if(variable2 != 0){
         var resultado = variable1 / variable2;
        }else{
            System.out.println("no se puede dividir por cero");

        }
    }

    public int getVariable1(){
        return this.variable1;
    }

    public void setVariable1(int variable1){
        this.variable1 = variable1;
    }

    public int getVariable2(){
        return this.variable2;
    }

    public void setVariable2(int variable2){
        this.variable2 = variable2;
    }




}

