public class FormateoCadenas {
    public static void main(String[] args) {
        
        var nombre = "Matias";
        var edad = 35;
        var salario = 2100.490;
        
        //String.format
        //%s posicion donde se mostrara la variable nombre
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f"
                , nombre, edad, salario);
        System.out.println(mensaje);
        
        // formateo con text block

        var numEmpleado = 12;

        mensaje = """
             %nDetalle Persona:\s
             ----------------
             \tNombre: %s
             \tNo. Empleado: %04d
             \tEdad: %d años
             \tSalario: $%.2f
              
             """.formatted(nombre,numEmpleado, edad, salario);
        System.out.println(mensaje);



    }
}
