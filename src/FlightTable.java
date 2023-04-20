import java.util.*;

public class FlightTable {
    ArrayList<Flight> table = new ArrayList<>();
    ArrayList<Flight> book = new ArrayList<>();
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
        System.out.println(".........add the flights..........");
        System.out.println("enter the flightId");
        String flightId;
        flightId = in.nextLine();
        System.out.println("enter the origin");
        String origin;
        origin = in.nextLine();
        System.out.println("enter the destination");
        String destination;
        destination = in.nextLine();
        System.out.println("enter the date");
        String date;
        date = in.nextLine();
        System.out.println("enter the time");
        String time;
        time = in.nextLine();
        System.out.println("enter the price");
        float price;
        price = in.nextFloat();
        System.out.println("enter the seats");
        int seats;
        seats = in.nextInt();
        Flight flight = new Flight(flightId, origin, destination, date, time, price, seats);
        table.add(flight);
        System.out.println("Flight added");
    }

    public void updateFlight() {
        System.out.println("enter flightId :");
        String flightId = in.nextLine();
        for (Flight flight : table) {
            if (flight.getFlightId().equals(flightId)) {

                System.out.print("Enter flight origin: ");
                String origin = in.next();
                flight.setOrigin(origin);

                System.out.print("Enter flight destination: ");
                String destination = in.next();
                flight.setDestination(destination);

                System.out.print("Enter flight date: ");
                String date = in.next();
                flight.setDate(date);

                System.out.print("Enter flight time: ");
                String time = in.next();
                flight.setTime(time);

                System.out.print("Enter flight price: ");
                float price = in.nextFloat();
                flight.setPrice(price);

                System.out.print("Enter flight seats: ");
                int seats = in.nextInt();
                flight.setSeats(seats);

                System.out.println("The flight    " + flightId + " ...... updated!");

            }
        }
    }

    public void removeFlight() {
        System.out.println("enter flightid: ");
       String id = in.next();
        System.out.println();
    }




    public void viewFlightSchedules() {
        for (int i = 0; i < table.size(); i++) {
            System.out.println(table.get(i));
        }
    }


//    public void bookingTicket() {
//        System.out.println(charge);
//        Flight flight = new Flight(flightId, origin, destination, date, time, price, seats) ;
//        System.out.println("enter your flightId");
//        String Id;
//        Id = in.nextLine();
//        for (int i = 0; i < table.size(); i++) {
//
//            Flight flight = table.get(i);
//            if (flight.getFlightId().equals(Id)) {
//                book.add(flight);
//                break;
//            }
//        }
//    }

    public void bookedTickets() {
            for (int i = 0; i < book.size(); i++) {
                System.out.println(book.get(i));
            }
        }
    }

