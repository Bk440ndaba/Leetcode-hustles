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
        ArrayList<String> uncategorised = new ArrayList<>();
       Map<String, String> map = new HashMap<>();

        for(int i = 0; i<words.length; i++)
        {
            listOfWords.add(words[i]);
        }
           // System.out.println(listOfWords);     //checking listOfWords


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
        //System.out.println(listOfCategory);    //checking listOfCategories

       for(int k = 0; k<listOfWords.size(); k++)    /// looping through the list of words
       {
            //int counter = 0;
            for(int counter = 0; counter<listOfCategory.size(); counter++)   // also loop through list of category
            {
                boolean categorised = false;   // checks if a word is successfully categorized
                if(listOfWords.get(k).startsWith(listOfCategory.get(counter)))
                {
                    //Map<String, String> map = new HashMap<>();
                   map.put(listOfWords.get(k), listOfCategory.get(counter));
                   categorised = true;
                   break;
                   
                   
                }
                
                if(!categorised)
                {
                    uncategorised.add(listOfWords.get(k));
                }
                  
                
            }
          
       }

       System.out.println(map);
       System.out.println(uncategorised);
      // String cate = map.get(listOfWords.get(k));
       //System.out.println(cate);


        
    }
}
