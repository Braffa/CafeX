package com.cafeX;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
	private Map<String, Double> getMenu () {
		
		Map<String, Double> menu = new HashMap<String, Double>();
		menu.put("cola", new Double(0.50));
		menu.put("coffee", new Double(1.00));
		menu.put("cheese sandwich", new Double(2.00));
		menu.put("steak sandwich", new Double(4.50));
		return menu;
	}

	public double calculateBill (List<String> menuItems) {
		Map<String, Double> menu = getMenu (); 
		double totalBill = 0.00;
		for (String item : menuItems) {
			if (menu.containsKey(item)) {
				totalBill += menu.get(item);
			}
		}
		return totalBill;
	}
}
