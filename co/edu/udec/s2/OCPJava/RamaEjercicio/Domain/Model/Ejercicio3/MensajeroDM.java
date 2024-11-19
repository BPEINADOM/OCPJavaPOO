package Domain.Model.Ejercicio3;

public class MensajeroDM extends Mensajero {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando DM...");
        System.out.println(mensaje);
    }

}