package ie.lyit.testers;

import java.text.DecimalFormat;
import java.util.ArrayList;

import ie.lyit.flight.Date;
import ie.lyit.flight.Employee;
import ie.lyit.flight.Name;

public class EmployeeTester {

	public static void main(String[] args) {
		 ArrayList<Employee> employees=new ArrayList<Employee>();

		    Name name = new Name("Ms","Faye","McGuire");
		    Employee e1 = new Employee(name, "087 1234567",
		    		                   new Date(7,12,2000),
		    		                   new Date(12,10,2020),
		    		                   24000.00);

		    name = new Name("Mr","Ben","Carson");
		    Employee e2 = new Employee(name, "086 1234567",
		    		                   new Date(20,10,1980), 
		    						   new Date(10,10,2012),42000.00);	
		    
		    name = new Name("Mr","Mark","Logan");
		    Employee e3 = new Employee(name, "087 9876543",
		    		                   new Date(1,1,1994), 
		    						   new Date(2,8,2018),28000.00);		    
		    
		    employees.add(e1);
		    employees.add(e2);
		    employees.add(e3);
		    		      
		    // Display Employee's
			System.out.println("LIST OF EMPLOYEES");
			for(Employee employee:employees)
				System.out.println(employee);

		    // Increment Employee's earning less than 30000
			System.out.println("");
			System.out.println("LIST OF EMPLOYEES AFTER SALARY INCREMENT");
			for(Employee employee:employees) {
				if(employee.getSalary() < 30000)
				    employee.incrementSalary(1000);
		        System.out.println(employee);
			}

			System.out.println("");
			System.out.println("EMPLOYEES TAKE HOME PAY");
			DecimalFormat df=new DecimalFormat("#.00");
			for(Employee employee:employees) {
				System.out.print(employee.getNumber() + "\t" + employee.getName());			
				System.out.println(employee.getSalary() < 35000 
				    ? "\t€" + df.format(employee.calculatePay(20))
				    : "\t€" + df.format(employee.calculatePay(40)));
			}
	}
}
