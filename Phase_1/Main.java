package project1;
import java.text.SimpleDateFormat;
import java.util.*;
import project1.SetSlot;
import project1.ToRemoveFromSlot;
import project1.DisplayAll;
import project1.SearchCar;

public class Main  {

    public static void main(String[] args) {
       
        ArrayList<Integer> Avails = new ArrayList<Integer>();
        Collections.addAll(Avails, 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
        101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,
        201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,
        301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,318,319,320,
        401,402,403,404,405,406,407,408,409,410,411,412,413,414,415,416,417,418,419,420);
        List<Integer> Occupied = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int Menu;
        Hashtable<Integer, List<String>> Level = new Hashtable<Integer, List<String>>();
        do {
            System.out.println("WELCOME TO PARKING MANAGEMENT");
            System.out.println("1: To Park Vehicle");
            System.out.println("2: To Departure");
            System.out.println("3: Show All Parked Vehicles");
            System.out.println("4: To Search");
            System.out.println("0: To Exit");
            System.out.print("Enter your choice: ");
            Menu = input.nextInt();
            switch (Menu) {
                case 1: {
                	SetSlot a=new SetSlot();
                	a.getSlotNumber(Avails,Occupied,Level);        
                    break;
                }
                case 2: {
               
                	ToRemoveFromSlot b = new ToRemoveFromSlot();
                	b.RemoveFromSlot(Avails,Occupied,Level);
                break;
                   
                }
                case 3: {
                	DisplayAll c=new DisplayAll();
                	c.getAllParkedCars(Avails,Occupied,Level);

                    break;
                }
                case 4: {
                	SearchCar d= new SearchCar();
                	d.SearchCarByColorAndRegNo(Avails,Occupied,Level);
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
        } while (Menu != 0);

    }
}
