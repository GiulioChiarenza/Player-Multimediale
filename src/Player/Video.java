package Player;

import Interfaces.Play;
import Interfaces.Show;

public class Video extends Contents implements Play, Show {
    private boolean play;
    private int volume;
    private int duration;
    private int brightness;

    public Video(String titles, MultimediaFormat format, boolean play, int volume, int duration, int brightness) {
        super(titles, format);
        this.play = play;
        this.volume = volume;
        this.duration = duration;
        this.brightness= brightness;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public void Play() {
        for (int i = 0; i < duration; i++) {
            System.out.println("Playing video: " + getTitles() + ", " + "Volume: " + numToExclamation() + " " + getVolume() + ", " + "Brightness: " + numToAsterisk() + " " + getBrightness());
        }
    }

    @Override
    public void turnUpVolume() {
        if (volume < 10) {
            volume++;
        }

    }

    @Override
    public void turnDownVolume() {
        if (volume > 1) {
            volume--;
        }
    }

    @Override
    public void Show() {

    }

    @Override
    public void increaseBrightness() {
        if (brightness < 10) {
            brightness++;
        }
    }

    @Override
    public void decreaseBrightness() {
        if (brightness > 1) {
            brightness--;
        }
    }
    public String numToExclamation() {
        String exclamation = "";
        for (int i = 0; i < volume; i++) {
            exclamation += "!";
        }
        return exclamation;
    }
    public String numToAsterisk() {
        String asterisk = "";
        for (int i = 0; i < brightness; i++) {
            asterisk += "*";
        }
        return asterisk;
    }
}
