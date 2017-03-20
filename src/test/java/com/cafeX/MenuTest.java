package com.cafeX;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MenuTest {
	
	Menu menu = new Menu();

	@Test
	public void testBillCalculation() {
		ArrayList<String> menuItems = new ArrayList <String>();
		menuItems.add("cola");
		menuItems.add("coffee");
		menuItems.add("cheese sandwich");
		double bill = menu.calculateBill(menuItems);
		assertTrue("The total bill should be 3.50 ", 3.50 == bill);	
	}

}
