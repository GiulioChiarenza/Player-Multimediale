package Player;

import Interfaces.Show;

public class Image extends Contents implements Show {

    private String brightness;
    private boolean show;
    public Image(String titles, MultimediaFormat format, String brightness, boolean show) {
        super(titles, format);
        this.brightness= brightness;
        this.show= show;
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
