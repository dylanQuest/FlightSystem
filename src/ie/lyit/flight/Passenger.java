/**
 * Class: Software Implementation
 * Instructor: Maria Boyle
 * Description: Class Passenger - Developed for the Flight Booking System
 * Date: dd/mm/yyyy
 * @author Software Implementation Students
 * @version 1.0
 */
package ie.lyit.flight;

public class Passenger extends Person{ //INHERITANCE-Passenger IS-A Person
	private String emailAddress;	  // Passenger has name & phoneNumber from Person
	private int noBags;						  // AND emailAddress, noBags,
	private boolean priorityBoarding; // priorityBoarding & creditCard
	private CreditCard creditCard;

	// Default Constructor
	// Called when object is created like this ==> 
	// Passenger prObj = new Passenger();
	// We can't create a default CreditCard so leave it out
	public Passenger(){
		// The super() constructor will get called automatically!
		super(); // You don't need to put in, but you can!
		emailAddress="";
		noBags = 0;
		priorityBoarding = false;
	}

	// Initialization Constructor
	// Called when a Passenger object is created like this ==>
	//    Name name=new Name("Mr","Joe","Bloggs");
	//    CreditCard joesCard=new CreditCard("1111222233334444L",
	//                                        new Date(31,12,2024),
	//                                        123);
	//    Passenger joeBloggs = new Passenger(name,"087 1234567", 
	//                                        "joe@gmail.com",1,false,joesCard);
	public Passenger(Name name,String phoneNumber,String email,
			         int noBags,boolean pB,CreditCard creditCard){
		// Call super class constructor - Passing parameters required by Person ONLY!
	   super(name,phoneNumber);
		// And then initialise Passengers own instance variables
	   this.emailAddress=email;
	   this.noBags=noBags;
	   this.priorityBoarding=pB;
	   this.creditCard=creditCard;
	}

	// OVERRIDING the Person toString() method!
	// Calling Persons toString() method, and adding additional bits
	@Override
	public String toString(){
	   // Display Passenger as follows:
	   // Ms Lisa Simpson, 2 bags, no Priority Boarding
	   String pb="";
	   if(priorityBoarding)
		   pb="Has Priority Boarding.";
	   else
		   pb="No Priority Boarding.";

	   return name + "\t" + emailAddress + "\t" + noBags + " bag(s), " + pb;
   }

	// no equals() method because the super class equals() is sufficient
	// We can compare two Passenger objects using their name and phoneNumber only
	// if(joeBloggs.equals(passenger2))
	//    given that there is no equals method in Passenger it will call Persons equals
	//    and compare joeBloggs's name and phoneNumber with passenger2's name and phoneNumber		
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public int getNoBags(){
		return noBags;
	}
	public boolean getPriorityBoarding(){
		return priorityBoarding;
    }	
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setNoBags(int noBags){
		if(noBags > 3)
			this.noBags=3;
		else
			this.noBags=noBags;
	}				
    public void setPriorityBoarding(boolean priorityBoarding){
        this.priorityBoarding=priorityBoarding;
    }
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
}
