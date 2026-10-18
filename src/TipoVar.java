public class TipoVar {
    public static void main(String[] args) {
        System.out.println("uso de var");
        
        
        String nombre1= "Juan";
        System.out.println("nombre1 = " + nombre1);
        
        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);
        
        var edad = 30;
        System.out.println("edad = " + edad);

        var sueldo = 5000.59F; //var -> double -> float
        System.out.println("sueldo = " + sueldo);

        var esCasado = false;
        System.out.println("esCasado = " + esCasado);
        esCasado = true;
        System.out.println("esCasado = " + esCasado);





    }
}
