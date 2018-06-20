import java.util.ArrayList;

public class Tour
{
	ArrayList<String> tpackage;
	String location;
	String tourType;
	int participants;
	int price;
	int discount;
	
	public Tour(String l, String t, int p, int pr, int d) {
		location = l;
		tourType = t;
		participants = p;
		price = pr;
		discount = d;
	}

	public void setTourPackage(ArrayList<String> tp) {
		tpackage = new ArrayList<String>();
		tpackage.add(location + tourType + participants + price + discount);
	}

	public ArrayList<String> getTourPackage() {
		return(tpackage);
	}

	public int getTPackagePrice() {
		int tPackagePrice = price * (1- (discount * 100));
		return(tPackagePrice);
	}
}
