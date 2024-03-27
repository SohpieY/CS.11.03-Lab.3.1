import java.util.Scanner;

public class TextBasedGame {
    //Creating the variables
    private static int timeRemaining = 100;
    private static String startLocation = "My Bakery";
    private static String deliveryClient = "Tombo";
    private static int distance = 6;
    private static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Kiki's delivery service!");
        System.out.println("\nKiki, a young witch-in-training, has to deliver a parcel to " + deliveryClient + " within " + timeRemaining + " minutes");
        System.out.println("\nWould you like to start your delivery? Press 1 to start, press 2 to quit");

        int firstAnswer = Integer.parseInt(kb.nextLine());

        if (firstAnswer == 1) {
            roundOne();
            checkRoundOne();
        } else if (firstAnswer == 2) {
            System.out.println("\nGoodbye!");
            return;
        } else {
            System.out.println("\nInvalid choice. Please input 1 or 2.");
            int invalidChoice = Integer.parseInt(kb.nextLine());
        }

        while (timeRemaining > 0) {
            int choice = Integer.parseInt(kb.nextLine());

        }
        System.out.println("You ran out of time! Better luck next time...");
        kb.close();
    }

    //Round one of questions
    public static void roundOne() {
        System.out.println("\nWelcome to the game! You are at the bakery, try to delivery the parcel to Tombo within 100 minutes.");
        System.out.println("\nYou are now " + distance + " km away from Tombo");
        System.out.println("---Round One---");
        System.out.println("1) Move Left");
        System.out.println("2) Move Right");
        System.out.println("3) Move Forward");
    }

    public static void checkRoundOne() {
        int choice = Integer.parseInt(kb.nextLine());
        if (choice == 1) {
            correctChoiceOne();
        } else if (choice == 2) {
            incorrectChoiceOne();
        } else if (choice == 3) {
            deadOne();

        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }
    public static void correctChoiceOne() {
        int oneDistance;
        int oneTime;
        oneDistance = distance - 3;
        oneTime = timeRemaining - 30;
        System.out.println("Great! You made the right choice");
        System.out.println("\nYou are now " + oneDistance + " km away from your destination");
        System.out.println("\nYou have " + oneTime + " minutes left. That is plenty of time!");
        roundTwo();
    }
    public static void incorrectChoiceOne() {
        int oneTime = timeRemaining - 60;
        int oneDistance = distance - 1;
        System.out.println("Uh oh, wrong choice... Your broom went out of control, and you bumped into a tree. Get up and try again.");
        System.out.println("\nYou only have " + oneTime + " minutes left. Hurry up!");
        System.out.println("\nYou are " + distance + " km away from Tombo");
        roundTwo();
    }

    public static int deadOne() {
        System.out.println("You flew too fast and the wind blew the parcel away. Guess you have to pay Tombo back!");
        return 0;
    }

    //Round two of questions
    public static void roundTwo(){
        System.out.println("One step closer to your client, Tombo!");
        System.out.println("---Round Two---");
        System.out.println("1) Move Up");
        System.out.println("2) Move Down");
        System.out.println("3) Move Forward");

        int choice = Integer.parseInt(kb.nextLine());
        if(choice == 1){
            deadTwo();
        }
        if(choice == 2){
            correctChoiceTwo();
        }
        else if(choice ==3){
            incorrectChoiceTwo();
        }
        else{
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public static int deadTwo(){
        System.out.println("You flew too fast and the wind blew the parcel away. Guess you have to pay Tombo back!");
        return 0;
    }

    public static void correctChoiceTwo(){
        int twoDistance;
        int twoTime;
        twoDistance = distance - 5;
        twoTime = timeRemaining - 30;
        System.out.println("Great! You made the right choice");
        System.out.println("\nYou are now " + twoDistance + " km away from your destination");
        System.out.println("\nYou have " + twoTime + " minutes left. Tombo is waiting for his parcel");

    }

    public static void incorrectChoiceTwo(){
        int twoTime = timeRemaining - 80;
        int twoDistance = distance - 2;
        System.out.println("Uh oh, wrong choice... Your broom went out of control, and you bumped into a tree. Get up and try again.");
        System.out.println("\nYou only have " + twoTime + " minutes left. The deadline is looming");
        System.out.println("\nYou are " + twoDistance + " km away from Tombo");
    }


    //Final round
    public static void roundThree(){
        System.out.println("You're almost at Tombo's location!");
        System.out.println("---Round Two---");
        System.out.println("1) Fly through the forest");
        System.out.println("2) Fly to the city");
        System.out.println("3) Fly above the river");

        int choice = Integer.parseInt(kb.nextLine());
        if(choice == 1){
            incorrectChoiceThree();
        }
        if(choice == 2){
            deadThree();
        }
        else if(choice ==3){
            correctChoiceThree();
        }
        else{
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public static int deadThree(){
        System.out.println("Uh oh...You flew too fast and the wind blew the parcel away. Guess you have to pay Tombo back!");
        return 0;
    }

    public static int incorrectChoiceThree(){
        int twoTime = timeRemaining - 100;
        int twoDistance = distance - 3;
        System.out.println("OH NO!!! Your hair got caught up in the trees, and your broom fell into the forest. Guess you are stuck here for a while.. ");
        return 0;
    }

    public static void correctChoiceThree(){
        int threeTime = timeRemaining - 60;
        int threeDistance = distance - 6;
        System.out.println("Great! You made the right choice!You completed the delivery with " + threeTime + " minutes left to spare.");
        System.out.println("\nYou arrived a Tombo's house and delivered his parcel to him. He happily thanks you and gives you a slice of chocolate cake!");
        System.out.println("\n Game completed, good bye!");

    }

}
