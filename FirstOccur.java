/*This is a program  that finds the first occurance of a string in another string
 */

import java.util.*;


public class FirstOccur {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your haystack: ");   
        String haystack = sc.nextLine(); // this is the haystack string, container for the substring we need



        System.out.println("Enter your needle: ");
        String needle = sc.nextLine();  // the substring we are looking for in the haystack



    if(haystack.contains(needle))
    {
        
        int x = haystack.indexOf(needle);
        int y = haystack.lastIndexOf(needle);
        System.out.println("Output " + x);
        System.out.println("Explanation: " + needle + " occurs at index " + x + " and " + y );
        System.out.println("The first occurance is at index " + x + ", so return " + x);
        
    }
    else{
        System.out.println("Output: -1");
        System.out.println("Explanation: " + needle + " did not occur in " + haystack + " so we return -1");
        
    }


    }
    
}
