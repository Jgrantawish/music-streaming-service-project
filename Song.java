public class Song {
    private String title; 
    private String artistName;
    private int totalStreams;

    public Song(String title, String artistName, int streams){
        this.title = title;
        this.artistName = artistName;
        this.totalStreams = streams;
    }

    public String getSongTitle(){
        return title;
    }  

    public String getArtistName(){
        return artistName;
    }  

    public int getTotalStreams(){
        return totalStreams;
    }  

    // Prints out all of the information about a song to the user
    public void displaySongToUser(){
        System.out.println("Song Title:" + title + "\nArtist Name:" + artistName + "\nCurrent Number of Plays:" + totalStreams);
    }
}