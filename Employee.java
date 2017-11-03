package collectionTreeSet;//created package as collectionTreeSet

public class Employee {//created class name as Employee
	                   //classes are the basics of oops(object oriented programming langauge)
	String name, designation;//taking
	int salary;//intializing salary
	public Employee(String name, String designation, int salary) {//Here public is a access modifier which defines who can access this method
		super();//super keyword used to refer variable
		this.name = name;//here taking three different types of variables
		this.designation = designation;
		this.salary = salary;
	}// here we are using the getter n setter
	// for three different properties
	public String getName() {//Here public is a access modifier which defines who can access this method
		return name;//returns name
	}
	public void setName(String name) {//Here public is a access modifier which defines who can access this method
		this.name = name;//settig name
	}
	public String getDesignation() {//Here public is a access modifier which defines who can access this method
		return designation;//returns designation
	}
	public void setDesignation(String designation) {//Here public is a access modifier which defines who can access this method
		this.designation = designation;//setting designation
	}
	public int getSalary() {//Here public is a access modifier which defines who can access this method
		return salary;//rerturns salary
	}
	public void setSalary(int salary) {//Here public is a access modifier which defines who can access this method
		this.salary = salary;//setting salary
	}
	public String toString(){//Here public is a access modifier which defines who can access this method
		  return " Name is : "+name+"\n Designation is:"+ designation+"\n Salary is:"+salary+"\n";//returns name is
	  }

}