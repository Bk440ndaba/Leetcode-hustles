import java.io.*;
import java.util.*;

public class Order {
   public static void main(String [] args) 
   {
        Scanner file = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the word lists text file: ");
        String filename = sc.nextLine();

        try {
            file = new Scanner(new FileInputStream(filename));

        } catch (Exception e) {
            System.out.println("Sorry, file not found.");
        }

        String line;
        ArrayList<String []> list = new ArrayList<>();
        ArrayList<String> container = new ArrayList<>();
        
        while(file.hasNextLine())
        {
            line = file.nextLine();
             String [] arr = line.split(",");
             list.add(arr);
             //System.out.println(Arrays.toString(arr));
        }

        file.close();
        for (String[] arr : list) // loop through arraylist
         {  
            int maxLength = 1; // Minimum length is 1
            int currentLength = 1;
            for(int i = 1; i<arr.length; i++)   // loop through the array
            {
                if(arr[i].compareTo(arr[i - 1]) >= 0) 
                {
                   
                    //container.add(arr[i]);
                    currentLength++;
                    //System.out.println("Longest is " + container.size());
                }
                else
                {
                    //System.out.println("Done");
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                    }
                    currentLength = 1;
                }
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }

            System.out.println("Longest subsequence length: " + maxLength);
        }
        
   
        

   }
}
