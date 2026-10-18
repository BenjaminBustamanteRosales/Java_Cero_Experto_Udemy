public class CadenasIndices {

    public static void main(String[] args) {
        var cadena1= "hola";
        var cadena2 = new String("mundo");
        var cadena3 = cadena1 + " " + cadena2;
        
        var cadena4 = """
                hola
                mundo
                123
                """;

        System.out.println(cadena4);

        //indices de cadenas 

        int largo = cadena3.length();
        for (int i = 0; i< largo; i++){
            System.out.println("cadena3.charAt(i) = " + cadena3.charAt(i));

        }

        System.out.println("son iguales las cadenas?" );
        System.out.println(cadena1 == cadena2);

        System.out.println(cadena1.equals(cadena3));

        var nuevaCadena = cadena1.replace('o', 'z'); //todo caracter o sera z
        System.out.println("nuevaCadena = " + nuevaCadena);

        var mayus= nuevaCadena.toUpperCase();
        System.out.println("mayus = " + mayus);
        
        var min = nuevaCadena.toLowerCase();
        System.out.println("min = " + min);
        
        
        var nombreConEspacios = "   juan algo aa      ";
        System.out.println("nombreConEspacios.trim() = " + nombreConEspacios.trim());
        
        var cadenaSubIndice = cadena3.substring(0,4);
        System.out.println("cadenaSubIndice = " + cadenaSubIndice);
    }
}
