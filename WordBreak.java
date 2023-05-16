import java.util.*;
import java.io.*;

public class WordBreak {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string s: ");

        String s = sc.nextLine();

        System.out.println("Enter your worddict: ");
        String word = sc.nextLine();
       // String [] splitWord = word.split(",");

       // String joinedWord = String.join("", splitWord);

        //System.out.println(joinedWord);
        if(word.contains(","))
        {
            String joinedWord = word.replace(",", "");
            boolean contain = true;
            if(s.contains(joinedWord) || s.equals(joinedWord))
            {
                System.out.println("Returns true because " + s + " can be segmented as " + word);
            }

            else{
                    
                    contain = false;
                    System.out.println(contain);
            }
        }

        

    }
}
