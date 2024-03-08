package Player;

import Interfaces.Play;

public class Audio extends Contents implements Play {
private boolean play;
private int volume;
private int duration;

    public Audio(String titles, MultimediaFormat format, boolean play, int volume, int duration) {
        super(titles, format);
        this.play = play;
        this.volume = volume;
        this.duration = duration;
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void Play() {
        for (int i = 0; i < duration; i++) {
            System.out.println("Playing audio: " + getTitles() + ", " + "Volume: " + numToExclamation() + " " + getVolume());
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
    public String numToExclamation() {
        String exclamation = "";
        for (int i = 0; i < volume; i++) {
            exclamation += "!";
        }
        return exclamation;
    }

}


