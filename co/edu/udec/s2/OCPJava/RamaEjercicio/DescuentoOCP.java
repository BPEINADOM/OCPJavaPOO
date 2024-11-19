import Domain.Model.Ejercicio1.Descuento;
import Domain.Model.Ejercicio1.DescuentoFijo;
import Domain.Model.Ejercicio1.DescuentoPorcentaje;

public class DescuentoOCP {

    public static void main(String[] args) {
        
        double precioOriginal = 250000.0;

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        // Aplicando el descuento porcentual
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(25);
        double precioDescuentoPorcentaje = descuentoPorcentaje.aplicarDescuento(precioOriginal);
        System.out.println("Precio con descuento porcentual: " + precioDescuentoPorcentaje);

        // Aplicando el descuento fijo
        Descuento descuentoFijo = new DescuentoFijo(100);
        double precioDescuentoFijo = descuentoFijo.aplicarDescuento(precioDescuentoPorcentaje);
        System.out.println("Precio con descuento fijo: " + precioDescuentoFijo);

        System.out.println("*********************************************");

    }
}
