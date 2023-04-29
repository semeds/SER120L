import java.util.Scanner;

public class MainEmployee1 {

	public static void main(String[] args) {
		
		Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
		Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
		
		System.out.println(susan.getName() + " ID: " + susan.getId() + " Department: " + susan.getDepartment() + " Position: " + susan.getPosition());
		System.out.println(mark.getName() + " ID: " + mark.getId() + " Department: " + mark.getDepartment() + " Position: " + mark.getPosition());
		System.out.println(joy.getName() + " ID: "+ joy.getId() + " Department: "+ joy.getDepartment() + " Position: " + joy.getPosition());
		
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter employee name: ");
		//String typeName = input.nextLine();
		
		//if (typeName.equalsIgnoreCase("susan")) {
			//System.out.println(susan.getName());
			//susan.getId();
			//susan.getDepartment();
			//susan.getPosition();
			
		//} else if (typeName.equalsIgnoreCase("mark")) {
			//System.out.println(mark.getName());
		//} else {
			//System.out.println(joy.getName());
		//}

	}

}
