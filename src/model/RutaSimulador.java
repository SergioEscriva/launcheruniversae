package model;

/**
 *
 * @author sergio
 */
public class RutaSimulador {

    private String[] Imagenes, RutaImagenes;

    private String numeroSimulador;

    public RutaSimulador(String[] Imagenes, String[] RutaImagenes, String numeroSimulador) {
        this.Imagenes = Imagenes;
        this.RutaImagenes = RutaImagenes;
        this.numeroSimulador = numeroSimulador;
    }

    public String[] getImagenes() {
        return Imagenes;
    }

    public String[] getRutaImagenes() {
        return RutaImagenes;
    }

    public String getNumeroSimulador() {
        return numeroSimulador;
    }

}
