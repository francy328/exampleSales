package test;

import java.util.ArrayList;
import java.util.List;

import item.Item;
import junit.framework.TestCase;
import sales.DetermineReceipt;

public class Test1 extends TestCase{
	
	public void test1() throws Exception {
		
		ArrayList<Item> vals = new ArrayList<Item>();
		
		Item val1 = new Item();
		val1.setQuantity(1);
		val1.setDescription("book");
		val1.setCost(12.49);
		
		vals.add(val1);
		
		val1 = new Item();
		val1.setQuantity(1);
		val1.setDescription("music CD");
		val1.setCost(14.99);
		
		vals.add(val1);
		
		val1 = new Item();
		val1.setQuantity(1);
		val1.setDescription("chocolate bar");
		val1.setCost(0.85);
		
		vals.add(val1);
		
		
		DetermineReceipt receipt = new DetermineReceipt();
		List<Item> va =  receipt.calculateReceipt(vals);

		
	}
	
	
	
	
//	public void test2() throws Exception {
//
//		Item val1 = new Item();
//		val1.setDescription("pippo");
//
//		ArrayList<Item> vals = new ArrayList<Item>();
//		
//		DetermineReceipt receipt = new DetermineReceipt();
//		List<Item> va =  receipt.calculateReceipt(vals);
//
//		System.out.println("dddd");
//		System.out.println(va.get(0).getDescription());
//	}
	

	
}
