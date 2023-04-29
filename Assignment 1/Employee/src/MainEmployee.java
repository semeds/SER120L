/*
 * Author: Sean Emede
 * File:MainEmployee.java
 * Date: 2/21/2023
 * Purpose: To test the Employee.java file
 */

public class MainEmployee {

	public static void main(String[] args) {
		
		//object using constructor with all arguments
		Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		System.out.println(susan.getName() + " ID: " + susan.getId() + ", Department: " + susan.getDepartment() + ", Position: " + susan.getPosition());
		
		//object using constructor with just name and id
		Employee mark = new Employee("Mark Jones", 39119);
		mark.setDepartment("IT");
		mark.setPosition("Programmer");
		System.out.println(mark.getName() + " ID: " + mark.getId() + ", Department: " + mark.getDepartment() + ", Position: " + mark.getPosition());
		
		//object using default constructor
		Employee joy = new Employee();
		joy.setName("Joy Rogers");
		joy.setId(81774);
		joy.setDepartment("Manufacturing");
		joy.setPosition("Engineer");
		System.out.println(joy.getName() + " ID: "+ joy.getId() + ", Department: "+ joy.getDepartment() + ", Position: " + joy.getPosition());
		

	}

}
