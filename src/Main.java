import java.util.* ;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startMenu();
//        while (true) {
//            System.out.println("Enter your choice: ");
//            System.out.println("1. Sign Up");
//            System.out.println("2. Sign In");
//            System.out.println("3. Admin Sign In");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            User users = new User();
//
//            switch (choice) {
//                case 1:
//                    User.signUp();
//                    break;
//                case 2:
//                    User.signIn();
//                    break;
//                case 3:
//                     User.adminSignIn();
//                     User.adminMenu();
//                    break;
//                default:
//                    System.out.println("Invalid input");
//                    break;
//            }
//        }
    }

//    private static void usersMenu() {
//        System.out.println("-----PASSENGER MENU OPTION-----");
//        System.out.println("................................");
//        System.out.println("Enter your choice: ");
//        System.out.println("0-Sign out");
//        System.out.println("1-Change Password");
////        System.out.println("2-Search Flight Ticket");
////        System.out.println("3-Booking Ticket");
////        System.out.println("4-Ticket Cancellation");
////        System.out.println("5-Booked Tickets");
////        System.out.println("6-Add charge");
//        int opt = scanner.nextInt();
//        if(opt==0)
//            User.signOut();
//        while (opt != 0) {
//            switch (opt) {
//                case 1:
//                    User.changePassword();
//                break;
////            case 2:
////                searchFlightTicket();
////                break;
////            case 3:
////                bookingTicket();
////                break;
////            case 4:
////                ticketCancellation();
////                break;
////            case 5:
////                bookedTickets();
////                break;
////            case 6:
////                addcharge();
////                break;
////            default:
////                System.out.println("Invalid Input");
////                break;
////        }
////}
////
//            }
//        }
//    }
//    public void option2() {
//        while (true) {
//            System.out.println("Enter your choice: ");
//            System.out.println("1. Sign Up");
//            System.out.println("2. Sign In");
//            System.out.println("3. Admin Sign In");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            User users = new User();
//
//            switch (choice) {
//                case 1:
//                    User.signUp();
//                    break;
//                case 2:
//                    User.signIn();
//                    break;
//                case 3:
//                    User.adminSignIn();
//                    User.adminMenu();
//                    break;
//                default:
//                    System.out.println("Invalid input");
//                    break;
//            }
//        }
//    }
User users = new User();
            public static void startMenu () {
                System.out.println("WELCOME TO AIRLINE RESERVATION SYSTEM");
                System.out.println("----------MENU OPTIONS----------");
                User.option2();
            }


        }


