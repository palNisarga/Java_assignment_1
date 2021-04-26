package project1;
import java.util.*;
import java.text.SimpleDateFormat;

public class DisplayAll{
    public static void getAllParkedCars(ArrayList<Integer> avail, List<Integer> occupied,Hashtable<Integer, List<String>> level_1) {
        if(occupied.isEmpty()) {
            System.out.println("No cars in the slot!");
        }else {
            for( Map.Entry<Integer, List<String>> entry : level_1.entrySet() )
            {
                Integer key = entry.getKey();
                List<String> values = entry.getValue();
                System.out.print("Slot no:"+key+"\t");
                System.out.print("Colour:"+values.get(2)+"\t");
                System.out.print("Reg Plate:"+values.get(1)+"\t");
                System.out.print("Floor:"+values.get(3)+"\t");
                System.out.println("Parking Date:"+values.get(4));
            }
        }
    }
}
