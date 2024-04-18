package utilidades;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.RutaHome;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LectorRutaHome {

    //Leer array
    public ArrayList<RutaHome> jsonArray() throws JSONException {
        LectorRutaHome lector = new LectorRutaHome();

        String fichero = lector.leerFichero();
        String cadenaJson = fichero; //CDL.rowToString(fichero);

        JSONArray arregloJson = new JSONArray(cadenaJson);

        // Creamos la lista 
        ArrayList<RutaHome> arreglo = new ArrayList<>();

        // Iterar 
        for (int indice = 0; indice < arregloJson.length(); indice++) {

            // Obtener objeto a través del índice
            JSONObject datos = arregloJson.getJSONObject(indice);

            // Acceder a las Keys
            String Nombre = datos.getString("Nombre");
            JSONArray ImagenesHome = datos.getJSONArray("ImagenesHome");
            JSONArray RutaImagenesHome = datos.getJSONArray("RutaImagenesHome");
            JSONArray ImagenesHomeGrandes = datos.getJSONArray("ImagenesHomeGrandes");
            JSONArray RutaImagenesHomeGrandes = datos.getJSONArray("RutaImagenesHomeGrandes");

            // Luego de eso podemos crear la clase.
            RutaHome game = new RutaHome(Nombre, ImagenesHome, RutaImagenesHome, ImagenesHomeGrandes, RutaImagenesHomeGrandes);

            // Agregar a la lista
            arreglo.add(game);
        }

        return arreglo;
    }

    // leer Fichero
    private String leerFichero() {
        String fichero = "";

        try (BufferedReader br = new BufferedReader(new FileReader("src/json/datosLauncher.json"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return fichero;
    }

}
