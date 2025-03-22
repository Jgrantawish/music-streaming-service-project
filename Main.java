import java.util.Scanner;

public class Main {
    private final static int WELCOME_MENU_LENGTH = 4;

    public static void main(String[] args) {
        // Adds some default songs to the song list at the start of the program.
        addDefaultSongs();

        // Open the scanner for user input 
        Scanner scanner = new Scanner(System.in);
      

        // Get the selected menu option and call the corresponding function for that number  
        switch (getMenuChoice(scanner)){
            case 1:
            addUserEnteredSong(scanner);
            break;
            case 2:
            removeUserEnteredSong(scanner);
            break;
            case 3:
            MusicLibrary.getSongsWithOverXStreams(-1);
            break;
            case 4:
            getUserEnteredXStreamsSongs(scanner);
            break;
        };

        // Close out the scanner 
        scanner.close();

    }

    // Keeps asking the user to enter a menu option until they enter an integer between 1 and 4
    public static int getMenuChoice(Scanner scanner){
        String menuText= "Please select the corresponding number (1-4) from the menu below:\n 1. Add a new song to the list of songs\n 2. Remove a song from the list of songs \n 3. Print a list of all the songs stored \n 4. Print a list of songs over a given number of streams";
        System.out.println("Welcome to Jo's Streaming Service!\nWhat would you like to do today?\n" + menuText);
        int choice = scanner.nextInt();
        // Call nextLine to clear the newLine character in the scanner 
        scanner.nextLine();
        while (choice < 1 || choice > WELCOME_MENU_LENGTH){
            System.out.println("You did not enter a valid number. " + menuText);
            choice = scanner.nextInt();
            // Call nextLine to clear the newLine character in the scanner 
            scanner.nextLine();
        }
        return choice;
    }

    public static void addDefaultSongs(){
        MusicLibrary.addNewSongToList("Baby", "Justin Bieber", 339757805);
        MusicLibrary.addNewSongToList("Tempo", "Valley", 44027);
        MusicLibrary.addNewSongToList("One Pound Fish", "OnePoundFishMan", 111429);
        MusicLibrary.addNewSongToList("Fireball", "Pitbull", 379472451);
        MusicLibrary.addNewSongToList("What You Know", "Two Door Cinema Club", 178230);
        MusicLibrary.addNewSongToList("Right Person Wrong Time", "Henry Moodie", 1043);
        MusicLibrary.addNewSongToList("Expresso", "Sabrina Carpenter", 34812);
        MusicLibrary.addNewSongToList("One Of Your Girls", "Troy Sivan", 486429);
        MusicLibrary.addNewSongToList("Passionfruit", "Drake", 0);
        MusicLibrary.addNewSongToList("BBL Drizzy", "Metro Boomin", 5672);
        MusicLibrary.addNewSongToList("Cowgirls", "Morgan Wallen", 2456821);
        MusicLibrary.addNewSongToList("I'll Be Here When You're Back", "Beaux", 142);

    }

    public static void addUserEnteredSong(Scanner scanner){
        System.out.println("Please enter the title of the song you would like to add: ");
        String title = scanner.nextLine();
        System.out.println("Please enter the name of the artist who sang this song: ");
        String artist = scanner.nextLine();
        System.out.println("Please enter the current number of steams that this song has: ");
        int streamCount = scanner.nextInt();
        // Call nextLine to clear the newLine character in the scanner 
        scanner.nextLine();
        MusicLibrary.addNewSongToList(title, artist, streamCount);
        System.out.println(title + " has been added to your music library");
    }

    public static void removeUserEnteredSong(Scanner scanner){
        System.out.println("Please enter the title of the song you would like to remove: ");
        String title = scanner.nextLine();
        if (MusicLibrary.removeSongFromList(title)){
            System.out.println(title + " has been removed from your music library");
        } else{
            System.out.println("Uh oh! We could not find a song with that title and so the song was not removed from your music library");
        }
    }

    public static void getUserEnteredXStreamsSongs(Scanner scanner){
        System.out.println("Please enter the number of streams that we should fiter songs to have: ");
        int streamThreshold = scanner.nextInt();
        // Call nextLine to clear the newLine character in the scanner 
        scanner.nextLine();
        int totalSongsDisplayed = MusicLibrary.getSongsWithOverXStreams(streamThreshold);
        System.out.println("There are" + totalSongsDisplayed + "songs with more than " + streamThreshold + " streams.");
        
    }
}