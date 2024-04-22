package model;


public class Simulador {

    private String NombreSimulador, Titulo, Descripcion, Enlace;

    public Simulador(String NombreSimulador, String Titulo, String Descripcion, String Enlace) {
        this.NombreSimulador = NombreSimulador;
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.Enlace = Enlace;
    }

    public String getNombreSimulador() {
        return NombreSimulador;
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
