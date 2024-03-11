import java.sql.*;
import com.mysql.cj.jdbc.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url = "jdbc:mysql://localhost:3306/w3schools";
			String username = "root";
			String password = "888277723";
			
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM customers");
			while(rs.next()) {
				String name = rs.getString("CustomerName");
				System.out.println(name);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println();
		}
	}
}
