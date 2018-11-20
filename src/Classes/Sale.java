package Classes;

public class Sale {

	Transaction saleTransaction;
	SaleType wholesaleOrRetail;
	String customer;
	Book bookSold;
	Boolean wantsPersonalized;
	String receipientsName; 
	Boolean saleComplete;
	Boolean toBeDelivered;
	String deliveryAddress;
	
	public enum SaleType {
		WHOLESALE, RETAIL; 
	}
	
	public Sale(Transaction saleTransaction, SaleType wholesaleOrRetail, String customer, Book bookSold,
			Boolean wantsPersonalized, String receipientsName, Boolean saleComplete, Boolean toBeDelivered,
			String deliveryAddress) {
		super();
		this.saleTransaction = saleTransaction;
		this.wholesaleOrRetail = wholesaleOrRetail;
		this.customer = customer;
		this.bookSold = bookSold;
		this.wantsPersonalized = wantsPersonalized;
		this.receipientsName = receipientsName;
		this.saleComplete = saleComplete;
		this.toBeDelivered = toBeDelivered;
		this.deliveryAddress = deliveryAddress;
	}

	public Transaction getSaleTransaction() {
		return saleTransaction;
	}

	public void setSaleTransaction(Transaction saleTransaction) {
		this.saleTransaction = saleTransaction;
	}

	public SaleType getWholesaleOrRetail() {
		return wholesaleOrRetail;
	}

	public void setWholesaleOrRetail(SaleType wholesaleOrRetail) {
		this.wholesaleOrRetail = wholesaleOrRetail;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Book getBookSold() {
		return bookSold;
	}

	public void setWhichBookSold(Book bookSold) {
		this.bookSold = bookSold;
	}

	public Boolean getWantsPersonalized() {
		return wantsPersonalized;
	}

	public void setWantsPersonalized(Boolean wantsPersonalized) {
		this.wantsPersonalized = wantsPersonalized;
	}

	public String getReceipientsName() {
		return receipientsName;
	}

	public void setReceipientsName(String receipientsName) {
		this.receipientsName = receipientsName;
	}

	public Boolean getSaleComplete() {
		return saleComplete;
	}

	public void setSaleComplete(Boolean saleComplete) {
		this.saleComplete = saleComplete;
	}

	public Boolean getToBeDelivered() {
		return toBeDelivered;
	}

	public void setToBeDelivered(Boolean toBeDelivered) {
		this.toBeDelivered = toBeDelivered;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	} 
	
	
}
