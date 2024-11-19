package Domain.Model.Ejercicio2;

public class DocumentoExcel extends Documento {

    public DocumentoExcel(String nombre) {
        super(nombre);
    }

    @Override
    public void exportarFormato() {
        System.out.println("Exportando el documento a formato Excel...");
        System.out.println(nombre + ".xlsx");
    }
}
