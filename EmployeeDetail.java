package collectionTreeSet;//created package as collectionTreeSet

/**
 *importing class, which are belong from java.util.package;
 */
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utilit
import java.util.Arrays;//array contaains elements of similar data type
import java.util.Comparator;//java comparator interface is used to order the use defined class objects,compare() method,vollectionetc
import java.util.Iterator;//iterator is an interface,used to iterator collection of objects
import java.util.List;////it is a child interface of collection
import java.util.TreeSet;//treeset class implements the set interface that uses a tree for storage
/**
 *
 *first i've created a class named EmployeeDetail and main method
 *than created Object of Employee class
 */
public class EmployeeDetail {//created class name as EmployeeDetail
    //classes are the basics of oops(object oriented programming langauge)

    public static void main(String[] args) {//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
    	System.out.println("Display Employee Detail\n");//system is used to return code
        //out is a static ,member
        //println is used to print text and gives output
	
        Employee empOne = new Employee("Vinay", "Manager", 90000);//taking employee deatils
        Employee emplTwo = new Employee("Manoj", "Ass.Manager", 75000);
        Employee emplThree = new Employee("Harish", "Area Dept. Manager", 45000);
        Employee emplFour = new Employee("Tharun", "Area Dept. Manager", 45000);
        Employee emplFive = new Employee("Tharun", "salesmen", 25000);
        
          /**
           * in here creating object of TreeSet and making it generic for Employee
           * and adding Employee to TreeSet by using add()method
           */
        TreeSet<Employee> treeSet = new TreeSet<Employee>(new EmployeeComparator(
                new compareWithName(), new compareWithDesignation()
                ));
       
        treeSet.add(empOne);//adding empone
        treeSet.add(emplTwo);//adding emp1Two
        treeSet.add(emplThree);//adding emp1Three
        treeSet.add(emplFour);//adding emp1Four
        treeSet.add(emplFive);//adding emp1Five
        /**
		 * In here using iterator
		 * and than using while loop for checking the value
		 * and call hasNext() which will returns true if there are 
		 * more elements. Otherwise, returns false.
		 */
        Iterator iterator=treeSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());//system is used to return code
	        //out is a static member
	        //println is used to print text and gives output
		}
    }

}
/**
 * 
 * created a class compareWithSalary which will compare employee salary
 * to compare salary i've used compare method and to use compare method
 * it must be implements with Comparator Interface  
 *
 */
class compareWithSalary implements Comparator<Employee>{//class name as comparewithsalary implementing comparator

    @Override
    public int compare(Employee employee1, Employee employee2) {//Here public is a access modifier which defines who can access this method
        if(employee1.getSalary() > employee2.getSalary()){//taken if statement
            return 1;//returns eitheer true or false
        }else{
            return -1;
        }
    }
    
}
/**
 * 
 * created a class compareWithName which will compare with employee names
 * to compare names i've used compare method and to use of compare method
 * it must be implements with Comparator Interface  
 *
 */
class compareWithName implements Comparator<Employee>{//class name as compareWithName implements Comparator
	
    public int compare(Employee employee1, Employee employee2) {//Here public is a access modifier which defines who can access this method
        return employee1.getName().compareTo(employee2.getName());  //return employee
    }
    
}
/**
 * 
 * created a class compareWithDesignation which will compare with employee Designation
 * to compare Designation i've used compare method and to use of compare method
 * it must be implements with Comparator Interface  
 *
 */
class compareWithDesignation implements Comparator<Employee>{//class name as compareWithDesignation mplements comparator
	
    public int compare(Employee employee1, Employee employee2) {//Here public is a access modifier which defines who can access this method
        return employee1.getDesignation().compareTo(employee2.getDesignation());  //return employee designation
    }
    
}
 /**
  * 
 
  * In here creating a class EmployeeComparator
  * it implements  Comparator
  *
  */
class EmployeeComparator implements Comparator<Employee> {//taken class name as EmployeeComparator implements comparator
     
    private List<Comparator<Employee>> listComparators;//taken object as listcomparators
 
	public EmployeeComparator(Comparator<Employee>... comparators) {//Here public is a access modifier which defines who can access this method
        this.listComparators = Arrays.asList(comparators);
    }
 
    public int compare(Employee emp1, Employee emp2) {//Here public is a access modifier which defines who can access this method
    	//For each loop
        for (Comparator<Employee> comparator : listComparators) {//using for loop
            int result = comparator.compare(emp1, emp2);//comparing
            if (result != 0) {
                return result;//returning result
            }
        }
        return 0;//returns
    }
}