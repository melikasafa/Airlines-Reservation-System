import java.util.* ;

public class User {
    static Scanner scanner = new Scanner(System.in);

    static User[] users = new User[20];
    static int userCount = 0;

    private String username;
    private String password;
    public static float charge;

    public float getCharge() {
        return charge;
    }

    public void setCharge(float charge) {
        this.charge = charge;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
        this.username = username;
        this.password = password;
    }



    public static void loginMenu() {
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
                    usersMenu();
                    break;
                case 3:
                    adminSignIn();
                    adminMenu();
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    static void signUp() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = new User(username,password);
        // save users in array ;
        users[userCount] = user;
        userCount++;

        System.out.println("Registration successful , please sign in");
        System.out.println();
    }

    static void signIn() {
        System.out.print("Enter username: ");
        String username = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();

        boolean found = false;
        //
        for (User user : users) {
            if (user == null) {
                break;
            }

            if (user.username.equals(username) && user.password.equals(password)) {
                System.out.println("Sign in successful");
                System.out.println();
//                usersMenu();
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Invalid username or password");
    }

    static void signOut() {
        System.out.println("Press '0' to sign out:");
        String inputSignOut = scanner.next();
        if (inputSignOut.equalsIgnoreCase("0")) {
            System.out.println("Sign out successful!");
            System.out.println();
        } else {
            System.out.println("Invalid input. Sign out failed.");
        }
        loginMenu();
    }

    public static void changePassword() {
        System.out.print("Enter your username: ");
        String username = scanner.next();

        System.out.print("Enter your old password: ");
        String oldPassword = scanner.next();

        System.out.print("Enter your new password: ");
        String newPassword = scanner.next();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(oldPassword)) {
                user.setPassword(newPassword);
                System.out.println("Password changed successfully!");
                return;
            }
        }

        System.out.println("Invalid username or password!");
    }


    public static void adminMenuOptions () {
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
    }

    public static void adminMenu() {
        adminMenuOptions();

        int option = scanner.nextInt();
        FlightTable add = new FlightTable();
        add.flightTable();

        while(option!=0) {

            switch (option) {
                case 1:
                    add.addFlight();
                    break;
                case 2:
                    add.updateFlight();
                    break;
                case 3:
                    add.removeFlight();
                    break;
                case 4:
                    add.viewFlightSchedules();
                    break;
                default:
                    System.out.println("Invalid try again");
                    break;
            }
           adminMenuOptions();
            option = scanner.nextInt();
        }
        signOut();
    }

    public static void adminSignIn() {
        boolean check = false;
        System.out.print("Enter Admin Username: ");
        String username = scanner.next();

        System.out.print("Enter Admin Password: ");
        String password = scanner.next();
        if (username.equals("Admin") && password.equals("Admin"))
            System.out.println("Admin sign in successful");
        else {
            check = true;
            while (check) {
                System.out.println("Invalid input , please re-enter :");
                System.out.print("Enter Admin Username: ");
                username = scanner.next();

                System.out.print("Enter Admin Password: ");
                password = scanner.next();
                if (username.equals("Admin") && password.equals("Admin")) {
                    System.out.println("Admin sign in successful");
                    check = false;
                }
            }
        }
    }
 public static void userMenuOption() {
     System.out.println("-----PASSENGER MENU OPTION-----");
     System.out.println("................................");
     System.out.println("Enter your choice: ");
     System.out.println("0-Sign out");
     System.out.println("1-Change Password");
//        System.out.println("2-Search Flight Ticket");
     System.out.println("3-Booking Ticket") ;
     System.out.println("4-Ticket Cancellation");
     System.out.println("5-Booked Tickets");
     System.out.println("6-Add charge");
 }
    public static void usersMenu() {
        userMenuOption();

        int opt = scanner.nextInt();

        boolean exit = true;
        FlightTable ticket = new FlightTable();
        Ticket booked = new Ticket();

        while (opt!=0) {

            switch (opt) {
                case 1:
                    changePassword();
                    break;
//            case 2:
//                searchFlightTicket();
////                break;
            case 3:
               booked.bookingTicket();
                break;
            case 4:
                booked.CancellationTicket();
                break;
                case 5:
                    ticket.bookedTickets();
                    break;
                case 6:
                    addCharge();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            userMenuOption();
            opt = scanner.nextInt();
        }
        signOut();
        }


    public static void addCharge() {
        System.out.println("your charge is :  " + charge);
        System.out.println("Please enter amount of charge you want add to your account: ");
        float newCharge  = scanner.nextInt();
        System.out.println(newCharge + " added to your account");
        charge +=newCharge ;
        System.out.println("your charge is :  "+ charge);
        System.out.println();
    }


}
