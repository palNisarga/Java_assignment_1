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
				MysqlService.SetSlot();
				break;
			case(2):
				MysqlService.ToRemoveFromSlot();
				break;
			case(3):
				MysqlService.getSlotNumberByRegNumber();
				break;
                        case(4):
				MysqlService.SearchCarByColor();
				break;
                        case(5):
				MysqlService.SearchSlotByColor();//
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
