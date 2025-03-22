import java.util.ArrayList;

public class MusicLibrary {
    private static ArrayList<Song> allSongs = new ArrayList<>();

    // Adds a new song to the allSongs list based on the parameters passed in
    public static void addNewSongToList(String title, String artistName, int streams){
        Song newSong = new Song(title, artistName, streams);
        allSongs.add(newSong);
    }

    // Returns true if a song by that title was found and removed from the list and false if no song was removed
    public static boolean removeSongFromList(String songTitle){
        Song song = findSongByTitle(songTitle);
        boolean removed = false;
        if (song != null) {
            allSongs.remove(song);
            removed = true;
        }
        return removed;
    }

    // Iterates through the allSongs list and checks whether each song has a total number of steams greater than the integer passed in
    // If a song has more than 'x' streams, it prints the information about that song to the user
    // Returns the total number of songs that it has displayed  
    public static int getSongsWithOverXStreams(int x){
        int songsOverXStreams = 0; 
        for (Song song : allSongs) {
            if (song.getTotalStreams() > x){
                song.displaySongToUser();
                songsOverXStreams ++;
            }
        }
        return songsOverXStreams;
    }

    // Returns the song with the song title that was passed in
    // Returns null if a song with the passed in title is not found
    private static Song findSongByTitle(String title){
        Song foundSong = null;
        for (Song song : allSongs) {
            if (song.getSongTitle().equals(title)){
                foundSong = song;
                break;
            }
        }
        return foundSong;
    }
    
}