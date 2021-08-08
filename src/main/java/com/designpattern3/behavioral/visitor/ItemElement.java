package com.designpattern3.behavioral.visitor;
interface ItemElement
{
    public int accept(ShoppingCartVisitor visitor);
}
