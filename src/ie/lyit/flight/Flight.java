/**
* Class: Software Implementation
* Instructor: Maria Boyle
* Description: Class Flight - Developed for the Flight Booking System
* Date: dd/mm/yyyy
* @author Software Implementation Students
* @version 1.0
*/
package ie.lyit.flight;

public class Flight{
	private String flightNumber;			// Flight has a flightNumber...
	private String source;					// a source & destination...
	private String destination;
	private Date date;						// COMPOSITION - Flight HAS-A date
	private Time time;						// COMPOSITION - Flight HAS-A time
	private double price;

	// Default Constructor
	// Called when object is created like this ==> Flight fliteA = new Flight();	
	public Flight(){
		flightNumber=source=destination="";
		date = new Date();
		time = new Time();
 		price = 0.0;
	}
  				   
	// Initialization Constructor
	// Called when object is created like this ==>
	//    Flight fliteB = new Flight("BR215","Derry", "Stanstead", new Date(25,12,2018), new Time(12,40), 16.99);
	public Flight(String flightNumber, String source, String destination, Date date, Time time, double price){
		// Initialise Flights instance variables
		this.flightNumber=flightNumber;
		this.source=source;
		this.destination=destination;
		this.date=date;
		this.time=time;
		this.price=price;
	}
				
	// toString() - returns String representing Flight
	@Override  // Overrides Object toString()
	public String toString(){
		return "FLIGHT " + flightNumber + " ==> "+source+" to "+destination+" " + date+" "+time+" hours";
	}
					
	// ==> Called when comparing an object with another object, e.g. - if(fliteA.equals(fliteB))										
	// Calling Persons equals() method, and adding additional bits
   @Override  // Overrides Object equals()
   public boolean equals(Object obj){
	   	Flight fObject;
	   	if (obj instanceof Flight)
	   		fObject = (Flight)obj;
	   	else
	   		return false;

	   return this.flightNumber.equals(fObject.flightNumber) &&
              this.source.equals(fObject.source) &&
		      this.destination.equals(fObject.destination) &&							
		      this.date.equals(fObject.date) &&
		      this.time.equals(fObject.time);							
	}
   
	// set() and get() methods
	public void setFlightNumber(String flightNumber){
	    this.flightNumber=flightNumber;
	}
	public String getFlightNumber(){
	   return flightNumber;
    }
   public void setSource(String source){
	    this.source=source;
	}
	public String getSource(){
	   return source;
    }
    public void setDestination(String destination){
       this.destination=destination;
    }
    public String getDestination(){
       return destination;
    }
    public void setDate(Date date){
       this.date=date;
    }
    public Date getDate(){
       return date;
    }
    public void setTime(Time time){
       this.time=time;
    }
    public Time getTime(){
       return time;
    }
    public void setPrice(double price){
       this.price=price;
    }
    public double getPrice(){
       return price;
    }
}

