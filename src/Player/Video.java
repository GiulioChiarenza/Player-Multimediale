package Player;

import Interfaces.Play;
import Interfaces.Show;

public class Video extends Contents implements Play, Show {
    private boolean play;
    private String volume;
    private double duration;
    private String brightness;

    public Video(String titles, MultimediaFormat format, boolean play, String volume, double duration, String brightness) {
        super(titles, format);
        this.play = play;
        this.volume = volume;
        this.duration = duration;
        this.brightness= brightness;
    }

    @Override
    public void Play() {

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
