package Classes;
import java.util.Date;


// A class that creates a "Local Spirit" book
public class LocalSpirit extends Book {
	
	final String localSpiritTitle = "Local Spirit: Neighborhood Bars of Orleans Parish";

	public LocalSpirit (double wholesalePrice, double retailPrice, int totalCopiesReceived, 
				 int totalCopiesSold, int totalCopiesGifted, Date dateBulkShipmentReceived) {
	
		super(wholesalePrice, retailPrice, totalCopiesReceived, totalCopiesSold, totalCopiesGifted, dateBulkShipmentReceived);
		
		this.title = localSpiritTitle;
	}
	
}
