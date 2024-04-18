package model;

/**
 *
 * @author sergio
 */
public class Simulador {

    private String numeroSimulador, Titulo, Descripcion, Enlace;

    public Simulador(String numeroSimulador, String Titulo, String Descripcion, String Enlace) {
        this.numeroSimulador = numeroSimulador;
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.Enlace = Enlace;
    }

    public String getNumeroSimulador() {
        return numeroSimulador;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getEnlace() {
        return Enlace;
    }

}
