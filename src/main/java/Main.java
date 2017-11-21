import item.Item;

public class Main {

	public static void main(Item item) throws Exception {
		System.out.println(item.getDescription());
	}
	
	public Item calculateReceipt(Item aa){
		
		
		aa.setDescription("pippo");
		return aa;
	}
	
}
