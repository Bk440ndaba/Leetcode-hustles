import java.util.*;
import java.io.*;

public class reading {
    public static void main(String [] args)
    {
        Scanner file = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of file: ");
        String filename = sc.nextLine();

        try {
            file = new Scanner(new FileInputStream(filename));
        } catch (Exception e) 
            {
            // TODO: handle exception
            System.out.println("Sorry, file not found.");
            e.printStackTrace();
             }

             String line;
             ArrayList<String> arr = new ArrayList<>();
             while(file.hasNextLine())
             {
                line = file.nextLine();
                arr.add(line);
             }
             for(String i: arr)
             {
                 System.out.println(i);
             }
    }

}
