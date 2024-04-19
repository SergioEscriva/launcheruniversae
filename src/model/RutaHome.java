package model;

import org.json.JSONArray;


public class RutaHome {

    private JSONArray ImagenesHome, RutaImagenesHome, ImagenesHomeGrandes, RutaImagenesHomeGrandes;
    private String Nombre;

    public RutaHome(String Nombre, JSONArray ImagenesHome, JSONArray RutaImagenesHome, JSONArray ImagenesHomeGrandes, JSONArray RutaImagenesHomeGrandes) {
        this.Nombre = Nombre;
        this.ImagenesHome = ImagenesHome;
        this.RutaImagenesHome = RutaImagenesHome;
        this.ImagenesHomeGrandes = ImagenesHomeGrandes;
        this.RutaImagenesHomeGrandes = RutaImagenesHomeGrandes;
    }

    public String getNombre() {
        return Nombre;
    }

    public JSONArray getImagenesHome() {
        return ImagenesHome;
    }

    public JSONArray getRutaImagenesHome() {
        return RutaImagenesHome;
    }

    public JSONArray getImagenesHomeGrandes() {
        return ImagenesHomeGrandes;
    }

    public JSONArray getRutaImagenesHomeGrandes() {
        return RutaImagenesHomeGrandes;
    }

}
