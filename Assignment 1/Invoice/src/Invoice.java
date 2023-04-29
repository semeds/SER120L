
public class Invoice {
	
	//instance variables
	private String partNumber;
	private String partDescription;
	public int purchaseQuant;
	public double itemPrice;
	
	
	
	//constructors
	public Invoice() {
		
	}
	
	public Invoice(String partNumber, String partDescription, int purchaseQuant, double itemPrice) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.purchaseQuant = purchaseQuant;
		this.itemPrice = itemPrice;
		
	}
	
	//getters
	public String getPartNumber() {
		return partNumber;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public int getPurchaseQuant() {
		return purchaseQuant;
	}
	
	public double getItemPrice() {
		return itemPrice;
	}

	
	//setters
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public void setPurchaseQuant(int purchaseQuant) {
		this.purchaseQuant = purchaseQuant;
	}
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	//variables for methods
	public double invoiceAmount;
	
	//methods
	public double getInvoiceAmount() {
		if(purchaseQuant < 0) {
			purchaseQuant = 0;
		}
		else if(itemPrice < 0) {
			itemPrice = 0.0;
		} 
		return itemPrice * purchaseQuant;
	}
	
	//@Override
	//public String toString(){
		//return ("The part number is " + partNumber + ". The partDescription is " + partDescription + ". The purchaseQuant is " + purchaseQuant + ". The itemPrice is "  + itemPrice);
		
		
		
	//}
	
	
}
	

