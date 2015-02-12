package Sound;

import java.applet.Applet;
import java.applet.AudioClip;

public class Sound {
    public static final AudioClip BACK = Applet.newAudioClip(Sound.class.getResource("Mission Impossible.wav"));
    public static final AudioClip GAMEOVER = Applet.newAudioClip(Sound.class.getResource("game_over.wav"));
    public static final AudioClip TERMINATED = Applet.newAudioClip(Sound.class.getResource("terminated.wav"));
}