import java.util.* ;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    static User[] users = new User[100];
    static int userCount = 0;

    public static void main(String[] args) {
        startMenu();

        while (true) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Admin Sign In");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    signUp();
                    break;
                case 2:
                    signIn();
//                    usersMenu();
                    break;
                case 3:
                    adminSignIn();
                    adminMenu();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

//    private static void usersMenu() {
//        System.out.println("-----PASSENGER MENU OPTION-----");
//        System.out.println("................................");
//        System.out.println("Enter your choice: ");
//        System.out.println("1-Change Password");
//        System.out.println("2-Search Flight Ticket");
//        System.out.println("3-Booking Ticket");
//        System.out.println("4-Ticket Cancellation");
//        System.out.println("5-Booked Tickets");
//        System.out.println("6-Add charge");
//        System.out.println("0-Sign out");
//        int opt = scanner.nextInt() ;
//        switch (opt){
//            case 0 :
//                signOut();
//                break;
//            case 1:
//                changePasssword();
//                break;
//            case 2:
//                searchflightTicket();
//                break;
//            case 3:
//                bookingTicket();
//                break;
//            case 4:
//                ticketCancellation();
//                break;
//            case 5:
//                bookedtickets();
//                break;
//            case 6:
//                addcharge();
//                break;
//            default:
//                System.out.println("Invalid Input");
//                break;
//        }
//
//    }

    private static void adminSignIn() {
        boolean check = false ;
        System.out.print("Enter Admin Username: ");
        String username = scanner.next();

        System.out.print("Enter Admin Password: ");
        String password = scanner.next();
        if (username.equals("mlsafa") && password.equals("12345"))
            System.out.println("Admin sign in successful");
        else {
            check = true ;
            while (check) {
                System.out.println("Invalid input , please re-enter :");
                System.out.print("Enter Admin Username: ");
                 username = scanner.next();

                System.out.print("Enter Admin Password: ");
                password = scanner.next();
                if (username.equals("mlsafa") && password.equals("12345")) {
                    System.out.println("Admin sign in successful");
                    check = false;
                }
            }
        }
    }

    private static void adminMenu() {
        System.out.println();
        System.out.println();
        System.out.println("-----ADMIN OPTION MENU-----");
        System.out.println("............................");
        System.out.println("Enter your choice: ");
        System.out.println("1-Add");
        System.out.println("2-Update");
        System.out.println("3-Remove");
        System.out.println("4-Flight Schedules");
        System.out.println("0-Sign Out");

        int option = scanner.nextInt();

        switch (option){
            case 0:
                signOut();
                break;
            case 1:
                addFlight();
                break;
            case 2:
                updateFlight();
                break;
            case 3:
                removeFlight();
                break;
            case 4:
                flightSchedules();
                break;
            default:
                break;

        }
    }

    private static void removeFlight() {
    }
    private static void addFlight() {
    }

    private static void updateFlight() {
    }

    private static void flightSchedules() {
    }

    static void signUp() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = new User();
        users[userCount] = user;
        userCount++;

        System.out.println("Registration successful");
    }

    static void signOut() {
        System.out.println("Press '0' to sign out:");
        String inputSignOut = scanner.next();

        if (inputSignOut.equalsIgnoreCase("0")) {
            System.out.println("Sign out successful!");
        } else {
            System.out.println("Invalid input. Sign out failed.");
        }
    }

    static void signIn() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean found = false;
        for (User user : users) {
            if (user == null) {
                break;
            }


            if (username.equals(username) && password.equals(password)) {
                System.out.println("Sign in successful");
                found = true;
                signOut();
                break;
            }
        }

        if (!found)
            System.out.println("Invalid username or password");
    }

    public static void startMenu() {
        System.out.println("WELCOME TO AIRLINE RESERVATION SYSTEM");
        System.out.println("----------MENU OPTIONS----------");
    }



}

