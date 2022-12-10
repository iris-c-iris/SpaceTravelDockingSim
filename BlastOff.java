import java.util.Scanner;

/**
 * Boundary class creates array and print output
 * based on user input
 * prints menus and asks for user input
 *
 * @author  Iris Carrigg
 * @version 12/4/2022
 */
public class BlastOff {
    // instance variables
    public static int stars = -1;
    public static int warningCount = 0;
    public static String celestialChoice = "";

    public static void main( String[] args ) {

        Habitable[] celestialBody = new Habitable[ 7 ];

        //create objects puts them in an Habitable declared type
        celestialBody[ 0 ] = new ProximaCentaurib( "Proxima Centauri B", 4, 3, 238, true );
        celestialBody[ 1 ] = new Eunomia( "Eunomia", 3, 84, false);
        celestialBody[ 2 ] = new Nebula( false );
        celestialBody[ 3 ] = new Luytenb( "Luyten b", 12, 3, 452, true );
        celestialBody[ 4 ] = new Quasar( true );

        //print intial menu
        System.out.printf("%s%n%s%n","\u25A0".repeat(81),"\u25A0".repeat(81));
        System.out.print("\u25AA".repeat(14) + "\u25A0" + " ".repeat(22));
        System.out.printf("WELCOME%s%s%n%s%sto the Cosmic Exploration docking station%s%s%n%s%s at the Orion-Cygnus Arm of the Milky Way Galaxy!%s%s%n", " ".repeat(22),("\u25A0" +"\u25AA".repeat(14)), "\u25A0".repeat(15), " ".repeat(5), " ".repeat(5), "\u25A0".repeat(15), ("\u25AA".repeat(14) + "\u25A0")," ".repeat(1), " ", ("\u25A0" + "\u25AA".repeat(14)));
        System.out.print("\u25A0".repeat(15) + " \u25AA ".repeat(17) + "\u25A0".repeat(15));
        System.out.printf("%n%s%sThe space weather conditions %s%s%n%s%sin your local travel sphere this year%s%s%n%s%s allow for 23%% catalog navigational capability%s%s%n", ("\u25AA".repeat(14) + "\u25A0"), " ".repeat(13)," ".repeat(9), ("\u25A0" + "\u25AA".repeat(14)), "\u25A0".repeat(15), " ".repeat(7)," ".repeat(7),"\u25A0".repeat(15), ("\u25AA".repeat(14) + "\u25A0"), " ".repeat(3)," ".repeat(2),("\u25A0" + "\u25AA".repeat(14)));
        System.out.printf("%s%n%s%n","\u25A0".repeat(81),"\u25A0".repeat(81));

        //call method to get user input
        getUserInput();

        //check input for final output
        switch(celestialChoice)
        {
            case "q":
                System.out.println(celestialBody[4]);
                break;
            case "n":
                System.out.println(celestialBody[2]);
                break;
            case "p":
                System.out.println(celestialBody[0]);
                System.out.println(celestialBody[3]);
                break;
            case "a":
                System.out.println(celestialBody[1]);
                break;
            default:
                System.out.println("Bye!");
        }
    }

    /**
     * gets user initial input and prints menus
     * @param  none
     * @return void
     */
    public static void getUserInput(){
        //create Scanner object
        Scanner scnr = new Scanner(System.in);
        
        //check if this is the first time user is in menu
        if(warningCount == 0)
        {
            System.out.printf("%n%sPress ENTER/RETURN to begin your next journey%n%n", " ".repeat(18));
            scnr.nextLine();
        }

        if(warningCount == 0)
            printRocketMenu();

        //check what input to send to standard menu 
        String input = scnr.next();
        switch(input.trim().toLowerCase())
        {
            case "1":
                printStandardMenu(input);
                break;
            case "2":
                printStandardMenu(input);
                break;
            case "q":
                System.out.println("Your request has been canceled. We hope to see you back soon!");
                break;
            case "quit":
                System.out.println("Your request has been canceled. We hope to see you back soon!");
                break;
            default:
                warningCount++;
                System.out.printf("%n%n%n%n%s Please choose a valid option or type \"Q\" to Quit%s", "\u2605".repeat(10),"\u2605".repeat(10));
                System.out.printf("%n%s 1. Self Luminous%n%s 2. Not Self Luminous%n%s Q. Quit%n%n%n%n", " ".repeat(25), " ".repeat(25), " ".repeat(25));
                getUserInput();
        }
        scnr.close(); //close scanner input 
    }

    /**
     * prints stylized menu
     * @param  none
     * @return void
     */
    public static void printRocketMenu()
    {
        System.out.printf("          %s___%s%n        _________%n       (%s)%56s%n       |%s|%n       |%s%s%s|%n       |%s / \\ %s|%n       |%s / _ \\ %s|%n    _  |%s| ( ) |%s|  _%n   /%s\\ |%s|     |%s| /%s\\%n   |%s| |%s|     |%s| |%s|%n   |%s| |%s|  _  |%s| |%s|%35s%n   |%s| |%s| | | |%s| |%s|%n   |%s| |%s| | | |%s| |%s|%40s%n   |%s| |%s| | | |%s| |%s|%n   |%s| |/  | |  \\| |%s|%n   |%s|/    | |    \\|%s|%n   |%s/     |_|     \\%s|%n   |(_______________)|%n   |%s| |_|__|__|_| |%s|%n   |%s|   ( ) ( )   |%s|%n  /%s\\           /%s\\%n |||||||         |||||||%38s%n -------         -------%n  (~~~)           (~~~)%n", "\u256D","\u256E", "\u2505".repeat(9), "What type of celestial body would you like to visit?", "\u2505".repeat(9), "\u2505".repeat(4), "\u2312", "\u2505".repeat(4), "\u2505".repeat(2), "\u2505".repeat(2), "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "1. Self Luminous", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505","2. Not Self Luminous", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505", "\u2505","\u2505".repeat(3),"\u2505".repeat(3), "Type either \"1\" or \"2\" to choose..."  );  
    }

    /**
     * prints standard menu after rocket menu
     * @param  String
     * @return void
     */
    public static void printStandardMenu(String input)
    {
        Scanner kb = new Scanner(System.in);
        String choice;
        switch(input)
        {
            case "1":
                System.out.printf("What type of self luminous celestial would you like to visit?%n");
                System.out.printf("%n%s1. Quasar Free The Space Whales Festival%n%s2. Nebula Open Space Concert%n", " ".repeat(25)," ".repeat(25));
                choice = kb.next().trim().toLowerCase();
                printSpecificLuminousMenu(choice);                
                break;
            case "2":
                System.out.printf("What type of not luminous celestial would you like to visit?%n");
                System.out.printf("%n%s1. Planet%n%s2. Asteroid%n", " ".repeat(25)," ".repeat(25));
                choice = kb.next().trim().toLowerCase();
                printSpecificNonLuminousMenu(choice);                
                break;
        }
    }

    /**
     * prints specific menu about luminous celesital bodies
     * @param  String
     * @return void
     */
    public static String printSpecificLuminousMenu(String input)
    {
        celestialChoice = "";
        switch(input.trim().toLowerCase())
        {
            case "1":
                System.out.println("So, you chose Quasar Free The Space Whales Festival");
                System.out.println("Here's some information:");
                celestialChoice = "q";
                break;
            case "2":
                System.out.println("So, you chose Nebula Open Space Concert");
                System.out.println("Here's some information:");
                celestialChoice = "n";
                break;
            case "q":
                System.out.println("Your request has been canceled. We hope to see you back soon!");
                break;
            case "quit":
                System.out.println("Your request has been canceled. We hope to see you back soon!");
                break;
            default:
                System.out.printf("%n%n%n%n%s Please choose a valid option or type \"Q\" to Quit%s", "\u2605".repeat(10),"\u2605".repeat(10));
                printStandardMenu("1");
        }
        return celestialChoice;
    }

    /**
     * prints specific menu about non luminous celesital bodies
     * @param  String
     * @return void
     */
    public static String printSpecificNonLuminousMenu(String input)
    {        
        celestialChoice = "";
        switch(input.trim().toLowerCase())
        {
            case "1":
                System.out.println("So, you chose planet");
                System.out.println("These are the planets available for travel this year:");
                celestialChoice = "p";
                break;
            case "2":
                System.out.println("So, you chose asteroid");
                System.out.println("This is the asteroid available for travel this year:");
                celestialChoice = "a";
                break;
            case "q":
                System.out.println("Your request has been canceled. We hope to see you back soon!");
                break;
            case "quit":
                System.out.println("Your request has been canceled. We hope to see you back soon!");
                break;
            default:
                System.out.printf("%n%n%n%n%s Please choose a valid option or type \"Q\" to Quit%s", "\u2605".repeat(10),"\u2605".repeat(10));
                printStandardMenu("2");
        }
        return celestialChoice;
    }

}
