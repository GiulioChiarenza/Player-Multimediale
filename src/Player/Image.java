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

    @Override
    public void Show() {
        System.out.println("Showing image: " + getTitles() + getBrightness());
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
