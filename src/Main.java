import Player.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to my player! ");
        Scanner scanner= new Scanner(System.in);

      Contents[] Contents = new Contents[5];
        System.out.println("Please choose the title and duration of the first media file (audio)");
        Contents[0]= new Audio(scanner.nextLine(), MultimediaFormat.MP3, false, 0, Integer.parseInt(scanner.nextLine()));
        System.out.println("please choose the title and duration of the second multimedia file (video)");
        Contents[1]= new Video(scanner.nextLine(), MultimediaFormat.MP4, false, 0, Integer.parseInt(scanner.nextLine()), 0);
        System.out.println("please choose the title and duration of the third multimedia file (video)");
        Contents[2]= new Video(scanner.nextLine(), MultimediaFormat.MP4, false, 0, Integer.parseInt(scanner.nextLine()), 0);
        System.out.println("please choose the title of the fourth multimedia file (img)");
        Contents[3]= new Image(scanner.nextLine(), MultimediaFormat.JPEG, 0, false);
        System.out.println("please choose the title of the last multimedia file (img)");
        Contents[4]= new Image(scanner.nextLine(), MultimediaFormat.JPEG, 0, false);


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
                    Audio audio = (Audio) selectedContent;
                    while (true) {
                        System.out.println("Enter 1 to turn up volume, 0 to turn down (or any other number to stop): ");
                        int num = Integer.parseInt(scanner.nextLine());
                        if (num == 1) {
                            audio.turnUpVolume();
                        } else if (num == 0) {
                            audio.turnDownVolume();
                        } else {
                            break;
                        }
                        System.out.println("Volume set to: " + audio.numToExclamation());
                    }
                    audio.Play();
                } else if (selectedContent instanceof Video) {
                    Video video = (Video) selectedContent;
                    while (true) {
                        System.out.println("Enter 1 to turn up volume, 0 to turn down (or any other number to stop): ");
                        int num = Integer.parseInt(scanner.nextLine());
                        if (num == 1) {
                            video.turnUpVolume();
                        } else if (num == 0) {
                            video.turnDownVolume();
                        } else {
                            break;
                        }
                        System.out.println("Volume set to: " + video.numToExclamation());

                        System.out.println("Enter 1 to increase brightness, 0 to decrease (or any other number to stop): ");
                        num = Integer.parseInt(scanner.nextLine());
                        if (num == 1) {
                            video.increaseBrightness();
                        } else if (num == 0) {
                            video.decreaseBrightness();
                        } else {
                            break;
                        }
                        System.out.println("Brightness set to: " + video.numToAsterisk());
                    }
                    video.Play();
                } else if (selectedContent instanceof Image) {
                    Image image = (Image) selectedContent;
                    while (true) {
                        System.out.println("Enter 1 to increase brightness, 0 to decrease (or any other number to stop): ");
                        int num = Integer.parseInt(scanner.nextLine());
                        if (num == 1) {
                            image.increaseBrightness();
                        } else if (num == 0) {
                            image.decreaseBrightness();
                        } else {
                            break;
                        }
                        System.out.println("Brightness set to: " + image.numToAsterisk());
                    }
                    image.Show();
                }
            } else if (select != 0) {
                System.out.println("Invalid choice. Try again.");
            }
        } while (select != 0);
    }
}