/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Tester for the Date class
 * Date: dd/mm/yyyy
 * @author Maria Boyle
 * @version 1.0
**/
package ie.lyit.testers;

import ie.lyit.flight.Date;
import java.util.Scanner;

public class DateTester{
	public static void main(String[] args) {
		Date d1 = new Date();
        System.out.println(d1);      

	    d1.setDay(4);
		d1.setMonth(6);
		d1.setYear(1941);
		
		System.out.println(d1);
      
		Date d2 = new Date(28, 12, 1982);
        System.out.println(d2);
      
		if(d1.equals(d2))
			System.out.println("Date's are equal.");
		else
			System.out.println("Date's are not equal.");
		
		Date dateA = new Date();
		int setDayTo=32, setMonthTo=13, setYearTo=-2009;
		boolean goodInput=false;
		Scanner keyboard = new Scanner(System.in);
		
		do {
			try {
				// Set dateA to invalid values - Should throw an exception!
				dateA.setDay(setDayTo);
				dateA.setMonth(setMonthTo);
				dateA.setYear(setYearTo);
				goodInput=true;
			}
			catch(IllegalArgumentException iEA){
				System.out.println("Incorrect day, month or year.");

				System.out.print("Enter day [1-31]:");
				setDayTo = keyboard.nextInt();
				System.out.print("Enter month [1-12]:");
				setMonthTo = keyboard.nextInt();
				System.out.print("Enter Year [above 1900]:");
				setYearTo = keyboard.nextInt();				
			}
		}while(!goodInput);
		
		goodInput=false;
		setDayTo=15;setMonthTo=33;setYearTo=2017;
		do {
			try {
				Date dateB = new Date(setDayTo,setMonthTo,setYearTo);
			}
			catch(IllegalArgumentException iEA){
				System.out.println("Incorrect day, month or year.");
				
				System.out.print("Enter day [1-31]:");
				setDayTo = keyboard.nextInt();
				System.out.print("Enter month [1-12]:");
				setMonthTo = keyboard.nextInt();
				System.out.print("Enter Year [above 1900]:");
				setYearTo = keyboard.nextInt();				
			}
		}while(!goodInput);
   }
}

