package com.riz.designpatterns.decorator;

public abstract class Pizza {
	
	public String description= "Unnamed pizza";
	public int cost=0;
	
	public String getDescrption() {
		return description;
	}
	
	public abstract int getCost();
}
