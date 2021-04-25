package project1;
import java.text.SimpleDateFormat;
import java.util.*;

public class setSlot {
    public static void AllotSlot(ArrayList<Integer> avail, List<Integer> occupied,Hashtable<Integer, List<String>> level_1) {
        Scanner input = new Scanner(System.in);
        String floor = " ";
        List<String> array = new ArrayList<String>(10);
        Date date = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy,E HH:mm:ss");
                String strDate = formatter.format(date);
               
        System.out.println("Enter Colour");
                String colour = input.next();
               
                System.out.println("Enter Reg Plate");
                String regPlate = input.next();
               
                System.out.println("Alloting a slot..."+"\n");
                int min = (int) Collections.min(avail);
               
                if(min<100)
                {
                floor = "Ground Floor";
                }
                else if(min>100 && min<200)
                {
                floor = "First Floor";
                }
                else if(min>100 && min<200)
                {
                floor = "Second Floor";
                }
                else if(min>200 && min<300)
                {
                floor = "Third Floor";
                }
                else if(min>300 && min<400)
                {
                floor = "Fourth Floor";
                }
                else
                {
                floor = "Fifth Floor";
                }
                array.add(Integer.toString(min));
                array.add(regPlate);
                array.add(colour);
                array.add(floor);
                array.add(strDate);
                avail.remove(avail.indexOf(min));
                occupied.add(min);
                level_1.put(min,array);
               
                System.out.println("Floor: "+floor+"\n"+"Slot no: "+min+"\n"+"Colour:"+colour+"\n"+"Reg Plate:"+regPlate+"\n"+"Date:"+strDate+"\n\n");
    }
}
