import java.util.*;

public class FlightTable {
    ArrayList<Flight> row = new ArrayList<>();
    ArrayList<Flight> reserve = new ArrayList<>();
//    ArrayList<Flight> flights = new ArrayList<>();



    Scanner in = new Scanner(System.in);
    public void flightTable() {
        Flight flight = new Flight("WX-12", "Yazd", "Tehran", "1402-12-10", "12:30", 700000, 51);
        row.add(flight);
        flight = new Flight("WE-32", "Mashhad", "Ahvaz", "1402-11-20", "8:00", 900000, 245);
        row.add(flight);
        flight = new Flight("AF-12", "Shiraz", "Tabriz", "1402-03-23", "22:30", 1100000, 12);
        row.add(flight);
    }


//    Flight flight = new Flight(flightId, origin, destination, date, time, price, seats);

    public void addFlight() {
        System.out.println(".........add the flights..........");
        System.out.println("enter the flightId");
        String flightId = in.nextLine();
        System.out.println("enter the origin");
        String origin = in.nextLine();
        System.out.println("enter the destination");
        String destination = in.nextLine();
        System.out.println("enter the date");
        String date = in.nextLine();
        System.out.println("enter the time");
        String time;
        time = in.nextLine();
        System.out.println("enter the price");
        float price = in.nextFloat();
        System.out.println("enter the seats");
        int seats = in.nextInt();
        Flight flight = new Flight(flightId, origin, destination, date, time, price, seats);
        row.add(flight);
        System.out.println("Flight added successfully");

    }

    public void updateFlight() {
        System.out.println("enter flightId :");
        String flightId = in.nextLine();
        for (Flight flight : row) {
            if (flight.getFlightId().equals(flightId)) {

                System.out.print("Enter flight origin: ");
                String origin = in.next();
                flight.setOrigin(origin);

                System.out.print("Enter flight destination: ");
                String destination = in.next();
                flight.setDestination(destination);

                System.out.println("Enter flight date: ");
                String date = in.next();
                flight.setDate(date);

                System.out.println("Enter flight time: ");
                String time = in.next();
                flight.setTime(time);

                System.out.println("Enter flight price: ");
                float price = in.nextFloat();
                flight.setPrice(price);

                System.out.println("Enter flight seats: ");
                int seats = in.nextInt();
                flight.setSeats(seats);

                System.out.println("The flight  " + flightId + "updated successfully. ");

            }
        }
    }

    public void removeFlight() {
        System.out.println("Please enter flight id: ");
        String id = in.next();
        for (int i = 0; i < row.size(); i++) {
            Flight flight = row.get(i);
            if (flight.getFlightId().equals(id))
                row.remove(i);
        }
        System.out.println("Remove flight done successfully. ");
    }




    public void viewFlightSchedules() {
        for (int i = 0; i < row.size(); i++) {
            System.out.println(row.get(i));
        }
    }


//        public void bookingTicket() {
//            User user = new User() ;
//            System.out.println("Enter flightId of your flight: ");
//            String id = in.nextLine();
//            for (int i = 0; i < row.size(); i++) {
//
//                Flight flight = row.get(i);
//                if (flight.getFlightId().equals(id) && user.getCharge() >= flight.getPrice()) {
//                    flight.setSeats(flight.getSeats()-1);
//                    System.out.println("Reservation done.");
//                    System.out.println();
//                    break;
//                }
//
//               else if (user.getCharge() < flight.getPrice()) {
//                    System.out.println("Your charge is not enough,please charge your account. ");
//                    System.out.println();
//                    User.addCharge();
//                }
//            }
//    }

    public void bookedTickets() {
            for (int i = 0; i < reserve.size(); i++) {
                System.out.println(reserve.get(i));
            }
        }
    }

