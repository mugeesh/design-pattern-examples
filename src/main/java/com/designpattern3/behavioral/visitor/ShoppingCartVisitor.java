package com.designpattern3.behavioral.visitor;

interface ShoppingCartVisitor {

	int visit(Book book);

	int visit(Fruit fruit);
}
