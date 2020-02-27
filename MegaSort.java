import java.util.*;
import java.io.*;

public class MegaSort {
    /**
     * marges list of integers and prints them
     * @param args file name values for merge sort
     * @throws Exception error occured opening file
     */
    public static void main(String[] args) throws Exception {
        MegaSorter array = new MegaSorter();
        try {
            File text = new File(args[0]);
            Scanner scan = new Scanner(text);
            while(scan.hasNextLine()){ 
                String digit = scan.nextLine();
                int number = Integer.parseInt( digit );
                array.decider(number);
            }
            array.together();
            array.printer();
        }
        catch (FileNotFoundException e){
            System.out.println("file not found exception");
        }
        // catch (Exception e){
        //      System.out.println("exception");
        // }
    }
}