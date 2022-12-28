import java.util.ArrayList;
import java.util.Scanner;

public class MusicApp {
    public static void main(String[] args) {    

        ArrayList<Playlist> playlistList = new ArrayList<Playlist>();
        Scanner in = new Scanner(System.in);

        System.out.println("--------------------------------------------------------");
        System.out.println("Welcome to Music App! Get Ready to create your playlist!");

        int z = 1;
        while (z > 0){
            
            System.out.println("--------------------------------------------------------");
            System.out.println("1 - Create a new Playlist");
            System.out.println("2 - Display the Playlist");
            System.out.println("3 - Sort the Playlist");
            System.out.println("4 - Remove song by index from the current Playlist");
            System.out.println("5 - Display all Playlists");
            System.out.println("6 - Exit");
            System.out.println();

            int input = in.nextInt();

            if(input == 1){     //creating a new playlist

                Playlist playlist = new Playlist();

                System.out.println("How many songs do you want to add to playlist?: ");
                int songCount = in.nextInt();

                int i = 1;
                while (i <= songCount){
                    System.out.println("Enter artist name for Song " + i + ": ");
                    String artist = in.next();

                    System.out.println("Enter album name for Song " + i + ": ");
                    String album = in.next();

                    System.out.println("Enter song name for Song " + i + ": ");
                    String title = in.next();

                    System.out.println("Enter song duration in seconds for Song " + i + ": ");
                    int duration = in.nextInt();

                    System.out.println("Enter the times song has been played for Song " + i + ": ");
                    int timesPlayed = in.nextInt();

                    Song song = new Song(title, artist, album, duration, timesPlayed);
                    playlist.addSong(song);

                    i++;
                }

                System.out.println("Enter the playlist name: ");
                String playlistName = in.next();
                playlist.setName(playlistName);
                
                System.out.println("Enter creator of playlist: ");
                String creator = in.next();
                playlist.setCreator(creator);

                System.out.println("0-Country");
                System.out.println("1-Electronic");
                System.out.println("2-Pop Music");
                System.out.println("3-Rock Music");
                System.out.println("4-Jazz");
                System.out.println("5-Classical");
                System.out.println("Select genre of playlist: ");
                int genre = in.nextInt();

                if(genre == 0){
                        playlist.setGenre("County");
                }
                else if(genre == 1){
                    playlist.setGenre("Electronic");
                }
                else if(genre == 2){
                    playlist.setGenre("Pop Music");
                }
                else if(genre == 3){
                    playlist.setGenre("Rock Music");
                }
                else if(genre == 4){
                    playlist.setGenre("Jazz");
                }
                else if(genre == 5){
                    playlist.setGenre("Classical");
                }
                else{
                    System.out.println("There isn't any genre like that.");
                }
                playlistList.add(playlist);
            }

            else if (input == 2){       //displaying one of the playlists
                System.out.println("choose a playlist to display: ");
                int displayP = in.nextInt();
                System.out.println("Displaying the playlist: ");
                System.out.println(playlistList.get(displayP).toString());

            }

            else if (input == 3){       //sorting the playlists by their duration
//                System.out.println("Sorted playlists: ");

                for (Playlist playlist : playlistList){
                    playlist.sortByDurationDesc();
                }

//                System.out.println(playlistList.toString());      I am not sure if it is necessary

            }

            else if (input == 4){       //removing a song from a chosen playlist
                System.out.println("choose a playlist to remove song from ");
                int removeP = in.nextInt();
                System.out.println("and which song do you want to remove??? (remove by index)");
                int removeByIndex = in.nextInt();

                playlistList.get(removeP).removeSong(removeByIndex);;
            }

            else if (input == 5){       //showing all of the created playlists
                System.out.println("Displaying all: ");
                System.out.println(playlistList.toString());
            }

            else if (input == 6){       //ending the loop (exiting)
                z = -99;
            }
        }
        in.close();
    }
}
