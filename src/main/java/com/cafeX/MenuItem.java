package com.cafeX;

public class MenuItem {

	private String name;
	private double cost;
	private String type;
	
	public MenuItem (String aName, double aCost, String aType) {
		name = aName;
		cost = aCost;
		type = aType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
