package model;

import org.json.JSONArray;


public class RutaSimulador {

    private JSONArray Imagenes, RutaImagenes;

    private String numeroSimulador;

    public RutaSimulador(JSONArray RutaImagenes, String numeroSimulador) {
        this.Imagenes = Imagenes;
        this.RutaImagenes = RutaImagenes;
        this.numeroSimulador = numeroSimulador;
    }

    public JSONArray getImagenes() {
        return Imagenes;
    }

    public JSONArray getRutaImagenes() {
        return RutaImagenes;
    }

    public String getNumeroSimulador() {
        return numeroSimulador;
    }

}
