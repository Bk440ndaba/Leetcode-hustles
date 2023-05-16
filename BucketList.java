import java.util.*;
import java.io.*;

public class BucketList {
    public static void main(String [] args)
    {
        Scanner file = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the categories file: ");
        String filename = sc.nextLine();

        System.out.println("Enter a comma-separated list of words: ");
        String string = sc.nextLine();
        String [] words = string.split(",");
        ArrayList<String> listOfWords = new ArrayList<>();
        for(int i = 0; i<words.length; i++)
        {
            listOfWords.add(words[i]);
        }
            System.out.println(listOfWords);


        try 
        {
          file = new Scanner(new FileInputStream(filename));
            
        } catch (Exception e){
            
            System.out.println("Sorry, file not found.");
            e.printStackTrace();
            System.exit(0);
        }

        String line;
        
        ArrayList<String> listOfCategory = new ArrayList<>();
        while(file.hasNextLine())
        {
            line = file.nextLine();
            //System.out.println(line);
            listOfCategory.add(line);

        }
        System.out.println(listOfCategory);


        
    }
}
