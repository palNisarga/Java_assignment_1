package project1;
import java.util.*;

public class depature {
    public static void to_depart(ArrayList<Integer> avail, List<Integer> occupied,Hashtable<Integer, List<String>> level_1) {
        if(occupied.isEmpty()) {
            System.out.println("No cars in the slot!");
        }else {
            System.out.println("Enter Slot no");    
        Scanner input = new Scanner(System.in);
        Integer slot_no = input.nextInt();
        for( Map.Entry<Integer, List<String>> entry : level_1.entrySet() )
            {
                Integer key = entry.getKey();
                List<String> values = entry.getValue();
                if(key==slot_no)
                {
                System.out.print("Slot no:"+key+"\t");
                System.out.print("Colour:"+values.get(2)+"\t");
                System.out.println("Reg Plate:"+values.get(1));
                level_1.remove(key);
                occupied.remove(occupied.indexOf(slot_no));
                    avail.add(slot_no);
                }else {
                    System.out.println("No cars in the slot!");
                    break;
                }
            }
        }
    }
     
}
