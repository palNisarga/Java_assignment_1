package project1;
import java.util.*;

public class DisplayAll{
	public static void getAllParkedCars(ArrayList<Integer> Avails, List<Integer> Occupied,Hashtable<Integer, List<String>> Level) {
		if(Occupied.isEmpty()) {
			System.out.println("No cars in the slot!");
		}else {
			for( Map.Entry<Integer, List<String>> entry : Level.entrySet() )
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
