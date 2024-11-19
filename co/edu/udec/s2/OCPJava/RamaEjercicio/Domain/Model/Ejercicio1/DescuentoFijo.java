package Domain.Model.Ejercicio1;

public class DescuentoFijo extends Descuento {
    private double descuentoFijo;

    public DescuentoFijo(double descuentoFijo) {
        this.descuentoFijo = descuentoFijo;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - descuentoFijo;
    }

}
