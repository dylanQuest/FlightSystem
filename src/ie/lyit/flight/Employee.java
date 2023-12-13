/**
 * Class: Software Implementation
 * Instructor: Maria Boyle
 * Description: Class Employee - Developed for the Flight Booking System
 * Date: dd/mm/yyyy
 * @author Software Implementation Students
 * @version 1.0
 */
package ie.lyit.flight;

import java.text.DecimalFormat;

// INHERITANCE - Employee IS-A Person
// and CAN-DO Payable methods
public class Employee extends Person 
                      implements Payable {
	private Date dob;	     // Employee has name&phoneNo from Person		
	private Date startDate;	 // AND dob,startdate,salary, & number		
   private double salary;	
   private int number;

	private static int nextNumber=10000;	// static for unique number - starts off at 1000    

	private final double MAX_SALARY = 150000.00;
	
   // Default Constructor
	// Called when object is created like this ==> 
	// Employee eObj = new Employee();	
    public Employee(){
    	super();// NOTE:Don't have to put this in
    	dob=new Date();
    	startDate=new Date();
 		salary=0.0;
		// Set number to static nextNumber before incrementing nextNumber
 		number=nextNumber++;
    }

   // Initialization Constructor
	// Called when object is created like this ==>
	//  Employee e1 = new Employee(new Name("Mr","Joe","Doe"),
	//                             new Date(25,12,1970),
	//							          55000.00,
	//							          new Date(10,11,2009));
	public Employee(Name nameIn,String phoneNoIn,
                  Date dobIn,Date startDate,
                  double salary) {
	   // Call super class constructor - Passing parameters required by Person ONLY!		
	   super(nameIn,phoneNoIn);
	   // And then initialise Employees own instance variables
	   this.dob=dobIn;	// Set instance variable to parameter
	   this.startDate=startDate;	// Set instance variable to parameter
	   this.salary=salary;
	   
	   // Set number to static nextNumber before incrementing nextNumber
	   number = nextNumber++;						
	}

	// OVERRIDING the Person toString() method to make it more specific to Employee
	@Override
    public String toString(){
		DecimalFormat df=new DecimalFormat("#.00");
		
		return number + " " + name + "\t€" +  df.format(salary) + ".";
	}

	// equals() method
	// ==> Called when comparing an object with another object, 
	//     e.g. - if(e1.equals(e2))				
	// Because Employee has a unique number then it is 
	// sufficient to compare the number field
	@Override
	public boolean equals(Object obj){
		Employee eObject;
		if (obj instanceof Employee)
		   eObject = (Employee)obj;
		else
		   return false;
		   
	    return(this.number==eObject.number);
	}

   // get() methods
	public Date getStartDate(){
		return startDate;
	}	
	public Date getDob(){
		return dob;
	}	
	public double getSalary(){
		return salary;
	}
	public int getNumber(){
		return number;
	}	

    // set() methods
	// You shouldn't be able to setNumber() as it is unique, 
	// so don't provide a setNumber() method
	public void setDob(Date dob){
		this.dob=dob;
	}
	public void setStartDate(Date startDate){
		this.startDate=startDate;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}
	
	public double calculatePay(double taxPercentage) {
		// calculate and return the pay as salary/12 less taxPercentage
		double pay=salary/12;
		pay -= (pay * (taxPercentage/100));
		return pay;
	}

	public double incrementSalary(double incrementAmount) {
		// add incrementAmount to, and return the new salary
		// salary should not go over a maximum salary of €150,000
		salary += incrementAmount;
		
		if(salary > MAX_SALARY)
			salary = MAX_SALARY;
		
		return salary;
	}
}
