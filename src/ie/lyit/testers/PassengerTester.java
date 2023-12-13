/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Tests the Passenger class by constructing Passenger objects and calling Passenger methods
 * Date: dd/mm/yyyy
 * @author Maria Boyle
 * @version 1.0
**/
package ie.lyit.testers;

import java.util.ArrayList;

import ie.lyit.flight.CreditCard;
import ie.lyit.flight.Date;
import ie.lyit.flight.Passenger;
import ie.lyit.flight.Name;

public class PassengerTester {

	public static void main(String[] args) {
		// Cannot create object from Abstract class Person
		// Person p=new Person();
		
		ArrayList<Passenger> passengers=new ArrayList<Passenger>();
		
		// Construct p1
		Name homer=new Name("Mr","Homer","Simpson");
		CreditCard homersCard=new CreditCard(1111222233334444L,
				                             new Date(31,12,2027),
				                             111);
		Passenger p1=new Passenger(homer, "087 1234567", 
				             "homer.simpson@atu.ie", 0, false, homersCard);
		
		// Construct p2
		CreditCard margesCard=new CreditCard(5555666677778888L,
                                             new Date(31,12,2024),
                                             222);

		Passenger p2=new Passenger(new Name("Mrs","Marge","Simpson"),
				            "086 1234567", "marge.simpson@atu.ie",
				            1, true, margesCard);

		// Construct p3
		CreditCard lisasCard=new CreditCard(9999000011112222L,
                                            new Date(31,3,2024),
                                            333);		
		Passenger p3=new Passenger(new Name("Miss","Lisa","Simpson"),
	                        "087 9876543", "lisa.simpson@atu.ie",
	                        3, true, lisasCard);

		passengers.add(p1);
		passengers.add(p2);
		passengers.add(p3);

		System.out.println("LIST OF PASSENGERS");
		for(Passenger passenger:passengers) 
			System.out.println(passenger);
		
		int femaleCount=0,maleCount=0;
		for(Passenger passenger:passengers) {
			if(passenger.getName().isFemale())
				femaleCount++;
			else
				maleCount++;
		}
		System.out.println("");
		System.out.println("MALE/FEMALE PASSENGER COUNT");
		System.out.println(maleCount + " MALE(S), " + femaleCount + " FEMALE(S).");		
		
		System.out.println("");
		System.out.println("PASSENGERS CREDIT CARD DETAILS");
		for(Passenger passenger:passengers) 
			System.out.println(passenger.getName() + 
					           " Card Number :" +
					           passenger.getCreditCard());
	}
}
