package Player;

import Interfaces.Play;
import Interfaces.Show;

public abstract class Contents {

    private String titles;
    private MultimediaFormat format;


    public Contents (String titles, MultimediaFormat format){
        this.titles= titles;
        this.format= format;
    }


    public String getTitles() {
        return titles;
    }

    public MultimediaFormat getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "Contents{" +
                "titles='" + titles + '\'' +
                ", format=" + format +
                '}';
    }

}
