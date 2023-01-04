import java.util.LinkedList;

public class SunLinked {
    private LinkedList<Ticket> tickets;
    private int ticketCount;

    public SunLinked() {
        tickets = new LinkedList<>();
        ticketCount = 0;
    }

    public void bookTicket(String passengerName, int seatNumber) {
        Ticket ticket = new Ticket(passengerName, seatNumber);
        tickets.add(ticket);
        ticketCount++;
    }

    public void cancelTicket(int seatNumber) {
        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            if (ticket.getSeatNumber() == seatNumber) {
                tickets.remove(i);
                ticketCount--;
                return;
            }
        }
        throw new RuntimeException("Ticket not found");
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void printTickets() {
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }
}

class Ticket {
    private String passengerName;
    private int seatNumber;

    public Ticket(String passengerName, int seatNumber) {
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "passengerName='" + passengerName + '\'' +
                ", seatNumber=" + seatNumber +
                '}';
    }
    //just for the sake of git
}
