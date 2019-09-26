import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private String time;
    private String[] timeArr;
    private int num;
    private long duration;

    void process() throws InterruptedException {
        System.out.println("Alarm Clock");
        System.out.print("Enter the time you want to play alarm (sec, min, h):\nAfter ");
        time = in.nextLine();
        timeArr = time.split(" ");
        num = Integer.parseInt(timeArr[0]);
        switch (timeArr[1]) {
            case "sec":
                duration = num * 1000;
                break;
            case "min":
                duration = num * 1000 * 60;
                break;
            case "h":
                duration = num * 1000 * 60 * 60;
                break;
            default:
                System.out.println("Incorrect input!!!");
                break;
        }
        Thread.sleep(duration);
        try {
            File soundFile = new File("wav.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.setFramePosition(0);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000);
            clip.stop();
            clip.close();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        }
    }
}
