package sales;

import java.util.List;

import item.Item;

public class DetermineReceipt {
	
public List<Item> calculateReceipt(List<Item> listItem){
		//ogni bene il 10% di tasse tranne: books, food and medical 
		//ogni bene importato tassa del 5% no eccezioni
		
		for (Item v : listItem){
			System.out.println(v.getQuantity());
			System.out.println(v.getDescription());
			System.out.println(v.getCost());
			
		}
		
		
		return listItem;
	}
	
	

}
