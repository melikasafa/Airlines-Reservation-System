import java.util.* ;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    static User[] users = new User[100];
    static int userCount = 0;

    public static void main(String[] args) {
        startMenu();

        while (true) {
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
                    break;
                case 3:
                    adminSignIn();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    private static void adminSignIn() {
        System.out.print("Enter Admin Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Admin Password: ");
        String password = scanner.nextLine();
        if (username.equals("mlsafa") && password.equals("12345"))
            System.out.println("Admin sign in successful");
        else {
            System.out.println("Invalid input");
        }
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
        String inputSignOut = scanner.nextLine();

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

