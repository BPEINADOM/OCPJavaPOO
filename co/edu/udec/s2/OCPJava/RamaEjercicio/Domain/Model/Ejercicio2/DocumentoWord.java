package Domain.Model.Ejercicio2;

public class DocumentoWord extends Documento {

    public DocumentoWord(String nombre) {
        super(nombre);
    }

    @Override
    public void exportarFormato() {
        System.out.println("Exportando el documento a formato Word...");
        System.out.println(nombre + ".docx");
    }

}
