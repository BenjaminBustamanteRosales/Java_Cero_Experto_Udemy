public class BusquedaDeSubCadena {

    public static void main(String[] args) {
        //indexOf devuelve el indice de la primera aparicion de la subcadena
        
        var cadena1 = "Hola Mundo";
        var cadena2 = "Java";
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        //reemplazar subcadenas
        
        var cadena =   "Hola Mundo";
        System.out.println("cadenaORIGINAL = " + cadena);
        
        var nuevaCadena = cadena.replace("Mundo", "Java");
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        var nuevaCadena2 = nuevaCadena.concat(" ").concat("Mundo");
        System.out.println("nuevaCadena = " + nuevaCadena2);

        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);

        var resultado= constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        var resultado2 = stringBuffer.toString();
        System.out.println("stringBuffer = " + resultado2);

        //join

        var resultado3 = String.join(" xx ", cadena1, cadena2, "ADIOS");
        System.out.println("resultado3 JOIN = " + resultado3);
    }
}
