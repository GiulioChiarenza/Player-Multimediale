package Player;

import Interfaces.Play;
import Interfaces.Show;

public class Video extends Contents implements Play, Show {
    private boolean play;
    private int volume;
    private double duration;
    private int brightness;

    public Video(String titles, MultimediaFormat format, boolean play, int volume, double duration, int brightness) {
        super(titles, format);
        this.play = play;
        this.volume = volume;
        this.duration = duration;
        this.brightness= brightness;
    }

    public int getVolume() {
        return volume;
    }

    public int getBrightness() {
        return brightness;
    }

    @Override
    public void Play() {
        System.out.println("Playing video: " + getTitles() + getVolume() + getBrightness());
    }

    @Override
    public String TurnUpVolume() {
        return null;
    }

    @Override
    public String TurnDownVolume() {
        return null;
    }

    @Override
    public void Show() {

    }

    @Override
    public String IncreasesBrightness() {
        return null;
    }

    @Override
    public String DecreaseBrightness() {
        return null;
    }
}
