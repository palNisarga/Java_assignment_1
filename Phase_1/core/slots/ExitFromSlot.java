package project1;
import java.util.*;

public class ToRemoveFromSlot {
	public static void RemoveFromSlot(ArrayList<Integer> Avails, List<Integer> Occupied,Hashtable<Integer, List<String>> Level) {
		if(Occupied.isEmpty()) {
			System.out.println("No cars in the slot!");
		}else {
			System.out.println("Enter Slot no");	
        Scanner input = new Scanner(System.in);
		Integer slot_no = input.nextInt();
	    for( Map.Entry<Integer, List<String>> entry : Level.entrySet() )
	        {
	            Integer key = entry.getKey();
	            List<String> values = entry.getValue();
	            if(key==slot_no)
	            {
	            System.out.print("Slot no:"+key+"\t");
	            System.out.print("Colour:"+values.get(2)+"\t");
	            System.out.println("Reg Plate:"+values.get(1));
	            Level.remove(key);
	            Occupied.remove(Occupied.indexOf(slot_no));
	                Avails.add(slot_no);
	            }else {
	            	System.out.println("No cars in the slot!");
	            	break;
	            }
	        }
		}
	}
	 
}

