package utilidades;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LectorRutaSimulador {

    //Leer array
    public ArrayList<String> jsonArray() throws JSONException {
        LectorRutaSimulador lector = new LectorRutaSimulador();

        String fichero = lector.leerFichero();
        String cadenaJson = fichero; //CDL.rowToString(fichero);

        JSONArray arregloJson = new JSONArray(cadenaJson);

        // Creamos la lista 
        ArrayList<String> arreglo = new ArrayList<>();

        // Iterar 
        for (int indice = 0; indice < 1; indice++) {  // cambiar 1 por arregloJson.length()

            // Obtener objeto a través del índice
            JSONObject datos = arregloJson.getJSONObject(indice);

            // Variable Simulador?
            String simuladorNumero = "";
            String ruta = "";
            for (int y = 1; y <= 6; y++) {
                simuladorNumero = String.format("Simulador%s", y);
                // Acceder a las Keys
                JSONObject numeroSimulador = datos.getJSONObject(simuladorNumero);
                String rutaImagenes = numeroSimulador.getString("RutaImagenes");
                // Acceso a las rutas de las imágenes
                // Agregar a la lista
                arreglo.add(rutaImagenes);
            }

            System.out.println("AWAWA " + arreglo);
            //arreglo = arreglo;
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
