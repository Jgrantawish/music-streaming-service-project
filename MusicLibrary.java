import java.util.ArrayList;

public class MusicLibrary {
    private static ArrayList<Song> allSongs;

    // Adds a new song to the allSongs list based on the parameters passed in
    public static void addNewSongToList(String title, String artistName, int streams){
        Song newSong = new Song(title, artistName, streams);
        allSongs.add(newSong);
    }

    // Removes a song from the allSongs list
    public static void removeSongFromList(String songTitle){
        Song song = findSongByTitle(songTitle);
        if (song != null) {
            allSongs.remove(song);
        }
    }

    // Iterates through the allSongs list and checks whether each song has a total number of steams greater than the integer passed in
    // If a song has more than 'x' streams, it prints the information about that song to the user
    public static void getSongsWithOverXStreams(int x){
        for (Song song : allSongs) {
            if (song.getTotalStreams() > x){
                song.displaySongToUser();
            }
        }
    }

    // Returns the song with the song title that was passed in
    // Returns null if a song with the passed in title is not found
    private static Song findSongByTitle(String title){
        Song foundSong = null;
        for (Song song : allSongs) {
            if (song.getSongTitle() == title){
                foundSong = song;
                break;
            }
        }
        return foundSong;
    }
    
}