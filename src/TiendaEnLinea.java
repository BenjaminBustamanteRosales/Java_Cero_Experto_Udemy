public class TiendaEnLinea {

    public static void main(String[] args) {
        String NombreProducto = "AdidasCampus00s";
        int Precio = 99990;
        int cantDisponible = 40;
        boolean dispVenta = true;

        System.out.println("NombreProducto = " + NombreProducto);
        System.out.println("Precio = " + Precio);
        System.out.println("cantDisponible = " + cantDisponible);
        System.out.println("dispVenta = " + dispVenta);

        System.out.println("No quedan Zapatillas AdidasCampus00s");

        cantDisponible = 0;
        dispVenta = false;

        System.out.println("cantDisponible = " + cantDisponible);
        System.out.println("dispVenta = " + dispVenta);

    }



}
