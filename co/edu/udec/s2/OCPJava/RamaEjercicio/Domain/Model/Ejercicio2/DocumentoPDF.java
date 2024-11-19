package Domain.Model.Ejercicio2;

public class DocumentoPDF extends Documento {

    public DocumentoPDF(String nombre) {
        super(nombre);
    }

    @Override
    public void exportarFormato() {
        System.out.println("Exportando el documento a formato PDF...");
        System.out.println(nombre + ".PDF");
    }
    
}
