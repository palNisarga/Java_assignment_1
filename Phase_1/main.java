package project1;
import java.text.SimpleDateFormat;
import java.util.*;
import project1.AllotSlot;
import project1.Depature;
import project1.Display;
import project1.SearchCar;

public class Main  {

    public static void main(String[] args) {
       
        ArrayList<Integer> avail = new ArrayList<Integer>();
        Collections.addAll(avail, 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
        101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,
        201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,
        301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,318,319,320,
        401,402,403,404,405,406,407,408,409,410,411,412,413,414,415,416,417,418,419,420);
        List<Integer> occupied = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int menu;
        Hashtable<Integer, List<String>> level_1 = new Hashtable<Integer, List<String>>();
        do {
            System.out.println("WELCOME TO PARKING MANAGEMENT");
            System.out.println("1: To Park Vehicle");
            System.out.println("2: To Departure");
            System.out.println("3: Show All Parked Vehicles");
            System.out.println("4: To Search");
            System.out.println("0: To Exit");
            System.out.print("Enter your choice: ");
            menu = input.nextInt();
            switch (menu) {
                case 1: {
                	setSlot a=new settSlot();
                	a.AllotSlot(avail,occupied,level_1);        
                    break;
                }
                case 2: {
               
                ToRemoveFromSlot b = new ToRemoveFromSlot();
                b.RemoveFromSlot(avail,occupied,level_1);
                break;
                   
                }
                case 3: {
                	getAllParkedCars c=new getAllParekedCars();
                	c.AllParkedCars(avail,occupied,level_1);

                    break;
                }
                case 4: {
                	getParkingSlot d= new getParkingSlot();
                	d.ParkingSlot(avail,occupied,level_1);
                }

                case 0: {
                    System.out.println("\nThank you!\n");
                    break;
                }
                default: {
                    System.out.println("Invalid option!\n");
                    //break;
                }
            }
        } while (menu != 0);

    }
}
