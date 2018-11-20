package Classes;

import java.util.Date;

public class Gift {

	Book bookGifted;
	String giftedTo;
	int quantityGifted; 
	String deliveredBy; 
	Date receivedOn;
	
	public Gift(Book bookGifted, String giftedTo, int quantityGifted, String deliveredBy) {
		super();
		this.bookGifted = bookGifted;
		this.giftedTo = giftedTo;
		this.quantityGifted = quantityGifted;
		this.deliveredBy = deliveredBy;
	}

	public Book getBookGifted() {
		return bookGifted;
	}

	public void setBookGifted(Book bookGifted) {
		this.bookGifted = bookGifted;
	}

	public String getGiftedTo() {
		return giftedTo;
	}

	public void setGiftedTo(String giftedTo) {
		this.giftedTo = giftedTo;
	}

	public int getQuantityGifted() {
		return quantityGifted;
	}

	public void setQuantityGifted(int quantityGifted) {
		this.quantityGifted = quantityGifted;
	}

	public String getDeliveredBy() {
		return deliveredBy;
	}

	public void setDeliveredBy(String deliveredBy) {
		this.deliveredBy = deliveredBy;
	}

	public Date getReceivedOn() {
		return receivedOn;
	}

	public void setReceivedOn(Date receivedOn) {
		this.receivedOn = receivedOn;
	} 
	
	
}
