import java.util.* ;

public class User {
    static Scanner scanner = new Scanner(System.in);

    static User[] users = new User[20];
    static int userCount = 0;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        option2();
    }


    static void signIn() {
//        System.out.println("ddd");
        System.out.print("Enter username: ");
        String username = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();

        if (username.equals("Admin") && password.equals("Admin")) {
            System.out.println("Admin sign in successful");
        adminMenu();
    }
        else {
            boolean found = false;
            for (User user : users) {
                if (user == null) {
                    break;
                }

                if (username.equals(username) && password.equals(password)) {
                    System.out.println("Sign in successful");
                    usersMenu();
                    found = true;
                    break;
                }
            }

            if (!found)
                System.out.println("Invalid username or password");
            //  signIn();
        }
    }


    public static void adminMenu() {
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
        FlightTable addtable = new FlightTable();
        addtable.flightTable();
//        while (option != 0) {
        switch (option) {
            case 0:
                signOut();
                break;
            case 1:
                addtable.addflight();
                break;
            case 2:
                addtable.updateFlight();
                break;
            case 3:
                addtable.removeFlight();
                break;
            case 4:
                addtable.viewflightschedules();
                break;
            default:
                System.out.println("Invalid try again");
                break;
        }
//        System.out.println("1. Add\n2. Update\n3. Remove\n4. Flight Schedules\n0. Sign out");
//        option = scanner.nextInt();
    }

//        if (option == 0)
//            signOut();
//    }

//    public static void adminSignIn() {
//        boolean check = false;
//        System.out.print("Enter Admin Username: ");
//        String username = scanner.next();
//
//        System.out.print("Enter Admin Password: ");
//        String password = scanner.next();
//        if (username.equals("Admin") && password.equals("Admin"))
//            System.out.println("Admin sign in successful");
//        else {
//            check = true;
//            while (check) {
//                System.out.println("Invalid input , please re-enter :");
//                System.out.print("Enter Admin Username: ");
//                username = scanner.next();
//
//                System.out.print("Enter Admin Password: ");
//                password = scanner.next();
//                if (username.equals("Admin") && password.equals("Admin")) {
//                    System.out.println("Admin sign in successful");
//                    check = false;
//                }
//            }
//        }
//    }

    private static void usersMenu() {
        System.out.println("-----PASSENGER MENU OPTION-----");
        System.out.println("................................");
        System.out.println("Enter your choice: ");
        System.out.println("0-Sign out");
        System.out.println("1-Change Password");
//        System.out.println("2-Search Flight Ticket");
//        System.out.println("3-Booking Ticket");
//        System.out.println("4-Ticket Cancellation");
//        System.out.println("5-Booked Tickets");
//        System.out.println("6-Add charge");
        int opt = scanner.nextInt();

        boolean exit = true;
        while (exit) {
//        while (opt != 0) {
            switch (opt) {
                case 0:
                    exit = false;
                    break;
                case 1:
                    changePassword();
                    break;
//            case 2:
//                searchFlightTicket();
//                break;
//            case 3:
//                bookingTicket();
//                break;
//            case 4:
//                ticketCancellation();
//                break;
//            case 5:
//                bookedTickets();
//                break;
//            case 6:
//                addcharge();
//                break;
//            default:
//                System.out.println("Invalid Input");
//                break;
//        }
//}
//
            }
        }
    }
    public static void option2() {
        while (true) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
//            System.out.println("3. Admin Sign In");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    signUp();
                    break;
                case 2:
                    signIn();
                    break;
//                case 3:
//                    adminSignIn();
//                    adminMenu();
//                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
