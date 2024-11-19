package Domain.Model.Ejercicio2;

public abstract class Documento {
    protected String nombre;

    public Documento(String nombre) {
        this.nombre = nombre;
    }

    public void exportar() {
        exportarFormato();
    }

    public abstract void exportarFormato();

    

}
