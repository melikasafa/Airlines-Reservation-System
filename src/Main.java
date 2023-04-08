import java.util.* ;
public class Main {
    ////    static Scanner in = new Scanner(System.in);
////    static userinfo[] info = new userinfo[500];
////    // HashMap to store user information  ???????????????????????????????????????????????????????????
    static HashMap<String, String> users = new HashMap<>();
    public static void startMenu() {
        System.out.println("WELCOME TO AIRLINE RESERVATION SYSTEM");
        System.out.println("----------MENU OPTIONS----------");
        System.out.println("Please choose an option:");
        System.out.println();
        System.out.println("1-Sign in");
        System.out.println("2-Sign up");
    }
    public static void signUp() {
        System.out.println("enter your username:");
        String username;
        username = in.nextLine();
        while (users.containsKey(username)) {
            System.out.println("That username is already taken. Please enter another username");
            username = in.nextLine();
        }
        System.out.println("enter your password:");
        String password;
        password = in.nextLine();
        while (users.containsKey(password)) {
            System.out.println("That password is already taken. Please enter another password");
            password = in.nextLine();
        }
        int a = 0;
        info[a] = new userinfo();
        info[a].setPassword(password);
        info[a].setUsername(username);
        a++;
    }


    public static void signIn() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username:");
        String username = input.nextLine();

        System.out.println("Please enter your password:");
        String password = input.nextLine();

        if (username.equals("mlsafa") && password.equals("malika03")){
            adminMenu();
        }
        else if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Welcome, " + username + "!");
        } else {
            System.out.println("Incorrect username or password.");
        }
    }

    private static void adminMenu() {

    }


    public static void main(String[] args) {
        startMenu() ;
        Scanner in=new Scanner(System.in) ;
        int entery = in.nextInt();
        while (entery!=1 && entery!=2){
            System.out.println("Please enter correct number");
             entery = in.nextInt();
            userinfo[] information = new userinfo[500];
        }
        switch(entery) {
            case 1:
                signIn();
                break;
            case 2:
                signUp();
                signIn();
                break;
        }
    }



}
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    // HashMap to store user information
    static HashMap<String, String> users = new HashMap<>();
        static userinfo[] info = new userinfo[500];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Menu
            System.out.println("Please choose an option:");
            System.out.println("1. Sign In");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    signIn();
                    break;
                case 2:
                    signUp();
                    break;
                case 3:
                    System.out.println("Thank you for using our system.");
                    System.exit(0);
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
    }



}