package Player;

import Interfaces.Show;

public class Image extends Contents implements Show {

    private int brightness;
    private boolean show;
    public Image(String titles, MultimediaFormat format, int brightness, boolean show) {
        super(titles, format);
        this.brightness= brightness;
        this.show= show;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public void Show() {
        for (int i = 0; i < brightness; i++) {
            System.out.println("Showing image: " + getTitles() + ", " + "Brightness: " + numToAsterisk() + " " + getBrightness());
        }
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
    public String numToAsterisk() {
        String asterisk = "";
        for (int i = 0; i < brightness; i++) {
            asterisk += "*";
        }
        return asterisk;
    }
}
