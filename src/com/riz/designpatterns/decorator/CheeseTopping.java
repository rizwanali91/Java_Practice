package com.riz.designpatterns.decorator;

public class CheeseTopping extends Toppings{

	Pizza pizza;
	
	public CheeseTopping(Pizza pizza) {
		this.pizza= pizza;
		this.pizza.description= pizza.description + ",Cheese";
		this.pizza.cost= pizza.cost+20;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.description;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost();
	}

}
