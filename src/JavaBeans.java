import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
    var persona = new JavaBeansPersona();
    persona.setNombre("Karla");
    persona.setApellido("Lara");
        System.out.println("persona = " + persona);

    }
}


class JavaBeansPersona implements Serializable {
    private String nombre;
    private  String apellido;

    public JavaBeansPersona(){}

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}




