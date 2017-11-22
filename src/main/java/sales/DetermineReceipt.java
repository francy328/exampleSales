package sales;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import item.Item;

public class DetermineReceipt {

	public List<Item> calculateReceipt(List<Item> listItem) {
		// ogni bene il 10% di tasse tranne: books, food and medical
		// ogni bene importato tassa del 5% no eccezioni

		String exemptProduct = "book,books,food,chocolate,chocolates,headache,pills,chocolate bar";
		String importedProduct = "imported,imported box of chocolates,imported bottle of perfume";

		final double fivePercent = 0.05;
		final double tenPercent = 0.1;

		double salesTax = 0;
		double total = 0;
		
		ArrayList<Item> listReceipt = new ArrayList<Item>();

		for (Item v : listItem) {
			Item receiptItem=new Item();
			// se v.getDescription() contiene books oppure food oppure medico
			// allora no tax
			if (exemptProduct.toUpperCase().contains(v.getDescription().toUpperCase())) {
				// no tax
				total = total + (v.getQuantity() * v.getCost());
				if (importedProduct.toUpperCase().contains(v.getDescription().toUpperCase())) {
					// tax at 5%
					salesTax = salesTax + (v.getCost() * fivePercent);
					receiptItem.setCost(v.getCost()+(v.getCost() * fivePercent));
					receiptItem.setDescription(v.getDescription());
					receiptItem.setQuantity(v.getQuantity());

				}
			} else {
				if (importedProduct.toUpperCase().contains(v.getDescription().toUpperCase())) {
					// tax at 5%
					salesTax = salesTax + (v.getCost() * fivePercent);
					total = total + (v.getQuantity() * v.getCost());
					receiptItem.setCost(v.getCost()+(v.getCost() * fivePercent));
					receiptItem.setDescription(v.getDescription());
					receiptItem.setQuantity(v.getQuantity());

				} else {
					// tax at 10%
					salesTax = salesTax + (v.getCost() * tenPercent);
					total = total + (v.getQuantity() * v.getCost());
					receiptItem.setCost(v.getCost()+(v.getCost() * tenPercent));
					receiptItem.setDescription(v.getDescription());
					receiptItem.setQuantity(v.getQuantity());
				}
			}
			listReceipt.add(receiptItem);
		}

		double saleRounded = Math.round(salesTax * 20.0) / 20.0;

		double saleRounded1 = (double) Math.ceil(salesTax * 20) / 20;

		for (Item v : listReceipt) {
			System.out.print(v.getQuantity() + " ");
			System.out.print(v.getDescription() + " ");
			System.out.println(v.getCost());
		}
		System.out.println("Sales tax: " + saleRounded + "  aaa:  " + saleRounded1);
		System.out.println("Total: " + total);

		return listItem;
	}

}
