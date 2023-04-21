import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ticket {
    ArrayList<Flight> bookedTicket = new ArrayList<>();
    FlightTable flights = new FlightTable();

    public void bookingTicket() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the id of the flight that you want to reserve: ");
        String id = in.next();

        for (int i = 0; i < flights.row.size(); i++) {
            Flight flight = flights.row.get(i);
            User  user  = new  User();

            if (flight.getFlightId().equals(id)) {

                if (flight.getSeats()>=1) {
                    if (user.getCharge() >= flight.getPrice()) {
                        double balance = user.getCharge();
                        double cost = flight.getPrice();
                        user.setCharge((float) (balance - cost));
                        bookedTicket.add(flight);
                        flight.setSeats(flight.getSeats()-1);
                        System.out.println("reservation done." + "your ticket id is: " + ticketCode() );
                    }
                    else if (user.getCharge() < flight.getPrice()) {
                        System.out.println("your charge is not enough,Please charge your account: ");
                        User.addCharge();
                    }
                    else {
                        System.out.println("Sorry , This flight does not have an empty seat. ");
                        User.usersMenu();
                    }

                }

            }

            else {
                System.out.println("the flight was not found");
                User.usersMenu();
            }

        }

    }

    public int ticketCode() {
        Random r = new Random();
        int ticketId = r.nextInt(999999);
        //   to creat 6-digit number .
        while( ticketId<=99999){
            ticketId = r.nextInt(999999);
        }
        return ticketId;
    }
    public void CancellationTicket () {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your ticketId");
        String id = in.next();
        for (int i = 0; i < flights.row.size(); i++) {

            Flight flight = flights.row.get(i);
            if (flight.getFlightId().equals(id)) {
                flights.reserve.remove(flight);
                flight.setSeats(flight.getSeats()-1);
                System.out.println("Cancellation done.");
                break;
            }
        }
    }
}
