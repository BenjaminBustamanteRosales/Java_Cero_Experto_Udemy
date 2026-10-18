public class SistemaDeReservaDeHoteles {
    public static void main(String[] args) {

      String nombreCompleto;
      int diasEstancia;
      double tarifaDiaria;
      boolean isVistaMar;

      nombreCompleto = "Juan Garcia";
      tarifaDiaria = 35000;
      isVistaMar = true;
      diasEstancia = 3;
        System.out.println("nombreCompleto = " + nombreCompleto);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("isVistaMar = " + isVistaMar);
        System.out.println("diasEstancia = " + diasEstancia);

        tarifaDiaria = 20000;
        isVistaMar = false;

        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("isVistaMar = " + isVistaMar);
    }



}
