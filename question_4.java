package Assign_3;
import java.util.HashMap;
import java.util.Map;
class Employee_4{
	String name,designation;
	int age,salary;
	public Employee_4(String name,String d,int a){
		this.designation = d;
		this.age = a;
		this.name = name;
	}
	public int setSalary(int s){
		this.salary = s;
		return s;
	}
	
	public int getAge(){
		return this.age;
	}
	public String getName(){
		return this.name;
	}
}

public class question_4 {
	public static void main(String[] args) 
	{
		Employee_4 emp1 = new Employee_4("Saroj","QE",22);
		Employee_4 emp2 = new Employee_4("Raju","QE1",23);
		Employee_4 emp3 = new Employee_4("Garuda","QE2",24);
		Employee_4 emp4 = new Employee_4("Mohan","QE3",25);
		
		Map<Employee_4,Integer> mp = new HashMap<Employee_4,Integer>();
		mp.put(emp1, emp1.setSalary(50000));
		mp.put(emp2, emp2.setSalary(60000));
		mp.put(emp3, emp3.setSalary(70000));
		mp.put(emp4, emp4.setSalary(80000));
		
		for(Employee_4 emp:mp.keySet())
		{
			System.out.println(emp.getName() + " " + emp.designation + " " + emp.getAge() + " " + mp.get(emp));
		}
	}
}

