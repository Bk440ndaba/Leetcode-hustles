import java.util.*;

public class Largest {
    public static void main (String [] args)
    {
        int []  nums = {1, 30, 500, 40, 8, 9, 11, 60, 6, 4, 9, 30, 5, 8987};
        
        

        String [] numbers = new String[nums.length];
        ArrayList<String> arr = new ArrayList<>();
        String [] s = new String[nums.length];
        

        for(int i = 0; i<nums.length; i++)
        {
            numbers[i] = Integer.toString(nums[i]);
           
            
        } // we now have an array of strings 

       /*  Checking length of every element in arry
         * if length > 1, we need to split the element 
         * and then add all elements of length 1 to an array of Chars  */
         
         
         
        
         for(int k = 0; k<numbers.length; k++)
         {
           if(numbers[k].length() > 1)
           {
            
                s = numbers[k].split("");
           }
           else
           {

            arr.add(numbers[k]);
           }
         }

         System.out.println(arr);  

         for(int m = 0; m<s.length; m++)
         {
            System.out.println(s[2]);
         }

         System.out.println(s.length);
         
      
    }

}   

/* 
            String element = numbers[k];
            if(element.length() != 1)
            {

            }
            else
            {
                
            } */
