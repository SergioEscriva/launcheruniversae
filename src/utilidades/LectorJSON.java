/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

public class LectorJSON {

    //public static void main(String[] args) throws JSONException, URISyntaxException {
    //  jsonArray();
    //}
    //Leer array
    public ArrayList<RutaHome> jsonArray() throws JSONException {
        LectorJSON lector = new LectorJSON();

        String fichero = lector.leerFichero();
        String cadenaJson = fichero; //CDL.rowToString(fichero);

        //String cadenaJson = "[{\"nombre\":\"Maggie\",\"edad\":3},{\"nombre\":\"Snowball\",\"edad\":1},{\"nombre\":\"Bichi\",\"edad\":1},{\"nombre\":\"Meca\",\"edad\":5}]";
        JSONArray arregloJson = new JSONArray(cadenaJson);

        // Nota: creamos la lista para ejemplos ilustrativos, no es necesaria
        ArrayList<RutaHome> games = new ArrayList<>();
        // Iterar 
        for (int indice = 0; indice < arregloJson.length(); indice++) {
            // Obtener objeto a través del índice
            JSONObject posibleGame = arregloJson.getJSONObject(indice);

            // Acceder como accedíamos al jsonObject
            String titulo = posibleGame.getString("titulo");
            String descripcion = posibleGame.getString("descripcion");
            String grado = posibleGame.getString("grado");
            String asignatura = posibleGame.getString("asignatura");
            String unidad = posibleGame.getString("unidad");
            String duracion = posibleGame.getString("duracion");
            String dificultad = posibleGame.getString("dificultad");

            // Luego de eso podemos crear la clase y obtener los beneficios
            // de la POO o usar los datos como nos plazca
            //RutaHome game = new RutaHome(titulo, descripcion, grado, asignatura, unidad, duracion, dificultad);
            // Podemos hacer lo que sea con el objeto
            //game.info();
            // Agregar a la lista, solo para ilustrar
            //games.add(game);
        }
        //System.out.println(games.get(1).getDescripcion());

        return games;
    }

    // leer Fichero
    private String leerFichero() {
        String fichero = "";

        try (BufferedReader br = new BufferedReader(new FileReader("src/json/games.json"))) {
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
