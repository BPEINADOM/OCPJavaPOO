import Domain.Model.Ejercicio3.MensajeroEmail;
import Domain.Model.Ejercicio3.MensajeroSMS;
import Domain.Model.Ejercicio3.Mensajero;
import Domain.Model.Ejercicio3.MensajeroDM;

public class MensajeroOCP {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        Mensajero mensajeroEmail = new MensajeroEmail();
        mensajeroEmail.enviar("Cordial saludo, te escribo por medio de un email.");

        System.out.println("*********************************************");

        Mensajero mensajeroSMS = new MensajeroSMS();
        mensajeroSMS.enviar("Cordial saludo, te escribo por medio de un SMS");

        System.out.println("*********************************************");

        Mensajero mensajeroDM = new MensajeroDM();
        mensajeroDM.enviar("Cordial saludo, te escribo por medio de DM");

        System.out.println("*********************************************");
    }
}
