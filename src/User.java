import java.util.* ;

public class User {
    static Scanner scanner = new Scanner(System.in);

    static User[] users = new User[100];
    static int userCount = 0;


    private String username;
    private String firstName;
    private String lastName;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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


    static void signUp() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = new User();
        users[userCount] = user;
        userCount++;

        System.out.println("Registration successful , Please Sign in");
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
                break;
            }
        }


        if (!found)
            System.out.println("Invalid username or password");
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
        while (option != 0) {
            switch (option) {
                case 1:
                    addtable.addflight();
                    break;
                case 2:
                    addtable.updateflight();
                    break;
                case 3:
                    addtable.removeflight();
                    break;
                case 4:
                    addtable.viewflightschedules();
                    break;
                default:
                    System.out.println("Invalid try again");
                    adminMenu();
                    break;


            }
            System.out.println("1. Add\n2. Update\n3. Remove\n4. Flight Schedules\n0. Sign out");
            option=scanner.nextInt();
        }
    }

    public static void adminSignIn() {
        boolean check = false ;
        System.out.print("Enter Admin Username: ");
        String username = scanner.next();

        System.out.print("Enter Admin Password: ");
        String password = scanner.next();
        if (username.equals("Admin") && password.equals("Admin"))
            System.out.println("Admin sign in successful");
        else {
            check = true ;
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
}

