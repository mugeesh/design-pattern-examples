package com.designpattern3.behavioral.chainofresponsibility;

//chain of responsibility
public interface Chain {
	public void setNextChain(Chain nextChain);
	public void calculate(Numbers request);

}
