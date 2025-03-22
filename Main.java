import java.util.Scanner;

public class Main {
    private final static int WELCOME_MENU_LENGTH = 4;

    public static void main(String[] args) {
        // Adds some default songs to the song list at the start of the program.
        addDefaultSongs();

        switch (getWelcomeMenuChoice()){
            case 1:
            MusicLibrary.addNewSongToList();
            break;
            case 2:
            MusicLibrary.removeSongFromList();
            break;
            case 3:
            MusicLibrary.getSongsWithOverXStreams(-1);
            break;
            case 4:
            MusicLibrary.getSongsWithOverXStreams();
            break;
        };

    }

    // Keeps asking the user to enter a menu option until they enter an integer between 1 and 4
    public static int getWelcomeMenuChoice(){
        Scanner scanner = new Scanner(System.in);
        String menuText= "Please select the corresponding number (1-4) from the menu below:\n 1. Add a new song to the list of songs\n 2. Remove a song from the list of songs \n 3. Print a list of all the songs stored \n 4. Print a list of songs over a given number of streams";
        System.out.println("Welcome to Jo's Streaming Service!\nWhat would you like to do today?\n" + menuText);
        int choice = scanner.nextInt();
        while (choice < 1 || choice > WELCOME_MENU_LENGTH){
            System.out.println("You did not enter a valid number. " + menuText);
            choice = scanner.nextInt();
        }
        scanner.close();
        return choice;
    }

    public static void addDefaultSongs(){
        MusicLibrary.addNewSongToList("Baby", "Justin Bieber", 339757805);
        MusicLibrary.addNewSongToList("Tempo", "Valley", 404027);
        MusicLibrary.addNewSongToList("One Pound Fish", "OnePoundFishMan", 111429);
        MusicLibrary.addNewSongToList("Fireball", "Pitbull", 379472451);
        MusicLibrary.addNewSongToList("What You Know", "Two Door Cinema Club", 178230);
        MusicLibrary.addNewSongToList("Right Person Wrong Time", "Henry Moodie", 1043);
        MusicLibrary.addNewSongToList("Expresso", "Sabrina Carpenter", 34812);
        MusicLibrary.addNewSongToList("One Of Your Girls", "Troy Syivon", 486429);
        MusicLibrary.addNewSongToList("Passionfruit", "Drake", 0);
        MusicLibrary.addNewSongToList("BBL Drizzy", "Metro Boomin", 5672);
        MusicLibrary.addNewSongToList("Cowgirls", "Morgan Wallen", 2456821);
        MusicLibrary.addNewSongToList("I'll Be Here When You're Back", "Beaux", 142);

    }

}