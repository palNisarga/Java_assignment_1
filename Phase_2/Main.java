package parking_lot;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.sql.*;

public class Main {

	public static void main(String[] args) throws IOException, SQLException {
		Scanner input = new Scanner(System.in);
	    int menu = 0;
		do {
			Menu.options();
			menu = input.nextInt();
      
		switch(menu) {
			case(1):
				MysqlDB.SetSlot();
				break;
			case(2):
				MysqlDB.ToRemoveFromSlot();
				break;
			case(3):
				MysqlDB.getSlotNumberByRegNumber();
				break;
      case(4):
				MysqlDB.SearchCarByColor();
				break;
      case(5):
				MysqlDB.SearchSlotByColor();//
				break;
			case(0):
         System.out.println("\nThank you!\n");
	       break;
       default: {
	        System.out.println("Invalid option!\n");
	         //break;
	        }
			  }	
		}
		while(menu!=0);
		
	}

}
