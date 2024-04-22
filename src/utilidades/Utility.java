package utilidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
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

}
