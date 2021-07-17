package com.designpattern3.behavioral.chainofresponsibility;

//https://www.youtube.com/watch?v=jDX6x8qmjbA&list=PLF206E906175C7E07&index=22
/*
 * Behavioral design patterns : are concerned with the interaction and responsibility of objects.
 * In these design patterns, the interaction between the objects should be in such a way 
 * that they can easily talk to each other and still should be loosely coupled.
 */

//A Chain of Responsibility Pattern says that just 
//"avoid coupling the sender of a request to its receiver by giving multiple objects a 
//chance to handle the request". 
//For example, an ATM uses the Chain of Responsibility design pattern in money giving process.

public class TestCalculatorExample {
	public static void main(String[] args) {
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubtractNumbers();
		Chain chainCalc3 = new MulNumbers();
		Chain chainCalc4 = new DivideNumbers();

		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		//Numbers request=new Numbers(4, 2, "add");
		Numbers request=new Numbers(4, 2, "pow");
		chainCalc1.calculate(request);
		
		//Numbers request1=new Numbers(4, 2, "mul");
		//chainCalc2.calculate(request1);
	}
}
