package Player;

import Interfaces.Play;

public class Audio extends Contents implements Play {
private boolean play;
private String volume;
private double duration;

    public Audio(String titles, MultimediaFormat format, boolean play, String volume, double duration) {
        super(titles, format);
        this.play = play;
        this.volume = volume;
        this.duration = duration;
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


}

