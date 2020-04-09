package com.riz.designpatterns.decorator;

public class BbqPizza extends Pizza {

	public BbqPizza() {
		description= "BBQ Pizza";
		cost= 100;
	}
	@Override
	public int getCost() {
		return cost;
	}
}
