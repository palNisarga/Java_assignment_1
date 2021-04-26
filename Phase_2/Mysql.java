package parking_lot_management;

import java.sql.*;

public class Mysql{  
	public static void main() {
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db?characterEncoding=utf8","jk","12345678");    
		//Statement stmt=con.createStatement();  
		//ResultSet rs=stmt.executeQuery("select * from student");  
		//while(rs.next())  
			//System.out.println(rs.getString(1)+","+rs.getInt(2));  
		//con.close();  
		}
	catch(Exception e){ 
		System.out.println(e);
		}  
}
}
