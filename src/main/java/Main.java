import java.util.ArrayList;
import java.util.List;

import item.Item;
import sales.DetermineReceipt;

public class Main {

	public static void main(String[] args) throws Exception {
		ArrayList<Item> vals = new ArrayList<Item>();

		
		//1 test case
//		Item val1 = new Item();
//		val1.setQuantity(1);
//		val1.setDescription("book");
//		val1.setCost(12.49);
//
//		vals.add(val1);
//
//		val1 = new Item();
//		val1.setQuantity(1);
//		val1.setDescription("music CD");
//		val1.setCost(16.49);
//
//		vals.add(val1);
//
//		val1 = new Item();
//		val1.setQuantity(1);
//		val1.setDescription("chocolate bar");
//		val1.setCost(0.85);
//
//		vals.add(val1);
		
		
		
		// secondo 
		Item val1 = new Item();
		val1.setQuantity(1);
		val1.setDescription("imported box of chocolates");
		val1.setCost(10.00);

		vals.add(val1);

		val1 = new Item();
		val1.setQuantity(1);
		val1.setDescription("imported bottle of perfume");
		val1.setCost(47.50);

		vals.add(val1);

		


		DetermineReceipt receipt = new DetermineReceipt();
		List<Item> va = receipt.calculateReceipt(vals);

		
		System.out.println("fine");
	}



}
