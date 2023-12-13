/**
* Class: Software Implementation
* Instructor: Maria Boyle
* Description: Class Time - Developed for the Flight Booking System
* Date: dd/mm/yyyy
* @author Software Implementation Students
* @version 1.0
**/

package ie.lyit.flight;

public class Time {
	private int hour;
	private int minute;

	// Default Constructor 
	//	==> Called when a Time object is created as follows - Time t1 = new Time();
	public Time(){
		hour=minute=0;
	}

	// Overloaded Constructor
	// ==> Called when a Time object is created as follows - Time t2 = new Time(10,30);
	public Time(int h, int m){
		hour=h;
		minute=m;
	}

	// toString() method
	// ==> Called when a String of the class is used, e.g. - System.out.print(t1);
	//							 		  				     or System.out.print(t1.toString());
	@Override  // Overrides Object toString()
	public String toString(){
		return hour + ":" + minute;
	}
		
	   
	// equals() method ==> Called when comparing an object with another object,
	//  e.g. - if(t1.equals(t2))
	@Override  // Overrides Object equals()
	public boolean equals(Object obj){
		Time tObject;
		if (obj instanceof Time)
			tObject = (Time)obj;
		else
			return false;

		return this.hour == tObject.hour &&
			   this.minute == tObject.minute;
	}
		
	// get methods
	// ==> Called when retrieving part of an object, e.g. - if (t1.getHour() == t2.getHour())
	public int getHour(){
		return this.hour;
	}
	public int getMinute(){
		return minute;
	}

	// set methods
	// ==> Called when setting part of an object, e.g. - t1.setHour(11);
	//	 											     t1.setMinute(30);
	public void setHour(int hour){
		this.hour=hour;
	}
	public void setMinute(int minute){
		this.minute=minute;
	}
}