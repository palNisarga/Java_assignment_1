package project1;
import java.text.SimpleDateFormat;
import java.util.*;


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
            System.out.println("3: Show All Perked Vehicles");
            System.out.println("0: To Exit");
            System.out.print("Enter your choice: ");
            menu = input.nextInt();
            switch (menu) {
                case 1: {
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
                       
                    break;
                }
                case 2: {
                System.out.println("Enter Slot no");
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
                        break;
                        }
                    }
                break;
                   
                }
                case 3: {
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
            }
        } while (menu != 0);

    }
}
