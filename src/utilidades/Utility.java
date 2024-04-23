package utilidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author sergio
 */
// Ajusta la imagen al JLabel metodo propio sin librería
public class Utility {

    private int index = 0;

    private javax.swing.Timer timer;

    public JLabel SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT)
        );
        labelName.setIcon(icon);

        return labelName;

    }

    // Abrir panel cuerpo
    public static void showPanel(JPanel antiguo, JPanel nuevo) {
        nuevo.setSize(1540, 850);
        nuevo.setLocation(0, 0);
        antiguo.removeAll();
        antiguo.add(nuevo, BorderLayout.CENTER);
        antiguo.revalidate();
        antiguo.repaint();

    }

    public Boolean slowPrint(JTextArea texter, String message) {
        if (timer != null && timer.isRunning()) {
            return true;
        }
        index = 0;
        texter.setText("");

        timer = new javax.swing.Timer(50, new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texter.setText(texter.getText() + String.valueOf(message.charAt(index)));
                texter.setForeground(Color.white);

                index++;
                if (index >= message.length()) {
                    timer.stop();
                }
            }

        });
        timer.start();
        return true;
    }

    public void slowPrint1(JLabel texter, String message) {

        if (timer != null && timer.isRunning()) {
            return;
        }
        index = 0;
        texter.setText("");

        timer = new javax.swing.Timer(50, new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texter.setText(texter.getText() + String.valueOf(message.charAt(index)));
                texter.setForeground(Color.white);

                index++;
                if (index >= message.length()) {
                    timer.stop();
                }
            }

        });
        timer.start();

    }

    /**
     * Pausa la ejecución durante X segundos.
     *
     * @param segundos El número de segundos que se quiere esperar.
     */
    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Clip getSound(String files) {
        try {

            //Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
            //File file = new File(path + "src/sonidos/pasarPag.mp3");
            File file = new File("src/sonidos/" + files);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

            AudioFormat format = audioInputStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip sound = (Clip) AudioSystem.getLine(info);
            sound.open(audioInputStream);
            playSound(sound);
            return sound;
        } catch (Exception e) {
            return null;
        }
    }

    public static void playSound(Clip clip) {
        clip.stop();
        clip.setFramePosition(0);
        clip.start();
    }

    public String leerArchivoEstadisticas() {

        try {
            File myObj = new File("src/utilidades/estadistica.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                return data;

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }

    public String leerEstadistica(int grado) {
        //int grado = 5;
        String data = leerArchivoEstadisticas();
        int gradoGuardado = grado * 2;
        String estadistica1 = String.valueOf(data.charAt(gradoGuardado));
        estadistica1 += String.valueOf(data.charAt(gradoGuardado + 1));
        String estadisticaFinal = String.valueOf(Integer.valueOf(estadistica1));
        return estadisticaFinal;
    }

    public void escribirEstadistica(int grado) {
        //int grado = 5;
        String data = leerArchivoEstadisticas();
        int gradoGuardado = grado * 2;
        String estadistica1 = String.valueOf(data.charAt(gradoGuardado));
        estadistica1 += String.valueOf(data.charAt(gradoGuardado + 1));
        String estadisticaFinal = String.valueOf(Integer.valueOf(estadistica1) + 1);
        // Reemplaza la estadística del grado
        String original = data;
        int x = gradoGuardado;// indice del caracter a reemplazar(empieza a contar en cero)
        String nuevo = new StringBuilder(original).replace(x, x + 1, estadisticaFinal).toString();// nueva cadena reemplazando el caracter x
        nuevo = new StringBuilder(nuevo).delete(x + 2, x + 3).toString();// borra el segundo caracter, que ya hemos introducido antes.

        try {
            FileWriter myWriter = new FileWriter("src/utilidades/estadistica.txt");
            myWriter.write(nuevo);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
