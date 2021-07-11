package com.designpattern2.structural.composite;

// thoery
//https://refactoring.guru/design-patterns/composite
//code
//https://www.geeksforgeeks.org/composite-design-pattern/
//https://www.youtube.com/watch?v=2HUnoKyC9l0&list=PLF206E906175C7E07&index=18
public class Company {
	public static void main(String[] args) {
		
		Developer dev1 = new Developer(100, "Mugeesh Husain", "Developer");
		Developer dev2 = new Developer(101, "Haren", "IT Developer");
		CompanyDirectory engDirectory = new CompanyDirectory();
		engDirectory.addEmployee(dev1);
		engDirectory.addEmployee(dev2);

		Manager man1 = new Manager(200, "Shah Irani", "CTO Manager");
		Manager man2 = new Manager(201, "Ramon", "IT Lead Manager");

		CompanyDirectory accDirectory = new CompanyDirectory();
		accDirectory.addEmployee(man1);
		accDirectory.addEmployee(man2);

		CompanyDirectory directory = new CompanyDirectory();
		directory.addEmployee(engDirectory);
		directory.addEmployee(accDirectory);
		directory.showEmployeeDetails();
	}

}