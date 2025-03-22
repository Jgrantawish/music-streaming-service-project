import java.util.Scanner;

public class Main {
    private final static int WELCOME_MENU_LENGTH = 4;

    public static void main(String[] args) {
     getWelcomeMenuChoice();

    }

    // Keeps asking the user to enter a menu option until they enter an integer between 1 and 4. 
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

}