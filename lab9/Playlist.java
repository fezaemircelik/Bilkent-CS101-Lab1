import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    private String name;
    private String creator;
    private String genre;
    private ArrayList<Song> songs = new ArrayList<Song>();

    public Playlist(String Name, String Creator, String Genre, ArrayList<Song> Songs){
        setName(Name);
        setCreator(Creator);
        setGenre(Genre);
        setSongs(Songs);
    }

    public Playlist(){}


    public String getName(){
        return name;
    }
    public void setName(String x){
        name = x;
    }
    public String getCreator(){
        return creator;
    }
    public void setCreator(String x){
        creator = x;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String x){
        genre = x;
    }
    public ArrayList<Song> getSongs(){
        return songs;
    }
    public void setSongs(ArrayList<Song> x){
        songs = x;
    }

    public boolean songExists(Song x){      //checking if the song exists in the playlist or not
        for (int i = 0; i < songs.size(); i++){
            if (songs.get(i) == x){
                return true;
            }
        }
        return false;
    }

    public void addSong(Song x){            //adding a new song to the playlist
        if (songExists(x)){
            System.out.println("this song already exists.");
        }
        else{
            songs.add(x);
        }
    }

    public void removeSong(int x){          //removing a song choosen from its index
        if (x <= songs.size())
        songs.remove(x);
    }

    public void sortByDurationDesc(){       //sorting the songs by their duration (from highwst to lowest)
        Collections.sort(songs, Collections.reverseOrder());
    }

    public String toString(){

        String asd = "";
        for (Song element : songs){
            asd += element.toString() + "\n" + "--------------------------------------------------------" + "\n";
        }

        String output = "";
        output += "--------------------------------------------------------" + "\n";
        output += "Playlist Name: " + getName() + "\n";
        output += "Creator Name: " + getCreator() + "\n";
        output += "Genre: " + getGenre() + "\n";
        output += "--------------------------------------------------------" + "\n";
        output += asd;

        return output;
    }
}
