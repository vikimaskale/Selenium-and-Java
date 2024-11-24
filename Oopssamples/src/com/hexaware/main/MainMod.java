package com.hexaware.main;

import java.util.HashMap;

import com.hexaware.entity.Company;
import com.hexaware.entity.Employee;
import com.hexaware.entity.Manager;
import com.hexaware.entity.Person;

public class MainMod {

	public static void main(String[] args) {
		System.err.println(Person.country);
		Person.checkStatic();
		Person personObj= new Person(); //call to default constructor
		System.out.println(personObj);
		personObj.setAadhaarNumber(20001333244555L);
		personObj.setName("Haritha");
		personObj.setAge(25);
		personObj.setAddress("Third cross Road, Thousand lights, Chennai");
		personObj.checkStatic();
		System.out.println(personObj.country);
		System.out.println(personObj);
		
		//Parameterized constructor
		Person person2= new Person(797979L, "Harish", 32, "HH Street, Bangalore");
		System.out.println(person2);
		
		
		
		Employee employeeObj= new Employee(100,"manager", 1797778L, "Sharul", 38, "ABC Street Texas");
		System.out.println(employeeObj);
		
		Manager managerObj= new Manager(101, "manager", 9384798780L, "Rajni", 40, "Ghansoli, Mumbai",
				"Meta project", 50000);
		
		System.out.println(managerObj);
		
		Employee employeeObj1= new Employee(101, "developer", 102383L, "Hema", 20,
				"Santome, Chennai");
		Employee employeeObj2= new Employee(102, "tester", 49859L, "Ranjini", 25,
				"Rui, Nanded");
		
//		Employee[] employeeArray= {employeeObj1, employeeObj2};
		HashMap<Integer, Employee>map=new HashMap<Integer, Employee>();
		map.put(employeeObj2.getEmployeeId(), employeeObj2);
		map.put(employeeObj1.getEmployeeId(), employeeObj1);
		map.put(employeeObj.getEmployeeId(), employeeObj);
		
		Company companyObj= new Company("hexaware", map);
		System.out.println(companyObj);
		companyObj.displayMap();
		
		
	}

}





