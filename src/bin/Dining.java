import java.util.ArrayList;

public class Dining
{
	ArrayList<String> dpackage;
	String location;
	String restaurant;
	String mealType;
	int price;
	int discount;
	
	public Dining(String l, String r, String type, int p, int d) {
		location = l;
		reaturant = r;
		mealType = type;
		price = p;
		discount = d;
	}

	public void setDiningPackage(ArrayList<String> tp) {
		dpackage = new ArrayList<String>();
		dpackage.add(location, restaurant, mealType, price, discount);
	}

	public ArrayList<String> getDiningPackage() {
        return(dpackage);
	}

	public int getDPackagePrice() {
		int tPackagePrice = price * (1- (discount * 100));
	}
}
