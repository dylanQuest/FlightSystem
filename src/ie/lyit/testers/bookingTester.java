package ie.lyit.testers;
import ie.lyit.flight.*;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class bookingTester {
	private Booking b1;
	private Booking b2;
	
	@Before
	public void setUp() throws Exception {
		b1=new Booking(null,null,null);
	}
	
	@Test
	public void testConstructor() {
		Flight fliteoF = new Flight();
		Flight fliteiF = new Flight();
		Passenger p = new Passenger();
		ArrayList<Passenger> ps=new ArrayList<Passenger>();
		ps.add(p);
	
		try {
			b2=new Booking(fliteoF, fliteiF,ps);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
