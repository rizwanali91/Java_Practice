package com.riz.designpatterns.decorator;

public class ChickenTopping extends Toppings{

	Pizza pizza;
	
	public ChickenTopping(Pizza pizza) {
		this.pizza= pizza;
		this.pizza.description= pizza.description + ",Chicken";
		this.pizza.cost= pizza.cost+50;
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
