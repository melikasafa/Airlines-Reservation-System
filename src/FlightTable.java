import java.util.*;

public class FlightTable {
    ArrayList<Flight> table = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    public void flightTable() {
        Flight flight = new Flight("WX-12", "Yazd", "Tehran", "1402-12-10", "12:30", 700000, 51);
        table.add(flight);
        flight = new Flight("WE-32", "Mashhad", "Ahvaz", "1402-11-20", "8:00", 900000, 245);
        table.add(flight);
        flight = new Flight("AF-12", "Shiraz", "Tabriz", "1402-03-23", "22:30", 1100000, 12);
        table.add(flight);
    }

    public void addflight() {
        System.out.println(".........Add the flights..........");
        System.out.println("enter the flightId");
        String flightId = in.nextLine();
        System.out.println("enter the origin");
        String origin= in.nextLine();
        System.out.println("enter the destination");
        String destination= in.nextLine();
        System.out.println("enter the date");
        String date = in.nextLine();
        System.out.println("enter the time");
        String time= in.nextLine();
        System.out.println("enter the price");
        float price;
        price = in.nextFloat();
        System.out.println("enter the seats");
        int seats;
        seats = in.nextInt();
        Flight flight = new Flight(flightId, origin, destination, date, time, price, seats);
        table.add(flight);
    }

    public void updateflight() {
//        System.out.println("flight id of flight that you want to update :");
//        String flightId;
//        flightId = in.nextLine();
//        for (Flight flight : flightTable();) {
//            if (flight.getFlightId().equals(flightId)) {
//
//                System.out.print("Enter new origin: ");
//                String origin = in.next();
//                flight.setOrigin(origin);
//
//                System.out.print("Enter new destination: ");
//                String destination = in.next();
//                flight.setDestination(destination);
//
//                System.out.print("Enter new date: ");
//                String date = in.next();
//                flight.setDate(date);
//
//                System.out.print("Enter new time: ");
//                String time = in.next();
//                flight.setTime(time);
//
//                System.out.print("Enter new price: ");
//                float price = in.nextFloat();
//                flight.setPrice(price);
//
//                System.out.print("Enter new seats: ");
//                int seats = in.nextInt();
//                flight.setSeats(seats);
//
//                System.out.println("The flight with ID " + flightId + " has been updated!");
////                return;
//            }
//        }
    }

    public void removeflight() {


    }


    public void viewflightschedules() {
        for (int i = 0; i < table.size(); i++) {
            System.out.println(table.get(i));
        }
    }

}
