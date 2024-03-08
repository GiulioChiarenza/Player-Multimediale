import Player.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome! ");
        Scanner scanner= new Scanner(System.in);

      Contents[] Contents = new Contents[5];
        System.out.println("Please choose the title and duration of the first media file (audio)");
        Contents[0]= new Audio(scanner.nextLine(), MultimediaFormat.MP3, false, 5, Double.parseDouble(scanner.nextLine()));
        System.out.println("please choose the title and duration of the second multimedia file (video)");
        Contents[1]= new Video(scanner.nextLine(), MultimediaFormat.MP4, false, 5, Double.parseDouble(scanner.nextLine()), 5);
        System.out.println("please choose the title and duration of the third multimedia file (video)");
        Contents[2]= new Video(scanner.nextLine(), MultimediaFormat.MP4, false, 5, Double.parseDouble(scanner.nextLine()), 5);
        System.out.println("please choose the title of the fourth multimedia file (img)");
        Contents[3]= new Image(scanner.nextLine(), MultimediaFormat.JPEG, 5, false);
        System.out.println("please choose the title of the last multimedia file (img)");
        Contents[4]= new Image(scanner.nextLine(), MultimediaFormat.JPEG, 5, false);


        selectContent(Contents);
    }
    public static void selectContent(Contents[] contents){
        Scanner scanner= new Scanner(System.in);
        int select;
        do {
            System.out.println("Select the content to play or show:");
            for (int i = 0; i < contents.length; i++) {
                System.out.println((i + 1) + ". " + contents[i].getTitles() + "." + contents[i].getFormat());
            }
            System.out.println("0. STOP");

            select = Integer.parseInt(scanner.nextLine());

            if (select > 0 && select <= contents.length) {
                Contents selectedContent = contents[select - 1];
                if (selectedContent instanceof Audio) {
                    ((Audio) selectedContent).Play();
                } else if (selectedContent instanceof Video) {
                    ((Video) selectedContent).Play();
                } else if (selectedContent instanceof Image) {
                    ((Image) selectedContent).Show();
                }
            } else if (select != 0) {
                System.out.println("Invalid choice. Try again.");
            }
        } while (select != 0);
    }
}