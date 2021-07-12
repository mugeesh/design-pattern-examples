package com.designpattern2.structural.facade;

//reference : https://www.youtube.com/watch?v=B1Y8fcYrz5o&list=PLF206E906175C7E07&index=14

/*
 * Same goes for the Facade Design Pattern. 
 * It hides the complexities of the system and provides an interface to the client 
 * from where the client can access the system.
 */
/* 
 * Example: 
 * the interface JDBC can be called a facade because, 
 * we as users or clients create connection using the “java.sql.Connection” 
 * interface, the implementation of which we are not concerned about. 
 * The implementation is left to the vendor of driver.
 * Ref: https://www.geeksforgeeks.org/facade-design-pattern-introduction/
*/

public class TestBankAccountMain {
	public static void main(String[] args) {
		BankAccountFacade accessingBank = new BankAccountFacade(123456789, 1234);

		accessingBank.withDrawCash(50.0);

		accessingBank.withDrawCash(900.0);

		accessingBank.depositeCash(200.0);
	}
}
