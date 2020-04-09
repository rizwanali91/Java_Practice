package com.riz.designpatterns.decorator;

public class MeatLoversPizza  extends Pizza {

	public MeatLoversPizza() {
		description= "BBQ Pizza";
		cost= 120;
	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

}
