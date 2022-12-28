public class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private String album;
    private int duration;
    private int timesPlayed;
    
    public Song(String Title, String Artist, String Album, int Duration, int TimesPlayed){
        setTitle(Title);
        setArtist(Artist);
        setAlbum(Album);
        setDuration(Duration);
        setTimesPlayed(TimesPlayed);
    }

    public int compareTo(Song song)         //helps us to compare the objects
    {
        if(duration < song.getDuration()){
            return -1;
        }
        else if(duration == song.getDuration()){
            return 0;
        }
        else{
            return 1;
        }
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String x){
        title = x;
    }
    public String getArtist(){
        return artist;
    }
    public void setArtist(String x){
        artist = x;
    }
    public String getAlbum(){
        return album;
    }
    public void setAlbum(String x){
        album = x;
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(int x){
        duration = x;
    }
    public int getTimesPlayed(){
        return timesPlayed;
    }
    public void setTimesPlayed(int x){
        timesPlayed = x;
    }

    public String toString(){
        String output = "";
        output += "Song Name: " + getTitle() + "\n";
        output += "Artist Name: " + getArtist() + "\n";
        output += "Album Name: " + getAlbum() + "\n";
        output += "Duration: " + getDuration() + "\n";
        output += "Times Played: " + getTimesPlayed() + "\n";

        return output;
    }
}
