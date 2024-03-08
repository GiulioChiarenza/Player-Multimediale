import Player.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
      Player.Contents[] Contents = new Contents[5];
        Contents[0]= new Audio("audioTest", MultimediaFormat.MP3, false, "!!!!!", 2.31);
        Contents[1]= new Video("videoTest1", MultimediaFormat.MP4, false, "!!!!!", 5.42, "*****");
        Contents[2]= new Video("videoTest2", MultimediaFormat.MP4, false, "!!!!!", 7.28, "*****");
        Contents[3]= new Image("imagetest1", MultimediaFormat.JPEG, "*****", false);
        Contents[4]= new Image("imagetest2", MultimediaFormat.JPEG, "*****", false);



    }
}