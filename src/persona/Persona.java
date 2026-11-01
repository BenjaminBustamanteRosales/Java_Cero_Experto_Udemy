package persona;

public class Persona {
    public static int contadorPersonas = 0;
    private String nombre;
    private  String apellido;
    private int idPersona;

    public Persona(){
        Persona.contadorPersonas++;
        this.idPersona = Persona.contadorPersonas;
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        Persona.contadorPersonas++;
        this.idPersona = Persona.contadorPersonas;
    }

     @Override
     public String toString(){
        return "id: " + this.idPersona + " Nombre: " + this.nombre + ", Apellido: " + this.apellido;
     }

    public String getNombre() {
        return this.nombre;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public String getApellido(){
        return this.apellido;
    }

    public static int getContadorPersonas(){
        return contadorPersonas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

}
