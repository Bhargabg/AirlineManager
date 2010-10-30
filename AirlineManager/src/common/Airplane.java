package common;

import java.util.LinkedList;

import bookings.Booking;

public class Airplane {
	/* The total amount of seats and the number of occupied seats.
	 * This last parameter may be replaced by finding the size of
	 * the list of clients in this flight.
	 */
	
	//TODO: Um voo pode ter mais do que um flight, logo, estas vari�veis n�o podem ficar associadas ao avi�o.
	private int noSeats, occupiedSeats;
	/* The flight associated with this airplane. */
	private LinkedList <Flight> flights;
	
	/* The constructor. */
	public Airplane(int number){
		noSeats = number;
		this.flights = new LinkedList<Flight>();
	}
	
}
