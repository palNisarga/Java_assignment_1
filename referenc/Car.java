package project1;

import java.sql.*;
import java.util.*;

public class Car {
	static Scanner input = new Scanner(System.in);
	static MySQL mysql=new MySQL();
	static Connection con = mysql.create();
	
	public static void park() throws SQLException {
		System.out.println("Enter Colour");
    	String colour = input.next();
    	System.out.println("Enter Reg Plate");
    	String regPlate = input.next();
    	
    	System.out.println("Alloting a slot..."+"\n");
    	Statement stmt= con.createStatement();
    	String sltQuery = "Select * from vehicle";
    	ResultSet rs = stmt.executeQuery(sltQuery);
    	boolean flag=false;
    	while(rs.next()) {
    		if(rs.getString(2)==null) {
    			try {
    			String updQuery = "UPDATE vehicle SET registrationNumber=?,colour=?,time=NOW() WHERE slot=?;";
    			PreparedStatement statement = con.prepareStatement(updQuery);
    			statement.setString(1, regPlate);
    			statement.setString(2, colour);
    			statement.setString(3, Integer.toString(rs.getInt(1)));
    			statement.executeUpdate();
    			System.out.println("Slot Alloted");
    			System.out.println();
    			flag=true;
    			break;
    			}
    			catch (SQLException throwable) {
                    System.out.println(throwable.getMessage());
                }
    	}
    	}
    	if(!flag) {
    		try{
    			String insQuery = "INSERT INTO vehicle(registrationNumber,colour,time) values(?,?,NOW());";
    			PreparedStatement statement = con.prepareStatement(insQuery);
    			statement.setString(1, regPlate);
    			statement.setString(2, colour);
    			statement.executeUpdate();
    			System.out.println("Slot Alloted");
    		}
    		catch (SQLException throwable) {
                System.out.println(throwable.getMessage());
            }
    	}
         String sltQuery2 = "SELECT * FROM vehicle WHERE registrationNumber=?;";
         PreparedStatement statement = con.prepareStatement(sltQuery2);
         statement.setString(1, regPlate);
         ResultSet rs1 = statement.executeQuery();
         while (rs1.next()) {
        	 System.out.println("________Ticket________");
        	 System.out.println("Registration Number:"+rs1.getString(2));
        	 System.out.println("Vehicle Colour :"+rs1.getString(3));
        	 System.out.println("Entry Time :"+rs1.getTimestamp(4));
        	 System.out.println("Slot Number :"+ rs1.getInt(1));
         	}
	}
	
	public static void exit(){
        System.out.println("Enter Reg Plate");
    	String regPlate = input.next();
        String updQuery2="UPDATE vehicle SET registrationNumber=?,colour=?,time=? WHERE registrationNumber=?";
        try {
            PreparedStatement statement=con.prepareStatement(updQuery2);
            statement.setString(1,null);
            statement.setString(2,null);
            statement.setString(3,null);
            statement.setString(4,regPlate);
            System.out.println();
            System.out.println("Car exiting...");
            statement.executeUpdate();
        } catch (SQLException throwable) {
            System.out.println(throwable.getMessage());
        }
    }
}
