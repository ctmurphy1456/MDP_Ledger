package Classes;
import java.util.Date;

public class Book {
	
	String title;
	double costPerBook;
	double wholesalePrice;
	double retailPrice;
	int totalCopiesReceived;
	int totalCopiesRemaining; 
	int totalCopiesSold;
	int totalCopiesGifted;
	Date dateBulkShipmentReceived;
	
	public Book(double wholesalePrice, double retailPrice, int totalCopiesReceived, int totalCopiesSold, int totalCopiesGifted, Date dateBulkShipmentReceived)
	{
		
		this.wholesalePrice = wholesalePrice;
		this.retailPrice = retailPrice;
		this.totalCopiesReceived = totalCopiesReceived;
		this.totalCopiesSold = totalCopiesSold;
		this.totalCopiesGifted = totalCopiesGifted;
		this.dateBulkShipmentReceived = dateBulkShipmentReceived;
		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getCostPerBook() {
		return costPerBook;
	}

	public void setCostPerBook(double costPerBook) {
		this.costPerBook = costPerBook;
	}

	public double getWholesalePrice() {
		return wholesalePrice;
	}

	public void setWholesalePrice(double wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public int getTotalCopiesReceived() {
		return totalCopiesReceived;
	}

	public void setTotalCopiesReceived(int totalCopiesReceived) {
		this.totalCopiesReceived = totalCopiesReceived;
	}

	// Handles calculations to get remaining total
	public int getTotalCopiesRemaining() {
		this.totalCopiesRemaining = (int)((getTotalCopiesReceived() - (getTotalCopiesSold() + getTotalCopiesGifted())));
		return totalCopiesRemaining;
	}

	// Total Copies Remaining should be completely controlled by total sold and total gifted
	/** public void setTotalCopiesRemaining(short totalCopiesRemaining) {
		this.totalCopiesRemaining = totalCopiesRemaining;
	} **/ 

	public int getTotalCopiesSold() {
		return totalCopiesSold;
	}

	public void setTotalCopiesSold(int totalCopiesSold) {
		this.totalCopiesSold = totalCopiesSold;
	}
	
	public int getTotalCopiesGifted() {
		return totalCopiesGifted;
	}
	
	public void setTotalCopiesGifted(int totalCopiesGifted){
		this.totalCopiesGifted = totalCopiesGifted;
	}

	public Date getDateBulkShipmentReceived() {
		return dateBulkShipmentReceived;
	}

	public void setDateBulkShipmentReceived(Date dateBulkShipmentReceived) {
		this.dateBulkShipmentReceived = dateBulkShipmentReceived;
	}
	
	// Other methods
	public void recordSale(Sale sale) {
		this.totalCopiesSold = this.totalCopiesSold + sale.getSaleTransaction().quantity;
	}
	
	public void recordGiftedBook(Gift bookGifted) {
		this.totalCopiesGifted = this.totalCopiesGifted + bookGifted.getQuantityGifted(); 
	}

	
	
}