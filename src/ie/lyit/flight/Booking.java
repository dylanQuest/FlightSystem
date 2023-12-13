package ie.lyit.flight;
import java.util.ArrayList;

public class Booking {
	private Flight outbound;
	private Flight inbound;
	private ArrayList<Passenger> passengers;
	private double totalPrice;
	private int bookingNo;
	private static int nextUniqueBookingNumber = 10000;
	
	public Booking(Flight oF, Flight iF, ArrayList<Passenger> p) throws Exception {
		if(oF == null)
			throw new IllegalArgumentException("Error - Outbound flight null");
		else
			this.outbound=oF;
		this.inbound=iF;
		if(p.size()<1 || p.size()>9)
			throw new IllegalArgumentException("Error - Passenger count not within parameters");
		else
			this.passengers=p;
		bookingNo = nextUniqueBookingNumber++;
		calculatePrice();
	}	
	
	@Override
	public String toString(){
	   return "Booking Number: " + bookingNo
			   + "\nInbound Flight: " + inbound 
			   + "\nOutbound Flight: " + outbound 
			   + "\nPrice: " + totalPrice
			   + "\nPassengers: " + passengers.toString();
	}
	
	public boolean equals(Object obj){
		   Booking bObject;
		   if (obj instanceof Booking)
			   bObject = (Booking)obj;
		   else
		       return false;
		 
		   return this.bookingNo==bObject.bookingNo;
	}
	
	public boolean findPassenger(Passenger p) {
		for(Passenger i: passengers) {
		   if(i.equals(p))
			   return true;
		}
		return false;
	}
	
	public double calculatePrice() {
		if(inbound == null)
			return outbound.getPrice() * passengers.size();
		else
			return passengers.size() * (outbound.getPrice() + inbound.getPrice());
	}
	
	public Flight getOutbound() {
		return outbound;
	}
	public void setOutbound(Flight oF) throws Exception {
		if(oF == null)
			throw new IllegalArgumentException("Outbound flight cannot be null");
		else
			outbound = oF;
	}
	
	public Flight getInbound() {
		return inbound;
	}
	public void setInbound(Flight iF) {
		inbound = iF;
	}
	
	public int getBookingNum() {
		return bookingNo;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(ArrayList<Passenger> newPassengers) throws Exception{
		if(newPassengers.size() < 1 || newPassengers.size() > 9)
			throw new IllegalArgumentException("Passenger count error");
		else
			passengers = newPassengers;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice() {
		totalPrice = calculatePrice();
	}
}
