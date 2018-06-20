import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        Tour tr = new Tour("Baguio", "Hiking", 2, 1000, 12);
        ArrayList<String> t = tr.getTourPackage();
        System.out.println(t.get(0));
    }
}
