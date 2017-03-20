package com.cafeX;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class MenuTest {

	Menu menu = new Menu();

	@Test
	public void testDrinkWithcoldfood() {
		ArrayList<String> menuItems = new ArrayList<String>();
		menuItems.add("cola");
		menuItems.add("coffee");
		menuItems.add("cheese sandwich");
		String bill = menu.calculateBill(menuItems);
		assertEquals("The total bill should be 3.85 ", "3.85", bill);
	}

	@Test
	public void testDrinkWithHotfood() {
		ArrayList<String> menuItems = new ArrayList<String>();
		menuItems.add("cola");
		menuItems.add("coffee");
		menuItems.add("steak sandwich");
		String bill = menu.calculateBill(menuItems);
		assertEquals("The total bill should be 7.20 ", "7.20", bill);
	}

	@Test
	public void testDrinkWithHotAndColdfood() {
		ArrayList<String> menuItems = new ArrayList<String>();
		menuItems.add("cola");
		menuItems.add("coffee");
		menuItems.add("cheese sandwich");
		menuItems.add("steak sandwich");
		String bill = menu.calculateBill(menuItems);
		assertEquals("The total bill should be 9.60 ", "9.60", bill);
	}

	@Test
	public void testColaOnly() {
		ArrayList<String> menuItems = new ArrayList<String>();
		menuItems.add("cola");
		menuItems.add("cola");
		menuItems.add("cola");
		String bill = menu.calculateBill(menuItems);
		assertEquals("The total bill should be 1.50 ", "1.50", bill);
	}

	@Test
	public void testCoffeeOnly() {
		ArrayList<String> menuItems = new ArrayList<String>();
		menuItems.add("coffee");
		menuItems.add("coffee");
		menuItems.add("coffee");
		String bill = menu.calculateBill(menuItems);
		assertEquals("The total bill should be 3.00 ", "3.00", bill);
	}

	@Test
	public void testHotFoodOnly() {
		ArrayList<String> menuItems = new ArrayList<String>();
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		String bill = menu.calculateBill(menuItems);
		assertEquals("The total bill should be 16.20 ", "16.20", bill);
	}

	@Test
	public void testColdFoodOnly() {
		ArrayList<String> menuItems = new ArrayList<String>();
		menuItems.add("cheese sandwich");
		menuItems.add("cheese sandwich");
		menuItems.add("cheese sandwich");
		String bill = menu.calculateBill(menuItems);
		assertEquals("The total bill should be 6.60 ", "6.60", bill);
	}
	
	@Test
	public void testServicechargeOver20() {
		ArrayList<String> menuItems = new ArrayList<String>();
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		menuItems.add("steak sandwich");
		String bill = menu.calculateBill(menuItems);
		assertEquals("The total bill should be 132.50 ", "132.50", bill);
	}

}
