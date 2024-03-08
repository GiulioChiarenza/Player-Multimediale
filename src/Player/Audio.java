package Player;

import Interfaces.Play;

public class Audio extends Contents implements Play {
private boolean play;
private int volume;
private double duration;

    public Audio(String titles, MultimediaFormat format, boolean play, int volume, double duration) {
        super(titles, format);
        this.play = play;
        this.volume = volume;
        this.duration = duration;
    }
    public int getVolume() {
        return volume;
    }
    @Override
    public void Play() {
        System.out.println("Playing audio: " + getTitles() + getVolume());
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


