/*
 * Author: Sean Emede
 * File: Employee.java
 * Date: 2/21/2023
 * Purpose: to create a class that creates objects to find employee information
 */
public class Employee {
	
	//instance variables
	private String name;
	private int id;
	private String department;
	private String position;
	
	//constructor accepting name, ID Number, department and position
	public Employee (String name, int id, String department, String position) {
		this.name = name;
		this.id = id;
		this.department = department;
		this.position = position;
	}
	
	//constructor accepting name and ID Number
	public Employee (String name, int id) {
		this.name = name;
		this.id = id;
		this.department = "";
		this.position = "";
	}
	
	//default constructor
	public Employee () {
		this.name = "";
		this.id = 0;
		this.department = "";
		this.position = "";
	}
	
	//accessors and mutators for each variable
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

}
