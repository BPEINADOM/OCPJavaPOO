import Domain.Model.Ejercicio2.Documento;
import Domain.Model.Ejercicio2.DocumentoExcel;
import Domain.Model.Ejercicio2.DocumentoPDF;
import Domain.Model.Ejercicio2.DocumentoWord;

public class DocumentoOCP {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");
        
        Documento documentoPDF = new DocumentoPDF("Actividad");
        documentoPDF.exportarFormato();

        System.out.println("*********************************************");

        Documento documentoWord = new DocumentoWord("Actividad");
        documentoWord.exportarFormato();

        System.out.println("*********************************************");

        Documento documentoExcel = new DocumentoExcel("Actividad");
        documentoExcel.exportarFormato();

        System.out.println("*********************************************");


    }
}
