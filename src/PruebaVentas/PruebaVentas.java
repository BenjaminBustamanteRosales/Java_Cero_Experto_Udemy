package PruebaVentas;

import ventas.Orden;
import ventas.Producto;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("---Sistema de ventas---");
        
        var producto1 = new Producto("Blusa", 200.5);
        System.out.println("producto1 = " + producto1);
        
        var producto2 = new Producto("Adidas Campus 00s", 99990.0);
        System.out.println("producto2 = " + producto2);

        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        System.out.println(orden1);

        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Polera", 7990));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        System.out.println(orden2);
    }
}
