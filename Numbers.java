// for this example, input circles.txt for the file name 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        
        Scanner file = null; 
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the name of the cards file:");
        String fileName = input.nextLine(); 

        try {
            file = new Scanner(new FileInputStream(fileName)); 
        }
        catch(FileNotFoundException e){
            System.out.println("Error while reading in file");
            System.exit(0);
        }

        /*
         * For this example, we will convert each line from the file in individual int arrays;
         * This may be need in the case of the Enclosing Circles question posted on the group
         * Now you will need to store each of the lines as the int arrays, one suggested easy way 
         * to achieve this is using an arraylist, as you do not need to know how many lines there 
         * are
        */

        ArrayList<int[]> list = new ArrayList<>();

        String line;
        while (file.hasNextLine()){
            line = file.nextLine();  // Get the line

            String[] toStrArr = line.split(" ");   // Separate it with the appropriate separator
            // String [] toStrArr = line.split("/") // Uncomment this line when using the dates.txt file
            int[] intValues = new int[toStrArr.length];

            // This loop will convert each string in the array to an integer and put it
            // in the int array. Notice the use of the wrapper class 
            for (int index = 0; index < intValues.length; index++) {
                intValues[index] = Integer.parseInt(toStrArr[index]);
            }

            // now that we have converted the line to an int[], it can be added to the collection
            list.add(intValues);
        }
        
            for(int[] i: list)
            {
                System.out.println(i);
            }

        // 'list' now has all the lines as int[] that you can loop through and manipulate as needed
    }
}

