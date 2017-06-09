package com.tarasevich.nikolai.behaviour.visitor;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}