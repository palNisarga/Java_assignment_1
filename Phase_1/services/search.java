package project1;
import java.util.*;
import java.text.SimpleDateFormat;

public class search {
    public static void getParkingSlot(ArrayList<Integer> avail, List<Integer> occupied,Hashtable<Integer, List<String>> level_1) {
        if(occupied.isEmpty()) {
            System.out.println("No cars in the slot!");
        }else {
            System.out.println("Select 1: Search Cars by Color");
            System.out.println("Select 2: Search Slot Number by Car Reg.No");
            System.out.println("Select 3: Search Slot Numbers by Car Color");
            System.out.println("0: To Exit");
            System.out.print("Enter your choice: ");
            Scanner input = new Scanner(System.in);
            int menu = input.nextInt();
            switch (menu) {
                case 1: {
                    System.out.println("Enter color");
                    String Clr= input.next();
                    int count=0;
                    for( Map.Entry<Integer, List<String>> entry : level_1.entrySet() ) {
                        List<String> values = entry.getValue();
                        
                            if(Clr.equals(values.get(2))) {
                                System.out.println("Reg Plate:"+values.get(1));
                                count++;
                            }
                    }
                    if(count==0) {
                        System.out.println("Not Found");
               
                    }
                    
                    break;
                }
                case 2: {
                    System.out.println("Enter Reg No of your Car");
                    String RegNo= input.next();
                    int count=0;
                    for( Map.Entry<Integer, List<String>> entry : level_1.entrySet() ) {
                        List<String> values = entry.getValue();
                        if(RegNo.equals(values.get(1))) {
                            System.out.println("Slot Number:"+ values.get(0));
                            count++;
                        }
                    }
                    if(count==0) {
                        System.out.println("Not Found");
               
                    }
                break;
                   
                }
                case 3: {
                    System.out.println("Enter color");
                    String Clr= input.next();
                    int count=0;
                    for( Map.Entry<Integer, List<String>> entry : level_1.entrySet() ) {
                        List<String> values = entry.getValue();
                        if(Clr.equals(values.get(2))) {
                            System.out.println("Slot Number:"+values.get(0));
                            count++;
                        }
                        
                    }
                    if(count==0) {
                        System.out.println("Not Found");
               
                    }
                    break;
                }
                
                case 0: {
                    System.out.println("\nThank you!\n");
                    break;
                }
                default: {
                    System.out.println("Invalid option!\n");
                    //break;
                }

            }}}}
