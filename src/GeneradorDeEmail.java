public class GeneradorDeEmail {

    public static void main(String[] args) {
        String nombreCompleto = "        Ubaldo Acosta Soto";
        String Empresa = " mail udp";
        String Dominio = ".cl";

        var constructorEmail= new StringBuilder();

         var email= constructorEmail.append(nombreCompleto.trim().toLowerCase().replace(" ",".").concat("@"))
                 .append(Empresa.strip().replace(" ",".")).append(Dominio.strip().replace(" ","."));
        System.out.println("email = " + email);



    }
}
