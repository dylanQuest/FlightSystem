package ie.lyit.testers;

import ie.lyit.flight.*;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExceptionHandlerDemo {

	public static void main(String[] args) {
		// ArrayList of Employees
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
	    // Create a Employee object called employeeA with initial values
		Employee employeeA = new Employee(new Name("Mr","Mickey","Mouse"),"087 1234567",
					                         new Date(1928,11,18),
					                         new Date(1,1,1948),
					                         2500000.00);
	    // Create a Employee object called employeeB with initial values
		Employee employeeB = new Employee(new Name("Ms","Minne","Simpson"),"087 1234567",
					                         new Date(1928,11,18),
					                         new Date(1,1,1950),
					                         250000.00);
	    // Create a Employee object called employeeB with initial values
		Employee employeeC = new Employee(new Name("Mr","Donald","Duck"),"087 1119999",
					                         new Date(1928,1,13),
					                         new Date(1,1,1952),
					                         250000.00);
		employees.add(employeeA);
		employees.add(employeeB);
		employees.add(employeeC);
		
	    boolean goodInput=false;
	    do {
		    try {
			    String numberAsString=
			    	JOptionPane.showInputDialog(null,
			    	"Enter Employee to View ("+1+" to "+ employees.size()+")");
			    int numberToView=Integer.parseInt(numberAsString);
			    JOptionPane.showMessageDialog(null,employees.get(numberToView-1));
			    goodInput=true;
		    }
		    catch(NumberFormatException nfe) {
		    	JOptionPane.showMessageDialog(null,"Invalid number, re-enter.");
		    }
		    catch(IndexOutOfBoundsException iobe) {
		    	JOptionPane.showMessageDialog(null,
		    	 "Enter number between 1 and "+employees.size());	    	
		    }
		    catch(Exception e) {
		    	JOptionPane.showMessageDialog(null,"Invalid number, re-enter.");
		    }
	    }while(!goodInput);
	    
		/////////////
	    // Polymorphic ArrayList
	    /////////////
		ArrayList<Person> allPersons = new ArrayList<Person>();
		
		allPersons.add(employeeA);
		allPersons.add(employeeB);
		
		CreditCard lucyLeesCard=new CreditCard(9999000011112222L,
                                               new Date(31,3,2024),
                                               333);
		allPersons.add(new Passenger(new Name("Miss","Lucy","Lee"),"087 1111222",
				                     "lucy.lee@atu.ie",1,true,lucyLeesCard)); 

		CreditCard annLeesCard=new CreditCard(5555666677778888L,
                                              new Date(31,12,2024),
                                              222);
		allPersons.add(new Passenger(new Name("Mrs","Ann","Lee"),"087 7654321",
				                     "ann.lee@atu.ie",1,true,annLeesCard));
		
		// Polymorphism means 'many forms'
		// tmpPerson is taking on Employee objects and Passenger objects
		// The toString() from either Employee or Passenger will get called
		for(Person tmpPerson : allPersons)
			System.out.println(tmpPerson);	
	}
}
