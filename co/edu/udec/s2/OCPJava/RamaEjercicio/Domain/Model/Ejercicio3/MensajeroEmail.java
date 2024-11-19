package Domain.Model.Ejercicio3;

public class MensajeroEmail extends Mensajero {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Email...");
        System.out.println(mensaje);
    }
}
