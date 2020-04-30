
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class jugando {
    public static void main(String[] args) {
        try {
            AudioFileFormat.Type[] tipos = AudioSystem.getAudioFileTypes();  
            for (AudioFileFormat.Type tipo : tipos) {
                System.out.println(tipo.getExtension());
            }
            
            Clip sonido = AudioSystem.getClip();
            File ficheroAudio = new File("C:\\Users\\Diego\\Desktop\\Clase\\_Programacion\\alert.wav");
            sonido.open(AudioSystem.getAudioInputStream(ficheroAudio));
            System.out.println("Inicio Reproducción");
           // sonido.loop(1);
           sonido.loop(Clip.LOOP_CONTINUOUSLY);
            while(!sonido.isRunning()) {
            System.out.println("Esperando...");
            Thread.sleep(10);
        }
            while(sonido.isRunning()){
                System.out.println("Reproduciendo...");
                Thread.sleep(1000);
            }
            
            sonido.close();
            System.out.println("Fin Reproducción");
        } catch (LineUnavailableException ex) {
            Logger.getLogger(jugando.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(jugando.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(jugando.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(jugando.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    
    private void aux2(){
        try {
            AudioFileFormat.Type[] tipos = AudioSystem.getAudioFileTypes();
            for (AudioFileFormat.Type tipo : tipos) {  
                System.out.println(tipo.getExtension());
            }
            Clip sonido = AudioSystem.getClip();
            File ficheroAudio = new File("C:\\Users\\Diego\\Desktop\\Clase\\_Programacion\\01. Lyn - BREAK IN TO BREAK OUT.wav");
            sonido.open(AudioSystem.getAudioInputStream(ficheroAudio));
            System.out.println("Inicio Reproducción");
            sonido.start();
            while(sonido.isRunning()) Thread.sleep(1000);
            System.out.println("Fin Reproducción");
            sonido.close();
            
            
                    } catch (LineUnavailableException ex) {
            Logger.getLogger(jugando.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(jugando.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(jugando.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(jugando.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
