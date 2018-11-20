package Classes;
import java.util.Date;

import Classes.Sale.SaleType;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dateCopiesReceived = new Date(2018, 12, 28);
		LocalSpirit localSpirit = new LocalSpirit(42, 69.99, 2500, 0, 0, dateCopiesReceived); 

		Sale.SaleType saleType = SaleType.RETAIL;
		Transaction newTransaction = new Transaction("PayPal", 3, 59.99, 0, 0, -2.33); 
		Sale newSale = new Sale(newTransaction, saleType, "Colin Lacy", localSpirit, false, "Ashly Lacy", false, false, "201 Saint Chalres Ave, New Orleans LA 70170");
		Gift giftedBook = new Gift(localSpirit, "SilverSlipper", 1, "Ken");
		
		System.out.println("Total number of Local Spirit initially received: " + localSpirit.getTotalCopiesReceived());
		localSpirit.recordSale(newSale);
		System.out.println("Books were sold in the amount of " + newSale.getSaleTransaction().getQuantity());
		System.out.println("Total copies remaining is " + localSpirit.getTotalCopiesRemaining());
		localSpirit.recordGiftedBook(giftedBook);
		System.out.println("Books were gifted in the amount of " + giftedBook.getQuantityGifted());
		System.out.println("Total copies remaining is " + localSpirit.getTotalCopiesRemaining());
		
	}

}
