import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.sql.*;

public class ProductDatabase
{

	// public AssetManagerDatabase() {
		
	// }

	public static void retrieveFromDB(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		boolean v = false;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM packages;");
			while(rs.next()) {
				String[] str = {
					rs.getString("id"),
					rs.getString("location"),
					rs.getString("number"),
					rs.getString("activity"),
					rs.getString("restaurant"),
					rs.getString("meal"),
					rs.getString("roomtype"),
					rs.getString("days"),
					rs.getString("price")
				};
                for(int x = 0; x < str.length; x++ ) {
                    System.out.println(str[x]);
                }
                System.out.println("##########");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try { if(stmt !=null) {stmt = null;}} catch(Exception e) {};
			try { if(rs !=null) {rs = null;}} catch(Exception e) {};
		}
		// return(null);
	}

    public static void main(String[] args) {
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/productdb?user=bootcamp&password=dict123&serverTimezone=UTC&useSSL=false");
			retrieveFromDB(conn);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
    }
}
