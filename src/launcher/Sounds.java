
import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class Sounds {

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

    public static void main(String[] args) {
        Clip sound = getSound("pasarPag.wav");
        playSound(sound);
    }

}
