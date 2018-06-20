import java.util.ArrayList;

public class Accomodations
{
	ArrayList<String> apackage;
	String location;
	String type;
	String size;
	int price;
	int discount;
	
	public Accomodations(String l, String t, String type, int p, int pr, int d) {
		location = l;
		type = t;
		size = p;
		price = pr;
		discount = d;
	}

	public void setTourPackage(ArrayList<String> tp) {
		apackage = new ArrayList<String>();
		apackage.add(location, type, size, price, discount);
	}

	public ArrayList<String> getTourPackage() {
		return(apackage);
	}

	public int getAPackagePrice() {
		int aPackagePrice = price * (1- (discount * 100));
	}
}
