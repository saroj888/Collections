package Assign_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class sortBysalarycomparator implements Comparator<employee>
{
	public int compare(employee e1,employee e2)
	{
		if(e1.salary > e2.salary)
			return -1;
		else if(e1.salary > e2.salary)
			return 1;
		return 0;
	}
}
class employee implements Comparable<employee>
{
	String first_name,last_name;
	int age;
	double salary;
	
	public employee(String f,String l,int a,double sal)
	{
		this.first_name = f;
		this.last_name = l;
		this.age = a;
		this.salary = sal;
	}
	public int compareTo(employee e)
	{
		if(this.first_name.compareTo(e.first_name) != 0)
		{
			return this.first_name.compareTo(e.first_name);
		}
		else
		{
			return this.last_name.compareTo(e.last_name);
		}
	}
}
class question_2
{
	public static void main(String args[])
	{
		ArrayList<employee>  emp = new ArrayList<employee>();
		employee e;
		emp.add(new employee("Shiva","Kumar",22,345.53));
		emp.add(new employee("Raju","bhairava",23,123.53));
		emp.add(new employee("Mohit","Maharaj",24,234.5));
		emp.add(new employee("Garuda","anand",25,678.53));
		emp.add(new employee("Shyam","modi",26,389.53));
		Collections.sort(emp);
		System.out.println("Sorting By Name:");
		for(employee e1:emp)
		{
			System.out.println(e1.first_name + " " + e1.last_name + " " + e1.salary);
		}
		
		System.out.println();
		System.out.println("Sorting By Salary:");
		Collections.sort(emp,new sortBysalarycomparator());
		for(employee e1:emp)
		{
			System.out.println(e1.first_name + " " + e1.last_name+" "+ e1.age + " " + e1.salary);
		}		
	}
}


