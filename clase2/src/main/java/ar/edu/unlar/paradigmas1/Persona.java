package ar.edu.unlar.paradigmas1;

public abstract class Persona {
    private String apellido;
    private String nombre;
    private String documentoNumero;

    @Override
    public String toString() {
        return apellido + ", " + nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDocumentoNumero() {
        return documentoNumero;
    }

    public void setDocumentoNumero(String documentoNumero) {
        this.documentoNumero = documentoNumero;
    }

}
