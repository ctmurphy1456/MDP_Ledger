package Classes;

public class Transaction {

	String paymentType;
	int quantity;
	double salePrice; 
	double shippingCost;
	double taxes;
	double fees;
	double total;

	public Transaction(String paymentType, int quantity, double salePrice, double shippingCost, double taxes, double fees) {
		super();
		this.paymentType = paymentType;
		this.quantity = quantity;
		this.salePrice = salePrice;
		this.shippingCost = shippingCost;
		this.taxes = taxes;
		this.fees = fees;
		this.total = salePrice + shippingCost + taxes + fees;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public double getTotal() {
		this.total = (this.salePrice * this.quantity) + this.shippingCost + this.taxes + this.fees;
		return total;
	}
	
	
}