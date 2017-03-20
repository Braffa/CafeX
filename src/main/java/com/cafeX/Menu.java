package com.cafeX;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {

	private Map<String, MenuItem> getMenu() {
		Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
		menu.put("cola", new MenuItem("cola", 0.50, "drink"));
		menu.put("coffee", new MenuItem("coffee", 1.00, "drink"));
		menu.put("cheese sandwich", new MenuItem("cheese sandwich", 2.00, "cold"));
		menu.put("steak sandwich", new MenuItem("steak sandwich", 4.50, "hot"));
		return menu;
	}

	public String calculateBill(List<String> menuItems) {
		Map<String, MenuItem> menu = getMenu();
		double totalBill = 0.00;
		int service = 0;
		for (String item : menuItems) {
			if (menu.containsKey(item)) {
				totalBill += menu.get(item).getCost();
				if (menu.get(item).getType().equals("cold") && service < 10) {
					service = 10;
				} else if (menu.get(item).getType().equals("hot") && service < 20) {
					service = 20;
				}
			}
		}
		double serviceCharge = 0.00;
		switch (service) {
		case 10:
			serviceCharge = totalBill * 0.10;
			break;
		case 20:
			serviceCharge = totalBill * 0.20;
			break;
		default:
			serviceCharge = 0.00;
		}
		if (serviceCharge > 20.00) {
			serviceCharge = 20;
		}
		DecimalFormat f = new DecimalFormat("##.00");
		return f.format(totalBill + serviceCharge);
	}
}
